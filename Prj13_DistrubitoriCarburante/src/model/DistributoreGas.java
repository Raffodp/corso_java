package model;

public class DistributoreGas extends Distributore {

	private int capGas;

	public DistributoreGas(String nomeDistributore, String indirizzoDistributore, int capBenzina, int capDiesel,
			int capGas) {
		super(nomeDistributore, indirizzoDistributore, capBenzina, capDiesel);

		this.capGas = capGas;

	}

	public int getCapGas() {
		return capGas;
	}

	public void setCapGas(int capGas) {
		this.capGas = capGas;
	}

}
