package oopKaart;

public class kaartLezer {

	// Variabelen
	private double instapTarief;
	private double uitstapTarief;
	private Locatie station; 
	// private boolean isSaldoGenoeg;

	// constructor
	public kaartLezer(Locatie station) {
		this.instapTarief = 20;
		this.station = station; 
	}
	public kaartLezer(double uitstapTarief, Locatie station) {
		this.uitstapTarief = uitstapTarief;
		this.station = station;
	}
	// functies

	public void inchecken(OvKaart kaart) {

		if (kaart.getSaldo() > instapTarief) {
			kaart.inchecken();
			System.out.println("genoeg saldo");

		}

		else {
			System.out.println("onvoldoende saldo");
		}

		if (kaart.getisKaartGeldig() == true) {
			System.out.println("je kaart is geldig");
		}

		else {
			System.out.println("kaart is niet geldig");
		}
		System.out.println("je bent ingecheckt");
		kaart.setSaldo(-instapTarief);
		System.out.println("saldo nachecken:" + kaart.getSaldo());

	}

}