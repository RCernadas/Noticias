package com.curso.consulta;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Consulta {

	public static <T> void hacerSelectConParamaetros(String query, Class<T> clase, String valorParametro, String... parametros) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("noticias");
		EntityManager em = emf.createEntityManager();

		TypedQuery<T> consulta = em.createNamedQuery(query, clase);

		
		
		for(int i = 0; i<parametros.length; i++) {
			consulta.setParameter(parametros[i], valorParametro);
		}
		List<T> lista = consulta.getResultList();
		
		for (T unaInstanciaDeLaClase : lista) {
			System.out.println(unaInstanciaDeLaClase);
		}

	}
}
