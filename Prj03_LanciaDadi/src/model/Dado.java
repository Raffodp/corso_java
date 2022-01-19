package model;

public class Dado {


		int facce = 6;
		
		public int lancia() {
			//1,2,3,4,5,6
			//int 32bit
			//double 64bit
			//CAST forzare una variabile
			//dato che math.random ci da un double(numero con virgola ma 
			//a noi serve un intero possiamo forzare a darci un intero con un CAST
			int casuale = (int)(Math.random() * facce) + 1;
			return casuale;
		}

	}

