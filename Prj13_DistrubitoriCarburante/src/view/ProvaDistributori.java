package view;

import java.util.List;
import java.util.Scanner;
import control.DistributoreCtrl;
import model.ColonninaElettrica;
import model.Distributore;

public class ProvaDistributori {

	public static void main(String[] args) {

		DistributoreCtrl ctrl = new DistributoreCtrl();
		Scanner sc = new Scanner(System.in);

		/*System.out.println("Inserisci un nome per il distributore: ");
		String nomeDistributore = sc.nextLine();
		System.out.println("Inserisci un indirizzo per il distributore: ");
		String indirizzoDistributore = sc.nextLine();
		System.out.println("Qual'è il tipo del distributore?: ");
		String tipoDis = sc.nextLine();

		if (tipoDis.contentEquals("ordinario")) {
			ctrl.addDistributore(nomeDistributore, indirizzoDistributore, 0, 0);

		} else if (tipoDis.contentEquals("gas")) {
			ctrl.addDistributoreGas(nomeDistributore, indirizzoDistributore, 0, 0, 0);

		} else if (tipoDis.contentEquals("elettrico")) {
			ctrl.addColonninaElettrica(nomeDistributore, indirizzoDistributore, 0, 0, 0, 0);
		} */

		boolean cicla = true;

		while (cicla) {
			System.out.println();
			System.out.print("Digita una scelta : ");
			System.out.println();
			System.out.println("a) Aggiungi informazioni distributore");
			System.out.println("b) Rifornimento distributore");
			System.out.println("c) Rifornimento auto");
			System.out.println("d) Esci");
			String sceltaCaricaInfo = sc.nextLine();
			switch (sceltaCaricaInfo) {

			case "a":
				System.out.println("Inserisci un nome per il distributore: ");
				String nomeDistributore = sc.nextLine();
				System.out.println("Inserisci un indirizzo per il distributore: ");
				String indirizzoDistributore = sc.nextLine();
				System.out.println("Qual'è il tipo del distributore? (ordinario, gas, elettrico): ");
				String tipoDis = sc.nextLine();

				if (tipoDis.contentEquals("ordinario")) {
					ctrl.addDistributore(nomeDistributore, indirizzoDistributore, 0, 0);

				} else if (tipoDis.contentEquals("gas")) {
					ctrl.addDistributoreGas(nomeDistributore, indirizzoDistributore, 0, 0, 0);

				} else if (tipoDis.contentEquals("elettrico")) {
					ctrl.addColonninaElettrica(nomeDistributore, indirizzoDistributore, 0, 0, 0, 0);
				}
				break;


				/*System.out.println("Inserisci i litri di Benzina che vuoi caricare");
				int capBenzina = sc.nextInt();
				System.out.println("Inserisci i litri di Diesel che vuoi caricare");
				int capDiesel = sc.nextInt();
				System.out.println("Inserisci i litri di Gas che vuoi caricare");
				int capGas = sc.nextInt();
				ctrl.addDistributore(nomeDistributore, indirizzoDistributore, capBenzina, capDiesel);
				System.out.println(ctrl.getDistributori());*/

			case "b":
				System.out.print("Quale distributore vuoi caricare? ");
				System.out.println();
				System.out.println("1) Ordinario");
				System.out.println("2) Gas");
				System.out.println("3) Elettrico");
				String tipoCarb = sc.nextLine();
				
				if (tipoCarb.contentEquals("1")) {
					int litriBenzina = sc.nextInt();
					int litriDiesel = sc.nextInt();
					int litriGas = sc.nextInt();
					ctrl.addDistributore(nomeDistributore, indirizzoDistributore, litriBenzina, litriDiesel);

				} else if (tipoCarb.contentEquals("2")) {
					int litriBenzina = sc.nextInt();
					int litriDiesel = sc.nextInt();
					int litriGas = sc.nextInt();
					ctrl.addDistributoreGas(nomeDistributore, indirizzoDistributore, litriBenzina, litriDiesel, litriGas);

				} else if (tipoCarb.contentEquals("3")) {
					int litriBenzina = sc.nextInt();
					int litriDiesel = sc.nextInt();
					int litriGas = sc.nextInt();
					double kwCaricati = sc.nextDouble();
					ctrl.addColonninaElettrica(nomeDistributore, indirizzoDistributore, litriBenzina, litriDiesel, litriGas, kwCaricati);
				}
				break;
				
			case "c": System.out.println(ctrl.getDistributori());
				int sceltaUtente3 = sc.nextInt();
				switch (sceltaUtente3) {

				case 1:
					System.out.print("Quanti litri di benzina vuoi caricare?");
					int litriBenzina = sc.nextInt();
					System.out.println(litriBenzina);

					break;

				case 2:
					System.out.print("Quanti litri di diesel vuoi caricare?");
					int litriDiesel = sc.nextInt();
					System.out.println(litriDiesel);

					break;

				case 3:
					break;

				case 4:
					cicla = false;
					break;
				}
			}
		}
	}
}

/*
 * for (Distributore d : ctrl.getDistributori()) { int sceltaUtente =
 * input.nextInt(); boolean quit = false; do {
 * System.out.print("Digita una scelta : "); System.out.println();
 * System.out.println("1) caricoD"); System.out.println("2) boh");
 * System.out.println("3) Esci"); System.out.println();
 * 
 * switch (sceltaUtente) { case 1:
 * System.out.println("Inserisci la somma da prelevare"); int litriErogati =
 * input.nextInt(); d.setCapBenzina(litriErogati);
 * System.out.println(d.getNomeDistributore() + " ha caricato " +
 * d.getCapBenzina()); break;
 * 
 * case 2:
 * 
 * break;
 * 
 * case 3: break;
 * 
 * case 4: System.exit(0);
 * 
 * } } while (!quit); } } }
 */