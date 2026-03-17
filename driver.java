package oopKaart;

public class driver {

	public static void main(String[] args) {
		OvKaart kaart1 = new OvKaart(2, 9.00);
		kaartLezer paal = new kaartLezer(5.00);
		kaartLezer tweedePaal = new kaartLezer(5.00);
		paal.inchecken(kaart1);
		tweedePaal.inchecken(kaart1);
	}

}
