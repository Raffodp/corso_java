package controller;

import java.util.ArrayList;
import java.util.List;

import model.Contatto;
import model.ContattoLavoro;

public class RubricaCtrl {
	
	private List<Contatto> contatti;
	
	public RubricaCtrl() {
		
		this.contatti = new ArrayList<>();
	}
	
	public void addContatto(String nome, String numero) {
		
		Contatto c = new Contatto(nome, numero);
		this.contatti.add(c);
		System.out.println("Contatto aggiunto con successo!: "+ c);
		
	}

		public void addContatto(String nome, String numero, String azienda) {
			
			Contatto c = new ContattoLavoro(nome, numero, azienda);
			this.contatti.add(c);
			System.out.println("Contatto Lavoro aggiunto con successo!: "+ c);
		
	}
		public List<Contatto> getContatti() {
			return contatti;
		}
	
		public List<Contatto> getContattiLavoro() {
			List<Contatto>contattiLavoro = new ArrayList<>();
			
			for (Contatto contatto : contatti) {
			    if(contatto instanceof ContattoLavoro)
				contattiLavoro.add(contatto);
			}
			
			return contattiLavoro;
		}

}
