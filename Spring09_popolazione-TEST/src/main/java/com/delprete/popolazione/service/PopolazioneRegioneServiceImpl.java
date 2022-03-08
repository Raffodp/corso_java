package com.delprete.popolazione.service;

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
	public Set<String> getRegioni() {
		Set<String> nomiRegione = new TreeSet<>();
		for (PopolazioneRegione pir : getListaRegione()) {
			nomiRegione.add(pir.getRegione());

		}
		return nomiRegione;
	}

	@Override
	public List<PopolazioneRegione> getComuniByRegione(String regione) {
		return rep.findByRegione(regione);
	}

	@Override
	public PopolazioneRegione getComune(String comune) {
		return rep.findMaschiAndFemmineByComune(comune);
	}
}
