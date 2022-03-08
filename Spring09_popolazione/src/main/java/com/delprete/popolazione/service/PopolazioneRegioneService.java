package com.delprete.popolazione.service;

import java.util.List;
import java.util.Set;

import com.delprete.popolazione.entities.PopolazioneRegione;

public interface PopolazioneRegioneService {
	
	List<PopolazioneRegione> getListaRegione();
	List<String> getListaComuneByRegione(String regione);
	Set<String> getRegione();
}
