package com.curso.dominio;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "noticia")
@NamedQueries({
	@NamedQuery(name="Noticia.buscarPorTitulo", query="SELECT n FROM Noticia n WHERE n.titulo=:titulo")
})
public class Noticia implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String titulo;
	private String campo;
	private Date fecha;
	
	@OneToMany(mappedBy="noticia")
	private List<Comentario> comentarios = new ArrayList<Comentario>();
	
	public Noticia() {
		
	}

	public Noticia(String titulo, String campo, Date fecha) {
		super();
		this.titulo = titulo;
		this.campo = campo;
		this.fecha = fecha;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Noticia [titulo=" + titulo + ", campo=" + campo + ", fecha=" + fecha + "]";
	}
	
	

}
