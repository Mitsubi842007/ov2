package oopKaart;

public class kaartLezer {
	
	// Variabelen
	private double instapTarief;

	// constructor

	// functies
	
public void inckecken(OvKaart kaart) {
	//als de kaartje geldig is en dan (gebeurtenis)
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
}
}
