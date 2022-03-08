package com.delprete.popolazione.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delprete.popolazione.dal.PopolazioneEtaDAO;
import com.delprete.popolazione.entities.PopolazioneEta;

@Service
public class PopolazioneEtaServiceImpl implements PopolazioneEtaService{
	
	@Autowired
	PopolazioneEtaDAO eDB;

	@Override
	public PopolazioneEta getGenereByEta(String eta) {
		return eDB.findMaschiAndFemmineByEta(eta);
	}

	@Override
	public List<PopolazioneEta> getIntervalloEta(int min, int max) {
		return eDB.findByEtaBetween(min, max);
	}

	@Override
	public List<PopolazioneEta> getAll() {
		return eDB.findAll();
	}

}
