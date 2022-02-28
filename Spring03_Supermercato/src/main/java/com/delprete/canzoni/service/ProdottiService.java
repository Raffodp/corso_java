package com.delprete.canzoni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delprete.canzoni.model.Prodotto;
import com.delprete.canzoni.model.Utente;
import com.delprete.canzoni.repository.ProdottiDb;

@Service
public class ProdottiService {

	@Autowired
	ProdottiDb db;

	public List<Prodotto> getListaProdotti() {

		return db.getAll();
	}

}
