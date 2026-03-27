package oopKaart;

public class driver {

	public static void main(String[] args) {
		OvKaart kaart1 = new OvKaart(2, 20.00, true);
		kaartLezer paal = new kaartLezer(5.00);
		kaartLezer tweedePaal = new kaartLezer(5.00);
		paal.inchecken(kaart1);
		tweedePaal.inchecken(kaart1);
		
		// als de kaartje geldig is en dan (gebeurtenis)
//		int instruction = 3;
//		switch (instruction) {
//		default: 
//			System.out.println("zet hier je kaart");
//			break;
//		case 1:
//			System.out.println("je bent ingecheckt");
//			break;
//		case 2:
//			System.out.println("je bent uigecheckt");
//			break;
//		}
	}

}
