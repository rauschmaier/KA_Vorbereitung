package vorlage;

public class Gericht {
    public Gericht(String name, String beschreibung, double preis) {
		super();
		this.name = name;
		this.beschreibung = beschreibung;
		setPreis(preis);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBeschreibung() {
		return beschreibung;
	}
	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
        if (preis <= 0) {
            throw new IllegalArgumentException("Der Preis muss größer als 0 sein.");
        }
        this.preis = preis;
    }
	private String name;
    private String beschreibung;
    private double preis;

    // Konstruktor, Getter und Setter
}