package model;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private static Database instance;

	private List<Prodotto> listaSpesa;

	private Database() {
		listaSpesa = new ArrayList<>();
		listaSpesa.add(new Prodotto(0, "Banana", 1.00,"Frutta"));
		listaSpesa.add(new Prodotto(1, "Cereali", 2.00 ,"Scaffale"));
		listaSpesa.add(new Prodotto(2, "Carota", 0.70 , "Verdura"));

	}

	public static Database getDatabase() {
		if (instance == null) {
			instance = new Database();

		}
		return instance;
	}

	public List<Prodotto> getLista() {
		return listaSpesa;
	}
}
