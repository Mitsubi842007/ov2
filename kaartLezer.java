package oopKaart;

public class kaartLezer {

	// Variabelen
	private double instapTarief;
	private double uitstapTarief;
	// private boolean isSaldoGenoeg;

	// constructor
	public kaartLezer() {
		this.instapTarief = 20;
	}
	public kaartLezer(double uitstapTarief) {
		this.uitstapTarief = uitstapTarief;
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