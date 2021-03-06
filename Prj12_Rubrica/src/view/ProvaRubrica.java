package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import controller.RubricaCtrl;
import model.Contatto;

public class ProvaRubrica {

	static RubricaCtrl ctrl = new RubricaCtrl();
	static Scanner sc = new Scanner(System.in);
	static PrintWriter printer;

	public static void main(String[] args) {

		boolean gira = true;

		while (gira) {
			String s = leggiInput("Cosa vuoi fare?");

			switch (s) {

			case "add":
				String nome = leggiInput("come si chiama il contatto?");
				String numero = leggiInput("che numero ha il contatto?");
				ctrl.addContatto(nome, numero);
				break;

			case "list":
				for (Contatto c : ctrl.getContatti()) {

					System.out.println(c);
				}
				break;
				
			case "print":
				try {
					printer = new PrintWriter(new File("files/contatti.txt"));
					for (Contatto c : ctrl.getContatti()) {
						printer.println(c);
					}
					printer.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "esci":
				gira = false;
				break;
			}
		}

		// RubricaCtrl ctrl = new RubricaCtrl();

		/*
		 * ctrl.addContatto("Alessio Maida", "3351239992");
		 * ctrl.addContatto("Arianna Alessandro", "334918822");
		 * ctrl.addContatto("Claudio Scagliotti", "338212022", "Apple");
		 * ctrl.addContatto("Domenica La Cava", "33192882221","Microsoft");
		 * ctrl.addContatto("Emanuele Cusimano", "3351249291","Google");
		 * ctrl.addContatto("Emanuele Kumanaku", "3351239992","Porsche");
		 * ctrl.addContatto("Fabio rizzi", "3351239992");
		 * 
		 * for (Contatto c: ctrl.getContatti()) {
		 * 
		 * System.out.println(c); }
		 */

	}

	private static String leggiInput(String domanda) {
		System.out.println(domanda);

		return sc.next();
	}

}
