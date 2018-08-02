package br.com.livraria.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Livro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String idLivro;
	
	@Column
	private String titulo;
	
	@Column
	private Autor autor;
	
	@Column
	private Editora editora;
	
	@Column
	private Categoria categoria;
	
	@Column
	private String isbn;
	
	@Column
	private String capa;
	
	@Column
	private double preco;

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Livro(String idLivro, String titulo, Autor autor, Editora editora, Categoria categoria, String isbn,
			String capa, double preco) {
		super();
		this.idLivro = idLivro;
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.categoria = categoria;
		this.isbn = isbn;
		this.capa = capa;
		this.preco = preco;
	}

	public String getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(String idLivro) {
		this.idLivro = idLivro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAutor() {
		return autor.getIdAutor();
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getEditora() {
		return editora.getIdEditora();
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public int getCategoria() {
		return categoria.getIdCategoria();
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria; 
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCapa() {
		return capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
	
	
	

}
