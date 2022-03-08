package com.delprete.popolazione.service;

import java.util.List;
import java.util.Set;

import com.delprete.popolazione.entities.PopolazioneRegione;

public interface PopolazioneRegioneService {
	
	List<PopolazioneRegione> getListaRegione();
	List<PopolazioneRegione> getComuniByRegione(String regione);
	PopolazioneRegione getComune(String comune);
	Set<String> getRegioni();
	
}
