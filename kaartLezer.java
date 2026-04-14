package oopKaart;

public class kaartLezer {

	// Variabelen
    private double instapTarief;
    private double uitstapTarief;
    private oopKaart.Locatie station;
    // private boolean isSaldoGenoeg;

    // constructor
    public kaartLezer(oopKaart.Locatie station) {
        this.instapTarief = 20;
        this.station = station;
    }
    public kaartLezer(double uitstapTarief, oopKaart.Locatie station) {
        this.uitstapTarief = uitstapTarief;
        this.station = station;
    }
    // functies

    public void inchecken(oopKaart.OvKaart kaart) {

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

    public double getUitstapTarief()
    {
        return uitstapTarief;
    }

    public void setUitstapTarief(double uitstapTarief)
    {
        this.uitstapTarief = uitstapTarief;
    }
}

class Paal
{
    private double instaptarief;
    private oopKaart.Locatie locatie;
    private double prijsPerKm;

    public Paal(double instaptarief, oopKaart.Locatie locatie, double prijsPerKm)
    {
        this.instaptarief = instaptarief;
        this.locatie = locatie;
        this.prijsPerKm = prijsPerKm;
    }

    public void checkIn(oopKaart.OvKaart kaart)
    {
        if (kaart.getIsIngeCheckt())
        {
            System.out.println("Kaart is al ingecheckt.");
            System.out.println();
            return;
        }
        if (kaart.getSaldo() < instaptarief)
        {
            System.out.println("Kaart heeft onvoldoende saldo.");
            System.out.println("Je saldo is: " + kaart.getSaldo());
            System.out.println();
            return;
        }
        else
        {
            String naam = (this.locatie.getNaam() != null && !this.locatie.getNaam().isEmpty()) ? this.locatie.getNaam() : "station";
            System.out.println("Kaart is ingecheckt in " + naam);
            System.out.println("Je saldo is: " + kaart.getSaldo());
            System.out.println();
            kaart.setIncheckLocatie(this.locatie);
            kaart.inchecken();
            kaart.setSaldo(-instaptarief);
        }
    }

    public void checkUit(oopKaart.OvKaart kaart)
    {
        if (!kaart.getIsIngeCheckt())
        {
            System.out.println("Kaart is niet ingecheckt.");
            System.out.println();
            return;
        }
        else
        {
            String naam = (this.locatie.getNaam() != null && !this.locatie.getNaam().isEmpty()) ? this.locatie.getNaam() : "station";
            System.out.println("Kaart is uitgecheckt in " + naam);
            oopKaart.Locatie start = kaart.getIncheckLocatie();

            double afstand = 0;
            if (start != null)
            {
                afstand = start.afstandBerekenen(this.locatie);
            }
            double kosten = (afstand * 10) * this.prijsPerKm;
            kaart.setSaldo(-kosten);
            kaart.setIncheckLocatie(null);
            System.out.println("Je saldo is: " + kaart.getSaldo());
            System.out.println();
            kaart.uitchecken();
        }
    }
}
