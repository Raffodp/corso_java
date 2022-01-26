package model;

public class Divisione extends Operazione implements Calcolo {

	public Divisione(double operando1, double operando2) {
		super(operando1, operando2);
		
		this.operando1=operando1;
		this.operando2=operando2;
	}

	@Override
	public int getCalcolo() {
		return 0;
	}

}
