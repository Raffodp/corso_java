package com.delprete.canzoni.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.delprete.canzoni.model.Prodotto;
import com.delprete.canzoni.model.Utente;
import com.delprete.canzoni.service.CarrelloService;

@SessionAttributes("utente")
@RestController
@RequestMapping("/api")
public class CarrelloREST {

	@Autowired
	CarrelloService srv;
	
	@GetMapping("/carrello")
	public List<Prodotto> getCarrello(Model m, Utente ut) {
		
		return srv.getCarrello(ut.getId());
	}
	
	@PostMapping("/addProdotto")
	public String addProdotto (@RequestParam int id, Utente ut) {
		return srv.addCarrello(ut.getId(), id);
	}
	
	@DeleteMapping("/delProdotto")
	public String delProdotto (@RequestParam int id, Utente ut) {
		return srv.remProdotto(ut.getId(), id);
	}

}
