package com.delprete.popolazione.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delprete.popolazione.entities.PopolazioneEta;

@Repository
public interface PopolazioneEtaDAO extends JpaRepository<PopolazioneEta, Integer>{
	
	PopolazioneEta findMaschiAndFemmineByEta(String eta);
	
	List<PopolazioneEta> findByEtaBetween(int min, int max);

}
