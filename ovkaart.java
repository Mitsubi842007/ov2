package oopKaart;
import java.time.LocalDate;
public class OvKaart {
	
	    // Variabelen
	    private int kaartNummer;
	    private double saldo;
	    private LocalDate vervalDatum;
	    private boolean isIngeCheckt;
	    private boolean isKaartGeldig;

	    // Incheck-locatie support
	    private oopKaart.Locatie incheckLocatie;

	    // Constructor (existing style used in driver)
	    public OvKaart(int kaartNummer, double saldo, boolean isKaartGeldig) {
	        this.kaartNummer = kaartNummer;
	        this.saldo = saldo;
	        this.isKaartGeldig = isKaartGeldig;
	    }

	    // Alternative constructor (matches Kaart(double, LocalDate, int))
	    public OvKaart(double saldo, LocalDate geldig, int kaartnummer) {
	        this.kaartNummer = kaartnummer;
	        this.saldo = saldo;
	        this.vervalDatum = geldig;
	        // kaart is geldig wanneer vervaldatum in de toekomst of niet gezet
	        this.isKaartGeldig = (geldig == null) || !geldig.isBefore(LocalDate.now());
	    }

	    // Functies
	    public double getSaldo() { return this.saldo; }

	    public void setSaldo(double bedrag) { this.saldo += bedrag; }

	    // Backwards-compatible check-status accessors
	    public boolean getIsIngeCheckt() { return this.isIngeCheckt; }
	    public boolean isIngecheckt() { return this.isIngeCheckt; }
	    public void setIngecheckt(boolean ingecheckt) { this.isIngeCheckt = ingecheckt; }

	    public void inchecken() { this.isIngeCheckt = true; }
	    public void uitchecken() { this.isIngeCheckt = false; }

	    public boolean getisKaartGeldig() { return this.isKaartGeldig; }
	    public LocalDate getVervalDatum() { return this.vervalDatum; }

	    // Incheck-locatie support
	    public oopKaart.Locatie getIncheckLocatie() { return this.incheckLocatie; }
	    public void setIncheckLocatie(oopKaart.Locatie locatie) { this.incheckLocatie = locatie; }

	    public int getKaartnummer() { return this.kaartNummer; }
	}