package com.delprete.popolazione.service;

import java.util.List;


import com.delprete.popolazione.entities.PopolazioneEta;

public interface PopolazioneEtaService {
	
	PopolazioneEta getGenereByEta(String eta);
	
	List<PopolazioneEta> getIntervalloEta(int min, int max);
	
	List<PopolazioneEta> getAll();
	
}
