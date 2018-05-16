package com.madsonss.financeiro.domain;

import java.io.Serializable;
import java.util.Date;

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
	private Integer id;
	private Date dt_lancamento;
	private Date dt_documento;
	private Date dt_vencimento;
	private Date dt_pagamento;
	private String descricao;
	@ManyToOne
	@JoinColumn(name="id_categoria")
	private Categoria categoria;
	private Double valor;
	
	public Financeiro() {
	}

	public Financeiro(Integer id, Date dt_lancamento, Date dt_documento, Date dt_vencimento, Date dt_pagamento, String descricao, Double valor,
			Categoria categoria) {
		super();
		this.id = id;
		this.dt_lancamento = dt_lancamento;
		this.dt_documento = dt_documento;
		this.dt_vencimento = dt_vencimento;
		this.dt_pagamento = dt_pagamento;
		this.descricao = descricao;
		this.valor = valor;
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDt_lancamento() {
		return dt_lancamento;
	}

	public void setDt_lancamento(Date dt_lancamento) {
		this.dt_lancamento = dt_lancamento;
	}

	public Date getDt_documento() {
		return dt_documento;
	}

	public void setDt_documento(Date dt_documento) {
		this.dt_documento = dt_documento;
	}

	public Date getDt_vencimento() {
		return dt_vencimento;
	}

	public void setDt_vencimento(Date dt_vencimento) {
		this.dt_vencimento = dt_vencimento;
	}

	public Date getDt_pagamento() {
		return dt_pagamento;
	}

	public void setDt_pagamento(Date dt_pagamento) {
		this.dt_pagamento = dt_pagamento;
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
