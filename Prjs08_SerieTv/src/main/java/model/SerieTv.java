package model;

import java.util.ArrayList;
import java.util.List;

public class SerieTv {
	
	private String nome;
	private String genere;
	private String descrizione;
	private List<String> cast;
	

	public SerieTv(String nome, String genere, String descrizione) {
		
		this.nome = nome;
		
		this.genere = genere;
		
		this.descrizione = descrizione;
		
		this.cast = new ArrayList<String>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<String> getCast() {
		return cast;
	}

	public void setCast(List<String> cast) {
		this.cast = cast;
	}

	@Override
	public String toString() {
		return "Serie tv [nome=" + nome + ", genere=" + genere + ", descrizione=" + descrizione + ", cast= " + cast + "]";
	}
	
}
