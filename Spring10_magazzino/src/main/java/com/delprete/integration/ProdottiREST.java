package com.delprete.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delprete.entities.Prodotto;
import com.delprete.services.ProdottoService;

@RestController
@RequestMapping("/api")
public class ProdottiREST {
	
	@Autowired
	private ProdottoService serv;
	
	@GetMapping
	public List<Prodotto> getAll(){
		
		return serv.getProdotti();
	}
	
	@GetMapping("/{id}")
	public Prodotto getProdottoById(@PathVariable int id){
		
		return serv.getProdotto(id);
	}

}
