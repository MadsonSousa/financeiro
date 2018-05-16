package com.madsonss.financeiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madsonss.financeiro.domain.Financeiro;

@Repository
public interface FinanceiroRepository extends JpaRepository<Financeiro, Integer> {

}
