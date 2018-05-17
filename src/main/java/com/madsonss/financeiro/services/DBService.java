package com.madsonss.financeiro.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madsonss.financeiro.domain.Categoria;
import com.madsonss.financeiro.domain.Financeiro;
import com.madsonss.financeiro.domain.FormaPagamento;
import com.madsonss.financeiro.repositories.CategoriaRepository;
import com.madsonss.financeiro.repositories.FinanceiroRepository;
import com.madsonss.financeiro.repositories.FormaPagamentoRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private FinanceiroRepository financeiroRepository;
	
	@Autowired
	private FormaPagamentoRepository formaPagamentoRepository;
	
	public void instantiateTestDataBase() throws ParseException {
		Categoria cat1 = new Categoria(null, "Despesas");
		Categoria cat2 = new Categoria(null, "Receitas");
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));	
		
		FormaPagamento formaPagto1 = new FormaPagamento(null, "Dinheiro");
		FormaPagamento formaPagto2 = new FormaPagamento(null, "Cartão Crédito");
		FormaPagamento formaPagto3 = new FormaPagamento(null, "Cartão Débito");
		FormaPagamento formaPagto4 = new FormaPagamento(null, "Cheque");
		formaPagamentoRepository.saveAll(Arrays.asList(formaPagto1, formaPagto2, formaPagto3, formaPagto4));

		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		Financeiro finan1 = new Financeiro(null, dt.parse("15/05/2018"), dt.parse("10/05/2018"), dt.parse("30/05/2018"), null, "abastecimento moto", 50.00, cat1, formaPagto3);
		Financeiro finan2 = new Financeiro(null, dt.parse("15/05/2018"), dt.parse("11/05/2018"), dt.parse("15/06/2018"), null, "abastecimento carro", 150.00, cat1, formaPagto2);
		
		Financeiro finan3 = new Financeiro(null, dt.parse("01/05/2018"), dt.parse("01/05/2018"), dt.parse("01/05/2018"), dt.parse("01/05/2018"), "salário", 15000.00, cat2, formaPagto1);
		Financeiro finan4 = new Financeiro(null, dt.parse("15/05/2018"), dt.parse("15/05/2018"), dt.parse("15/05/2018"), dt.parse("15/05/2018"), "mensalidade delícia pasteis", 150.00, cat2, formaPagto4);
		financeiroRepository.saveAll(Arrays.asList(finan1, finan2, finan3, finan4));
	}
}
