package model;

import eccezioni.CalcolatriceException;

public class Divisione extends Operazione implements Calcolo {

	public Divisione(double operando1, double operando2) {
		super(operando1, operando2,'/');

		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	public Divisione() {
		super(0, 0,'/');
	}

	@Override
	public double operazione() throws CalcolatriceException {
		
		try {
			return super.getOperando1() / super.getOperando2();
        }
        catch (Exception e) {
        throw new CalcolatriceException("non è possibile dividere per zero");
//            System.out.println("Non è possibile dividere per zero");
        }
		
	}
	
	public String toString() {		
		
		try {
			return "Divisione : " + super.getOperando1() + " " +  super.getOperatore() + "  " + super.getOperando2() + " = " + this.operazione();
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
