package oopKaart;

public class OvKaart {
	// Variabelen
	private int kaartNummer;
	private double saldo;
	private boolean isIngeCheckt;
	private boolean isKaartGeldig;
	private boolean isUitgeCheckt;

	// Constructor
	public OvKaart(int kaartNummer, double saldo, boolean isKaartGeldig) {
		this.kaartNummer = kaartNummer;
		this.saldo = saldo;
		this.isKaartGeldig = true;

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

	public boolean getisKaartGeldig() {
		return this.isKaartGeldig;

	}

	public void setSaldo(double bedrag) {
		saldo += bedrag;
	}

	// Incheck-locatie support
	private Locatie incheckLocatie;

	public Locatie getIncheckLocatie() {
		return this.incheckLocatie;
	}

	public void setIncheckLocatie(Locatie locatie) {
		this.incheckLocatie = locatie;
	}

	public void uitchecken() {
		this.isIngeCheckt = false;
	}

	public int getKaartnummer() {
		return this.kaartNummer;
	}
}
