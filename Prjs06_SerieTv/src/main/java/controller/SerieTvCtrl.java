package controller;

import java.util.ArrayList;
import java.util.List;

import model.SerieTv;

public class SerieTvCtrl {

	private List<SerieTv> serieTv;

	public SerieTvCtrl() {
		this.serieTv = new ArrayList<>();
		serieTv.add(new SerieTv("Scrubs","Drama","Fresh out of medical school, new doctors John \"J.D.\" Dorian, his best friend Christopher Turk, and Elliot Reid start their internship at Sacred Heart Hospital. There, they meet the harsh Chief of Medicine Dr. Bob Kelso, J.D.'s reluctant mentor Dr. Perry Cox, nurse Carla Espinosa, and the deceitful and prankish Janitor."));
		serieTv.add(new SerieTv("The Mandalorian","Science-Fiction","After the stories of Jango and Boba Fett, another warrior emerges in the Star Wars universe. The Mandalorian is set after the fall of the Empire and before the emergence of the First Order. We follow the travails of a lone gunfighter in the outer reaches of the galaxy far from the authority of the New Republic."));
		serieTv.add(new SerieTv("Snowpiercer","Thriller","Snowpiercer is set seven years after the world has become a frozen wasteland, and the remnants of humanity inhabit a gigantic, perpetually moving train that circles the globe. Class warfare, social injustice and the politics of survival are questioned in this riveting television adaptation."));
	}
	
	public void addSerieTv(String nome, String genere, String descrizione) {
		
		SerieTv s = new SerieTv (nome, genere, descrizione);
		
		this.serieTv.add(s);
	}
	public List<SerieTv> getSerieTv(){
		return this.serieTv;
	}
	
	public List<SerieTv> getSerieTvByGenere(String genere) {
		
		List<SerieTv> genereSerie = new ArrayList<SerieTv>();
		
		for (SerieTv s : this.serieTv) {
			if(s.getGenere().equals(genere))
				genereSerie.add(s);
		}
		return genereSerie;
	}
}