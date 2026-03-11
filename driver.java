package oopKaart;

public class driver {

	public static void main(String[] args) {
		 OvKaart kaart1 = new OvKaart( 2 , 20.00); 
		 kaartLezer paal = new kaartLezer();
		 paal.inckecken(kaart1);
		// Variabelen

		// constructor
		int instruction = 3;
		switch (instruction) {
		default:
			System.out.println("zet hier je kaart");
			break;
		case 1:
			System.out.println("je bent ingecheckt");
			break;
		case 2:
			System.out.println("je bent uigecheckt");
			break;

		}

		// functies

	}

}
