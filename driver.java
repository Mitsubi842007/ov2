package oopKaart;

public class driver {

	  public static void main(String[] args) {
	        Locatie nijmegen = new Locatie("Nijmegen",8.0, 8.0);
	        Locatie arnhem = new Locatie("Arnhem", 6.0, 7.0);
	        OvKaart paal1 = new OvKaart(5.00, nijmegen, 0.30);
	        OvKaart paal2 = new OvKaart(5.00, arnhem, 0.30);

	        // Inchecken
	        OvKaart kaart1 = new OvKaart(1001, 50.0, true);
	        paal1.checkIn(kaart1);

	        // Al ingecheckt
	        paal1.checkIn(kaart1);

	        // Verlopen kaart (gesimuleerd)
	        OvKaart kaart2 = new OvKaart(1002, 50.0, false);
	        paal1.checkIn(kaart2);

	        // Onvoldoende saldo
	        OvKaart kaart3 = new OvKaart(1003, 1.0, true);
	        paal1.checkIn(kaart3);

	        // Uitchecken
	        paal2.checkUit(kaart1);

	        // Nog niet ingecheckt
	        OvKaart kaart4 = new OvKaart(1004, 50.0, true);
	        paal2.checkUit(kaart4);
	    }

	}