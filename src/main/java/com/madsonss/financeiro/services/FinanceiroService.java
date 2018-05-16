package com.madsonss.financeiro.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madsonss.financeiro.domain.Financeiro;
import com.madsonss.financeiro.repositories.FinanceiroRepository;

@Service
public class FinanceiroService {
	
	@Autowired
	private FinanceiroRepository repo;
	
	public Financeiro find(Integer id) {
		Optional<Financeiro> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
