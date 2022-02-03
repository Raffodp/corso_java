package controller;

import java.util.ArrayList;
import java.util.List;

import model.SerieTv;

public class SerieCtrl {

	private List<SerieTv> serie;

	public SerieCtrl() {
		this.serie = new ArrayList<>();
	}

	public void addSerie(String nome, String genere, String descrizione) {

		SerieTv s = new SerieTv(nome, genere, descrizione);

		serie.add(s);
	}

	public List<SerieTv> getSerie() {
		return this.serie;
	}

	public List<SerieTv> getSerieByGenere(String genere) {

		List<SerieTv> serieGenere = new ArrayList<SerieTv>();

		for (SerieTv s : this.serie) {
			if (s.getGenere().equals(genere))
				serieGenere.add(s);
		}
		return serieGenere;
	}
}
