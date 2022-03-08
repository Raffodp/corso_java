package com.delprete.popolazione.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delprete.popolazione.dal.PopolazioneRegioneDAO;
import com.delprete.popolazione.entities.PopolazioneRegione;

@Service
public class PopolazioneRegioneServiceImpl implements PopolazioneRegioneService {

	@Autowired
	private PopolazioneRegioneDAO rep;

	@Override
	public List<PopolazioneRegione> getListaRegione() {
		return this.rep.findAll();
	}

	@Override
	public List<String> getListaComuneByRegione(String regione) {
		List<String> listaComuni = new ArrayList<>();
		for (PopolazioneRegione pr : getListaRegione()) {
		     listaComuni.add(pr.getComune());
		}
		return listaComuni;
	}

	@Override
	public Set<String> getRegione() {
		Set<String> nomiRegione = new TreeSet<>();
		for (PopolazioneRegione pir : getListaRegione()) {
			nomiRegione.add(pir.getRegione());

		}
		return nomiRegione;
	}

}
