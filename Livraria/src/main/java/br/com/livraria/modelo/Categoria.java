package br.com.livraria.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column
	private int idCategoria;
	
	@Column
	private String categoria;
	
	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categoria(int idCategoria, String categoria) {
		super();
		this.idCategoria = idCategoria;
		this.categoria = categoria;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	

}
