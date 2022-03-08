package com.delprete;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.delprete.entities.Prodotto;
import com.delprete.services.ProdottoService;

@SpringBootTest
class MagazzinoApplicationTests {
	
	@Autowired
	private ProdottoService serv;

	@Test
	void contextLoads() {
		
		Prodotto p1 = new Prodotto("latte", 25);
		Prodotto p2 = new Prodotto("biscotti", 55);
		Prodotto p3 = new Prodotto("pane", 15);
		Prodotto p4 = new Prodotto("uova", 21);
		
		serv.addProdotto(p1);
		serv.addProdotto(p2);
		serv.addProdotto(p3);
		serv.addProdotto(p4);
		
	}

}
