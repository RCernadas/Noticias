package com.curso.dominio;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comentario")
public class Comentario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int identificador;
	private String texto;
	private String autor;
	
	@ManyToOne
	@JoinColumn(name="noticia_titulo")
	private Noticia noticia;
	
	
	
	

}
