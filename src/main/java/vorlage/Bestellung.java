package vorlage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bestellung {
    private int bestellnummer;
    private Date bestelldatum;
    private List<Gericht> gerichte;
    private Kunde kunde;
    private Kellner kellner;
    private double gesamtbetrag;

    // Konstruktor, Getter und Setter

    public double getGesamtbetrag() {
 
		return gesamtbetrag;
	}

	public void gerichtHinzufuegen(Gericht gericht) {
  
    }

    public void gesamtbetragBerechnen() {
   
    }

	public Bestellung(int bestellnummer, Date bestelldatum, Kunde kunde, Kellner kellner) {
		super();
		this.bestellnummer = bestellnummer;
		this.bestelldatum = bestelldatum;
		this.gerichte = new ArrayList<Gericht>();
		this.kunde = kunde;
		this.kellner = kellner;
	}
}