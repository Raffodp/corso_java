package com.delprete.canzoni.integration;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delprete.canzoni.model.Canzone;

@RestController
@RequestMapping("api/canzoni")
public class CanzoniREST {
	
	@GetMapping
	public List<Canzone> getAll() {
		
		List<Canzone> canzoni = Arrays.asList(
				new Canzone(1, "brividi","Blanco","Blanco"),
				new Canzone(2, "ancora tu","a","b"),
				new Canzone(3, "soldi","c","d"),
				new Canzone(4, "ti stringerò","e","f")
				);
		return canzoni;
	}
	
	
	

}
