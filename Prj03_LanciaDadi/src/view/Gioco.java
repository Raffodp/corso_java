package view;

import model.Dado;

public class Gioco {

	public static void main(String[] args) {

		// vinci se esce una coppia di dadi con lo stesso valore

		// 0,03% delle volte control-shift-F per ordinare

		Dado d1 = new Dado();
		Dado d2 = new Dado();

		final int VOLTE = 1000000;
		int vittorie = 0;
		
		long start = System.currentTimeMillis(); 

		for (int i = 0; i < VOLTE; i++) {

			int res1 = d1.lancia();
			int res2 = d2.lancia();

			//System.out.println("Dado 1: " + res1);
			//System.out.println("Dado 2: " + res2);

			if (res1 == res2) {
				//System.out.println("Hai vinto!");
				vittorie++;
			}
		}//fine ciclo
		long stop = System.currentTimeMillis();
		double percentuale = (double) vittorie / VOLTE;
		//NumberFormat formatter = new DecimalFormat("#0.00");
		
		System.out.println("Hai vinto: " + vittorie);
		System.out.println("Percentuale Vittorie: " + percentuale * 100 + "%");
		System.out.println("l'elaborazione è durata: " +( stop - start) + "ms");

	}

}
