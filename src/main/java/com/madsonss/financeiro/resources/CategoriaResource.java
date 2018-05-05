package com.madsonss.financeiro.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.madsonss.financeiro.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Despesas abastecimento");
		Categoria cat2 = new Categoria(2, "Despesas alimentação");
		Categoria cat3 = new Categoria(3, "Despesas cartão de credito");
		
		List<Categoria> list = new ArrayList<>();
		
		list.add(cat1);
		list.add(cat2);
		list.add(cat3);
		return list;
	}

}
