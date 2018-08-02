package br.com.livraria.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Editora {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idEditora;
	
	@Column
	private String nomeEditora;

	public Editora() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Editora(int idEditora, String nomeEditora) {
		super();
		this.idEditora = idEditora;
		this.nomeEditora = nomeEditora;
	}
	public int getIdEditora() {
		return idEditora;
	}
	public void setIdEditora(int idEditora) {
		this.idEditora = idEditora;
	}
	public String getNomeEditora() {
		return nomeEditora;
	}
	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
	
	

}
