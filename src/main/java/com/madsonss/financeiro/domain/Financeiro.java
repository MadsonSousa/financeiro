package com.madsonss.financeiro.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Financeiro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_financeiro")
	private Integer id;
	private Date dtLancamento;
	private Date dtDocumento;
	private Date dtVencimento;
	private Date dtPagamento;
	private String descricao;
	@ManyToOne
	@JoinColumn(name="id_categoria", nullable=false)
	private Categoria categoria;
	@ManyToOne
	@JoinColumn(name="id_forma_pagamento", nullable=false)
	private FormaPagamento formaPagamento;
	private Double valor;
	
	public Financeiro() {
	}

	public Financeiro(Integer id, Date dtLancamento, Date dtDocumento, Date dtVencimento, Date dtPagamento, String descricao, Double valor,
			Categoria categoria, FormaPagamento formaPagamento) {
		super();
		this.id = id;
		this.dtLancamento = dtLancamento;
		this.dtDocumento = dtDocumento;
		this.dtVencimento = dtVencimento;
		this.dtPagamento = dtPagamento;
		this.descricao = descricao;
		this.valor = valor;
		this.categoria = categoria;
		this.formaPagamento = formaPagamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDt_lancamento() {
		return dtLancamento;
	}

	public void setDt_lancamento(Date dtLancamento) {
		this.dtLancamento = dtLancamento;
	}

	public Date getDt_documento() {
		return dtDocumento;
	}

	public void setDt_documento(Date dtDocumento) {
		this.dtDocumento = dtDocumento;
	}

	public Date getDt_vencimento() {
		return dtVencimento;
	}

	public void setDt_vencimento(Date dtVencimento) {
		this.dtVencimento = dtVencimento;
	}

	public Date getDt_pagamento() {
		return dtPagamento;
	}

	public void setDt_pagamento(Date dtPagamento) {
		this.dtPagamento = dtPagamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Financeiro other = (Financeiro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
