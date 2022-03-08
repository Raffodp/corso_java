package com.delprete.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delprete.entities.Prodotto;

@Repository
public interface ProdottoDAO extends JpaRepository<Prodotto, Integer> {

}
