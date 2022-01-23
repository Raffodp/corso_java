package control;

import java.util.ArrayList;
import java.util.List;

import model.ColonninaElettrica;
import model.Distributore;
import model.DistributoreGas;

public class DistributoreCtrl {

	private List<Distributore> distributori;

	public DistributoreCtrl() {

		this.distributori = new ArrayList<>();
	}

	public void addDistributore(String Azip, String indirizzoDistributore, int capBenzina, int capDiesel) {
		Distributore d = new Distributore("Azip", "Via rossi 15", capBenzina, capDiesel);
		this.distributori.add(d);
	 	System.out.println(d);
	}

	public void addDistributoreGas(String nomeDistributore, String indirizzoDistributore, int capBenzina, int capDiesel,
			int capGas) {

		Distributore d = new DistributoreGas("Azip", "Via rossi 15", capBenzina, capDiesel, capGas);
		this.distributori.add(d);
		System.out.println(d);
	}
	public void addColonninaElettrica(String nomeDistributore, String indirizzoDistributore, int capBenzina, int capDiesel,
			int capGas, double kwRicarica) {
		
		Distributore d = new ColonninaElettrica ("Azip", "Via rossi 15", capBenzina, capDiesel, capGas, kwRicarica);
		this.distributori.add(d);
		System.out.println(d);
	}
	
	public List<Distributore> getDistributori() {
		return distributori;
	}

	public List<Distributore> getDistributoreGas() {
		List<Distributore> distributoreGas = new ArrayList<Distributore>();
		
		for (Distributore distributore : distributori) {
			if(distributore instanceof DistributoreGas)
				distributoreGas.add(distributore);
		}
		return distributoreGas;
	}
		
		public List<Distributore> getColonninaElettrica() {
			List<Distributore> colonninaElettrica = new ArrayList<Distributore>();
			
			for (Distributore distributore : distributori) {
				if(distributore instanceof ColonninaElettrica)
					colonninaElettrica.add(distributore);
			}
			return colonninaElettrica;
	
	}
}
