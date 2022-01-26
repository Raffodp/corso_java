package model;

public class Operazione {
	
	int operatore = 0;
	double operando1;
	double operando2;
	int risultato;
	
	
	public Operazione(double operando1, double operando2, int risultato) {
		super();
		this.operando1 = operando1;
		this.operando2 = operando2;
		this.risultato = risultato;
	}


	public double getOperando1() {
		return operando1;
	}


	public int getRisultato() {
		return risultato;
	}


	public void setRisultato(int risultato) {
		this.risultato = risultato;
	}


	public void setOperando1(double operando1) {
		this.operando1 = operando1;
	}


	public double getOperando2() {
		return operando2;
	}


	public void setOperando2(double operando2) {
		this.operando2 = operando2;
	}
	
	
	

}
