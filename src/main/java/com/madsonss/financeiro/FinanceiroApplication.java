package com.madsonss.financeiro;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.madsonss.financeiro.domain.Categoria;
import com.madsonss.financeiro.repositories.CategoriaRepository;

@SpringBootApplication
public class FinanceiroApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(FinanceiroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Categoria cat1 = new Categoria(null, "Despesas");
		Categoria cat2 = new Categoria(null, "Receitas");
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));		
	}
	
}
