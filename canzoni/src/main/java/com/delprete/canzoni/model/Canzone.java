package com.delprete.canzoni.model;

public class Canzone {

	private int Id;
	private String titolo;

	public Canzone() {
	}

	public Canzone(int id, String titolo) {
		super();
		Id = id;
		this.titolo = titolo;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	@Override
	public String toString() {
		return "Canzone [Id=" + Id + ", titolo=" + titolo + "]";
	}

}
