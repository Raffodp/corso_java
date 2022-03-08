package com.delprete.popolazione.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.delprete.popolazione.entities.PopolazioneEta;
import com.delprete.popolazione.service.PopolazioneEtaService;

@RestController
@RequestMapping("/api/eta")
public class PopolazioneEtaREST {
	
	@Autowired
	private PopolazioneEtaService servEta;
	
	@GetMapping("/{eta}")
	public PopolazioneEta getGenereByEta(@PathVariable("eta") String eta){
		return servEta.getGenereByEta(eta);
	}
	
	@GetMapping("/intervallo-eta/min/{min}/max/{max}")
	public List<PopolazioneEta> getIntervalloEta(@PathVariable("min")int min, @PathVariable("max") int max){
		return servEta.getIntervalloEta(min, max);
	}
	
	@GetMapping
	public List<PopolazioneEta> getAll(){
		return servEta.getAll();
	}

}
