package jaita52_esercizi;

import java.util.Scanner;

public class PietraForbiciCarta {

	public static void main(String[] args) {
		String sceltaUtente = menu();
		String sceltaPC = sceltapc();
		String risultato = valutazione(sceltaUtente, sceltaPC);

		System.out.println(sceltaUtente);
		System.out.println(sceltaPC);
		System.out.println("Il risultato è: " + risultato);

	}

	private static String valutazione(String sceltaUtente, String sceltaPC) {
		
		String res = null;
		
		if (sceltaUtente.equals(sceltaPC)) {
			res = "pareggio";
		} else {
			if (sceltaUtente.equals("s")) {
				if (sceltaPC.equals("f")) {
					res = "vince umano";
				} else {
					res = "vince PC";
				}
			}//fine if
			else 
			if (sceltaUtente.equals("f")) {
				if (sceltaPC.equals("c")) {
					res = "vince umano";
				} else {
					res = "vince PC";
				}
			}//fine if
			else 
			if (sceltaUtente.equals("c")) {
				if (sceltaPC.equals("s")) {
					res = "vince umano";
				} else {
					res = "vince PC";
				}
			}//fine if
			
		}
		return res;
	}

	private static String sceltapc() {

		String risposta = null;

		double casuale = Math.random();

		if (casuale < 0.3333) {
			risposta = "c";
		} else if (casuale < 0.6666) {

			risposta = "s";
		} else {
			risposta = "f";
		}
		return risposta;
	}

	private static String menu() {
		System.out.println("Scegli tra Carta, forbici, Sasso");
		System.out.println("c: carta");
		System.out.println("s: sasso");
		System.out.println("f: forbici");

		Scanner sc = new Scanner(System.in);

		String sceltaUtente = sc.next();
		return sceltaUtente;
	}

}
