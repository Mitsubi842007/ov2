package oopKaart;

public class OvKaart {
	// Variabelen
	private int kaartNummer;
	private double saldo;
	private boolean isIngeCheckt;

	// Constructor
	public OvKaart(int kaartNummer, double saldo) {
		this.kaartNummer = kaartNummer;
		this.saldo = saldo;

	}

	// Functies
	public double getSaldo() {
		return this.saldo;
	}

	public boolean getIsIngeCheckt() {
		return this.isIngeCheckt;
	}

	public void inchecken() {
		this.isIngeCheckt = true;

	}
}
