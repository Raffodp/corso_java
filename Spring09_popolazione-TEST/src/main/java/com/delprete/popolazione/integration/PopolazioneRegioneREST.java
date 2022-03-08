package com.delprete.popolazione.integration;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delprete.popolazione.entities.PopolazioneEta;
import com.delprete.popolazione.entities.PopolazioneRegione;
import com.delprete.popolazione.service.PopolazioneEtaService;
import com.delprete.popolazione.service.PopolazioneRegioneService;

@RestController
@RequestMapping("/api/regione")
public class PopolazioneRegioneREST {
	
	@Autowired
	private PopolazioneRegioneService serv;
	
	@GetMapping
	public Set<String> getRegioni() {
		return serv.getRegioni();
	}
	
	@GetMapping("/{nomeRegione}")
	public List<PopolazioneRegione> getComuni(@PathVariable("nomeRegione") String regione ){
		return serv.getComuniByRegione(regione);
	}
	
	@GetMapping("/{nomeRegione}/{comune}")
	public PopolazioneRegione getComuneByRegione(@PathVariable("comune") String comune){
		return serv.getComune(comune);
	}

}
