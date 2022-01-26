package model;

public class Divisione extends Operazione implements Calcolo {

	public Divisione(double operando1, double operando2) {
		super(operando1, operando2,'/');

		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	public Divisione() {
		super(0, 1,'/');
	}

	@Override
	public double operazione() throws ArithmeticException {
		
		try {
			return super.getOperando1() / super.getOperando2();
        }
        catch (ArithmeticException e) {
            System.out.println("Divided by zero operation cannot be possible");
        }
		
		return 0;
	}
	
	public String toString() {
		return "Divisione : " + super.getOperando1() + " " +  super.getOperatore() + "  " + super.getOperando2() + " = " + this.operazione();
	}

}
