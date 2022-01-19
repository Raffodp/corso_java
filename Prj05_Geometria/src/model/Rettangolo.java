package model;

public class Rettangolo extends FiguraGeometrica {
	
	private Segmento base, altezza;
	
	public Rettangolo(Segmento base, Segmento altezza) {
		
		this.base = base;
		this.altezza = altezza;
	}
	
	public double perimetro() {
		
		return 2* (base.calcoloLunghezza()+ altezza.calcoloLunghezza());
	}
	
	public double area() {
		return base .calcoloLunghezza() * altezza.calcoloLunghezza();
		
	}

}
