package oopKaart;

import java.time.LocalDate;

public class driver {

	
	    public static void main(String[] args) {
	        Locatie nijmegen = new Locatie("Nijmegen",8.0, 8.0);
	        Locatie arnhem = new Locatie("Arnhem", 6.0, 7.0);
	        kaartLezer paal1 = new kaartLezer(5.00, nijmegen, 0.30);
	        kaartLezer paal2 = new kaartLezer(5.00, arnhem, 0.30);

	        // Inchecken
	        OvKaart kaart1 = new OvKaart(50.0, LocalDate.of(2027, 1, 1), 1001);
	        paal1.checkIn(kaart1);

	        // Al ingecheckt
	        paal1.checkIn(kaart1);
	        

//	         Verlopen kaart
//	        OvKaart kaart2 = new OvKaart(50.0, LocalDate.of(2022, 1, 1), 1002);
//	        paal1.checkIn(kaart2);
//
//	         Onvoldoende saldo
//	        OvKaart kaart3 = new OvKaart(1.0, LocalDate.of(2027, 1, 1), 1003);
//	        paal1.checkIn(kaart3);

	        //Uitchecken
	        paal2.checkUit(kaart1);

	        // Nog niet ingecheckt
//	        OvKaart kaart4 = new OvKaart(50.0, LocalDate.of(2027,1,1), 1004);
//	        paal2.checkUit(kaart4);
	    }
	}