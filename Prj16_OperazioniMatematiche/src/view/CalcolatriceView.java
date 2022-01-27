package view;

import java.util.Scanner;

import control.operazioneCTRL;
import eccezioni.CalcolatriceException;

public class CalcolatriceView {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		operazioneCTRL operazioneCTRL = new operazioneCTRL();
		operazioneCTRL.init();

		boolean cicla = false;
		while (!cicla) {
			System.out.println("");
			System.out.println(
					"Cosa vuoi fare? \nDigita calc per utilizzare la calcolatrice oppure digita una stringa vuota per uscire");
			String tipoDis = in.next();

			if (tipoDis.equals("calc")) {
				System.out.print("Inserire primo numero : \n");
				double operando1 = nextDouble(in);
				System.out.println("Inserisci operatore :");
				char operatore = nextChar(in);
				System.out.print("Inserire secondo numero : \n");
				double operando2 = nextDouble(in);

				try {
					System.out.println(operazioneCTRL.calcolo(operando1, operando2, operatore));
				} catch (CalcolatriceException e) {
					e.printStackTrace();
					break;
				}
			}
		}
	}

	public static double nextDouble(Scanner in) {
		while (!in.hasNextDouble()) {
			in.next();
			System.out.print("Inserisci un numero intero oppure un numero decimale \n");
		}
		return in.nextDouble();
	}

	public static char nextChar(Scanner in) {
		char result = in.next().charAt(0);
		boolean exit = false;
		while (!exit) {
			switch (result) {
			case '+':
				return result;
			case '-':
				return result;
			case '/':
				return result;
			case '*':
				return result;
			default:
				System.out.print("Inserisci un operatore valido ( + - * / )\n");
				result = in.next().charAt(0);
			}

		}
		return result;
	}

}
