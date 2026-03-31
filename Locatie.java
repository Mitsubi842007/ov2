package oopKaart;

public class Locatie {

//Variabelen
	private double yPose;
	private double xPose;
	public String locatieNaam;
	public double locatieUitbereken;

	// constructor
	public Locatie(double xPose, double yPose) {
		this.xPose = 3.0;
		this.yPose = 2.0;

	}
	
	public double afstandBerekenen(Locatie eind) {
		
		double afstand =0;
		double a = xPose - eind.xPose;
		double b = yPose - eind.yPose;
		double c = a * a + b * b;
		afstand = Math.sqrt(c);
//		this.xPose;
	//	eind.xPose
		return afstand;
		//A = this x - eind.x 
		//B = this Y - eind.y
		//C = A*A + B*B 
		//D = Math.sqrt (ck);
	}
	
}