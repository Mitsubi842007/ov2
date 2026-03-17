package oopKaart;

public class kaartLezer {

	// Variabelen
	private double instapTarief;
	private boolean isKaartGeldig;
	private boolean isSaldoGenoeg;

	// constructor
	public kaartLezer(double instapTarief) {
		this.instapTarief = instapTarief;
	}
	// functies

	public void inchecken(OvKaart kaart) {
		// als de kaartje geldig is en dan (gebeurtenis)
//	int instruction = 3;
//	switch (instruction) {
//	default: 
//		System.out.println("zet hier je kaart");
//		break;
//	case 1:
//		System.out.println("je bent ingecheckt");
//		break;
//	case 2:
//		System.out.println("je bent uigecheckt");
//		break;
//	}

		if (kaart.getSaldo() > instapTarief) {
			kaart.inchecken();
			System.out.println("is ingecheckt");
		}

		else {
			System.out.println("onvoldoende saldo");
		}

		if (isKaartGeldig = true) {
			System.out.println("je kaart is geldig");
		}

		else {
			System.out.println("kaart is niet geldig");
		}
	}
}
