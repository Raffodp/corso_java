package Teoria;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.List;

public class Smartphone extends Prodotto {
	
	private String serialNumber;
	private String imiei;
	private String marca;
	private String modello;
	private DisplayMode schermo;
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getImiei() {
		return imiei;
	}
	public void setImiei(String imiei) {
		this.imiei = imiei;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	@Override
	public List<String> getStores() {
		// TODO Auto-generated method stub
		ArrayList<String> tmp = new ArrayList<String>();
		
		tmp.add("negozio1");
		tmp.add("negozio2");
		tmp.add("negozio3");
		tmp.add("negozio4");
		return tmp;
	}
	
	

}
