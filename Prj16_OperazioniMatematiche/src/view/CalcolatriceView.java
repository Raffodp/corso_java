package view;

import java.util.Scanner;

import control.operazioneCTRL;

public class CalcolatriceView {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		boolean exit = false;

		operazioneCTRL operazioneCTRL = new operazioneCTRL();
		operazioneCTRL.init();

		while (!exit) {
			System.out.print("Cosa vuoi fare? \n ok per utilizzare la calcolatrice oppure digita uno spazio vuoto per uscire");
			String esci = in.nextLine();
			if (esci == "") {
				exit = true;
			} else {
				System.out.print("Inserire primo numero : \n");
				double operando1 = nextDouble(in);

				System.out.println("Inserisci operatore :");
				char operatore = nextChar(in);

				System.out.print("Inserire secondo numero : \n");
				double operando2 = nextDouble(in);

				System.out.println(operazioneCTRL.calcolo(operando1, operando2, operatore));

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
