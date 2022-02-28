package com.delprete.canzoni.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.delprete.canzoni.model.Canzone;
import com.delprete.canzoni.service.CanzoniService;


@RestController
@RequestMapping("/api")
public class CanzoniREST {

	@Autowired
	CanzoniService srv;
	
	@GetMapping("/canzoni")
	public List<Canzone> getAll(Model m) {
		
		List<Canzone> canzoni = srv.getAll();
		return canzoni;
	}
	
	@PostMapping("/saveCanzone")
	public String salvaModifica (@RequestParam(value = "isUpdate", required = true) boolean isUpdate, 
								 @RequestBody Canzone newCanzone
			){
		
		
		if(srv.salvaModifica(newCanzone, isUpdate)) return "Salvataggio effettuato";
		else return "Errore nel passaggio della richiesta";

		
	}
	
	@DeleteMapping("/deleteCanzone")
	public String deleteCanzone (@RequestParam(value = "id", required = true) int id) {
		
		if(srv.deleteCanzone(id)) return "Cancellazione effettuata";
		else return "Errore durante la cancellazione";
		
	}
	
	public Canzone getCanzone (@PathVariable(value = "id") int id) {
		
		return srv.getOne(id);
	}
	
	
	
	
}
