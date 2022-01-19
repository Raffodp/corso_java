package view;

import java.util.Scanner;

import model.ConcoCorrente;

public class mainConto {

	public static void main(String[] args) {

		ConcoCorrente cliente1 = new ConcoCorrente("Carlo");
		ConcoCorrente cliente2 = new ConcoCorrente("Mattia");
		ConcoCorrente cliente3 = new ConcoCorrente("Giulia");

		Scanner input = new Scanner(System.in);

		//System.out.println("Seleziona l'utente");
		boolean quit = false;
		do {

			System.out.print("Digita una scelta : ");
			System.out.println();
			System.out.println("1) Prelievo");
			System.out.println("2) Versamento");
			System.out.println("3) Saldo");
			System.out.println("4) Esci");
			System.out.println();
			int sceltaUtente = input.nextInt();
			switch (sceltaUtente) {
			case 1:
				System.out.println("Inserisci la somma da prelevare");
				double sommaPrelevare = input.nextDouble();
				cliente1.prelievo(sommaPrelevare);
				break;

			case 2:
				System.out.println("Inserisci la somma da versare");
				double sommaVersare = input.nextDouble();
				cliente1.versamento(sommaVersare);
				break;

			case 3:
				System.out.println(cliente1.getSaldo());
				break;

			case 4:
				System.exit(0);
			}
		} while (!quit);
	}

}
