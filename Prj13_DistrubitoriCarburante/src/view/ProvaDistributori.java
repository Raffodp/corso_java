package view;

import java.util.List;
import java.util.Scanner;
import control.DistributoreCtrl;
import model.ColonninaElettrica;
import model.Distributore;

public class ProvaDistributori {

	public static void main(String[] args) {
		
		List<Distributore> input=leggiInput();

		DistributoreCtrl ctrl = new DistributoreCtrl();
		Scanner sc = new Scanner(System.in);
        
		
		boolean gira = true;

		while (gira) {
			System.out.print("Digita una scelta : ");
			System.out.println();
			System.out.println("1) Carica Distributore");
			System.out.println("2) Rifornimento Auto");
			System.out.println("3) Esci");
			int sceltaUtente1 = sc.nextInt();
			switch (sceltaUtente1) {

			case 1:
				System.out.print("Quale carburante vuoi caricare? Digita una scelta : ");
				System.out.println();
				System.out.println("1) Benzina");
				System.out.println("2) Diesel");
				System.out.println("3) Gas");
				int sceltaUtente2 = sc.nextInt();
				switch (sceltaUtente2) {

				case 1:
					System.out.print("Quanti litri di benzina vuoi caricare?");
					int litriBenzina = sc.nextInt();
					ctrl.addDistributore(null, null, litriBenzina, litriBenzina);
					System.out.println(litriBenzina);

					break;

				case 2:

					break;

				case 3:
					break;

				case 4:
					gira = false;
					break;
				}
			}
		}
	}

	private static List<Distributore> leggiInput() {
		// TODO Auto-generated method stub
		return null;
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