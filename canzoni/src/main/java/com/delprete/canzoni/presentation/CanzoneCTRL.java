package com.delprete.canzoni.presentation;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.delprete.canzoni.model.Canzone;

@Controller
@RequestMapping("/canzoni")
public class CanzoneCTRL {
	
	@GetMapping
	public String getAll(Model m) {
		String titolo = "Le mie canzoni preferite";
		m.addAttribute("titolo", titolo);
		
		List<Canzone> canzoni = Arrays.asList(
				new Canzone(1, "brividi"),
				new Canzone(2, "ancora tu"),
				new Canzone(3, "soldi"),
				new Canzone(4, "ti stringerò")
				);
		
		m.addAttribute("canzoni",canzoni);
		
		return "elenco";
		
	}
	

	@GetMapping("/prova")
	public String getAll2() {
		return "prova";
		
	}

}
