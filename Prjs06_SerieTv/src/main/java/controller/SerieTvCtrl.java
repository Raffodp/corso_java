package controller;

import java.util.ArrayList;
import java.util.List;

import model.SerieTv;

public class SerieTvCtrl {

	private static List<SerieTv> serie;

	public SerieTvCtrl() {
		serie = new ArrayList<>();
	}

	public void addSerieTv(String nome, String genere, String descrizione) {

		SerieTv s = new SerieTv(nome, genere, descrizione);

		serie.add(s);
	}

	public List<SerieTv> getSerieTv() {
		return serie;
	}

	public List<SerieTv> getSerieTvByGenere(String genere) {

		List<SerieTv> genereSerie = new ArrayList<SerieTv>();

		for (SerieTv s : serie) {
			if (s.getGenere().equals(genere))
				genereSerie.add(s);
		}
		return genereSerie;
	}
}