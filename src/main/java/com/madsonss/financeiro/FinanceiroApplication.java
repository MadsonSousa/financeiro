package com.madsonss.financeiro;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.madsonss.financeiro.domain.Categoria;
import com.madsonss.financeiro.domain.Financeiro;
import com.madsonss.financeiro.repositories.CategoriaRepository;
import com.madsonss.financeiro.repositories.FinanceiroRepository;

@SpringBootApplication
public class FinanceiroApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private FinanceiroRepository financeiroRepository;

	public static void main(String[] args) {
		SpringApplication.run(FinanceiroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Despesas");
		Categoria cat2 = new Categoria(null, "Receitas");
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));	
		
		SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
		Financeiro finan1 = new Financeiro(null, dt.parse("15/05/2018"), dt.parse("10/05/2018"), dt.parse("30/05/2018"), null, "abastecimento moto", 50.00, cat1);
		Financeiro finan2 = new Financeiro(null, dt.parse("15/05/2018"), dt.parse("11/05/2018"), dt.parse("15/06/2018"), null, "abastecimento carro", 150.00, cat1);
		
		Financeiro finan3 = new Financeiro(null, dt.parse("01/05/2018"), dt.parse("01/05/2018"), dt.parse("01/05/2018"), dt.parse("01/05/2018"), "salário", 15000.00, cat2);
		Financeiro finan4 = new Financeiro(null, dt.parse("15/05/2018"), dt.parse("15/05/2018"), dt.parse("15/05/2018"), dt.parse("15/05/2018"), "mensalidade delícia pasteis", 150.00, cat2);
		financeiroRepository.saveAll(Arrays.asList(finan1, finan2, finan3, finan4));
	}

}
