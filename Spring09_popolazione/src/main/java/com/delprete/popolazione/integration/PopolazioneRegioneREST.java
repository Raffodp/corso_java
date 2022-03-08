package com.delprete.popolazione.integration;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delprete.popolazione.entities.PopolazioneRegione;
import com.delprete.popolazione.service.PopolazioneRegioneService;

@RestController
@RequestMapping("/api")
public class PopolazioneRegioneREST {
	
	@Autowired
	private PopolazioneRegioneService serv;
	
	@GetMapping
	public List<PopolazioneRegione> getRegioni(){
		return serv.getListaRegione();
	}
	
	@GetMapping("/regione")
	public Set<String> getRegione() {
		return serv.getRegione();
	}
	
	@GetMapping("/regione/{nomeRegione}")
	public List<String> getComune(@PathVariable("nomeRegione") String regione ){
		return serv.getListaComuneByRegione(regione);
	}

}
