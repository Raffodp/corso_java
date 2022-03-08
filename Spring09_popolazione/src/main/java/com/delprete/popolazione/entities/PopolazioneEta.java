package com.delprete.popolazione.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="popolazione_italiana_eta")
public class PopolazioneEta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String eta;
	private int maschi;
	private int femmine;
	private int totale;
	
	
	public PopolazioneEta(int id, String eta, int maschi, int femmine, int totale) {
		super();
		this.id = id;
		this.eta = eta;
		this.maschi = maschi;
		this.femmine = femmine;
		this.totale = totale;
	}
	
	public PopolazioneEta() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}

	public int getMaschi() {
		return maschi;
	}

	public void setMaschi(int maschi) {
		this.maschi = maschi;
	}

	public int getFemmine() {
		return femmine;
	}

	public void setFemmine(int femmine) {
		this.femmine = femmine;
	}

	public int getTotale() {
		return totale;
	}

	public void setTotale(int totale) {
		this.totale = totale;
	}
	
	
	
	
	
	
	

}
