package model;

public class Somma extends Operazione implements Calcolo {
	
	
	public Somma(double operando1, double operando2, int risultato) {
		super(operando1, operando2, risultato);
		
		this.operando1=operando1;
		this.operando2=operando2;
		this.risultato=risultato;
	}

	@Override
	public int getCalcolo() {
		return 0;
	}
}
