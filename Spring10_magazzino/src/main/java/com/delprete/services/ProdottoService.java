package com.delprete.services;

import java.util.List;

import com.delprete.entities.Prodotto;

public interface ProdottoService {
	
	void addProdotto(Prodotto p);
	void updProdotto(Prodotto p);
	void delProdotto(int id);
	
	Prodotto getProdotto(int id);
	List<Prodotto> getProdotti();

}
