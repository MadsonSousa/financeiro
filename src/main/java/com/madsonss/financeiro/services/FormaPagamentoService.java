package com.madsonss.financeiro.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madsonss.financeiro.domain.FormaPagamento;
import com.madsonss.financeiro.repositories.FormaPagamentoRepository;

@Service
public class FormaPagamentoService {

	@Autowired
	private FormaPagamentoRepository repo;
	
	public FormaPagamento find(Integer id) {
		Optional<FormaPagamento> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
