package com.delprete.popolazione.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delprete.popolazione.entities.PopolazioneRegione;

@Repository
public interface PopolazioneRegioneDAO extends JpaRepository<PopolazioneRegione, Integer> {
	
	List<PopolazioneRegione> findByRegione(String regione);

}
