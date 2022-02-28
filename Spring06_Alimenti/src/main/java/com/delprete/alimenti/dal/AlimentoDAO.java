package com.delprete.alimenti.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delprete.alimenti.entities.Alimento;

@Repository
public interface AlimentoDAO extends JpaRepository<Alimento, Integer> {
	
	List<Alimento> findByCategoria(String categoria);
	//List<String> findDistinctByCategoria();

}
