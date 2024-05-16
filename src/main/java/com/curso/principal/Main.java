package com.curso.principal;

import com.curso.consulta.Consulta;
import com.curso.dominio.Noticia;

public class Main {
	
	public static void main(String[] args) {
		Consulta.hacerSelectConParamaetros("Noticia.buscarPorTitulo", Noticia.class, "Noticia 1", "titulo");
	}

}
