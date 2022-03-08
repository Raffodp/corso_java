package com.delprete.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delprete.entities.Prodotto;
import com.delprete.repos.ProdottoDAO;

@Service
public class ProdottoServiceImpl implements ProdottoService {

	@Autowired
	private ProdottoDAO rep;
	
	@Override
	public void addProdotto(Prodotto p) {
		rep.save(p);
		
	}

	@Override
	public void updProdotto(Prodotto p) {
		rep.save(p);
		
	}

	@Override
	public void delProdotto(int id) {
		rep.deleteById(id);
		
	}

	@Override
	public Prodotto getProdotto(int id) {
		
		return rep.findById(id).get();  //try catch per verificare se quel prodotto esiste o meno
	}

	@Override
	public List<Prodotto> getProdotti() {
		return rep.findAll();
	}

}
