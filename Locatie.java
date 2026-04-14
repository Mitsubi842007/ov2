package oopKaart;

public class Locatie {

    private String naam;
    private double x;
    private double y;

    // Constructor zonder naam
    public Locatie(double x, double y) {
        this("", x, y);
    }

    // Constructor met naam
    public Locatie(String naam, double x, double y) {
        this.naam = naam;
        this.x = x;
        this.y = y;
    }

    // Getters en setters
    public String getNaam() { return naam; }
    public void setNaam(String naam) { this.naam = naam; }

    public double getX() { return x; }
    public void setX(double x) { this.x = x; }

    public double getY() { return y; }
    public void setY(double y) { this.y = y; }

    // Afstand berekenen tussen twee locaties
    public double afstandBerekenen(Locatie eind) {
        double x = this.x - eind.x;
        double y = this.y - eind.y;
        return Math.sqrt(x * x + y * y);
    }
}