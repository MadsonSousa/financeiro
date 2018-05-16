package com.madsonss.financeiro.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class FormaPagamento implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_forma_pagamento")
	private Integer id;
	private String nome;
	@OneToMany(mappedBy="formaPagamento")
	private List<Financeiro> financeiros;
	
	public FormaPagamento() {		
	}
	
	public FormaPagamento(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Financeiro> getFinanceiros() {
		return financeiros;
	}

	public void setFinanceiros(List<Financeiro> financeiros) {
		this.financeiros = financeiros;
	}
}
