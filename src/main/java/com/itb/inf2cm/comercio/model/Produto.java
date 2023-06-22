package com.itb.inf2cm.comercio.model;

public class Produto {

	private Long id;
	private String nome;
	private String codigoDeBarras;
	private double preco;
	private String descricao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}
	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	//public acesso liberado para todas as classes
	//private: acesso liberado apenas para os membros da propia
	//         classe, ou seja, só é acessado dentro da página.
	
	//Métodos Setter´s -> Ultilizamos para atribuir valor ao atributo 
	//Métodos Getter´s -> Ultilizamos para "recuperar" o valor do atributo
	
	
	
	
}

