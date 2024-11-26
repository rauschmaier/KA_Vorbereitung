package test;

import org.junit.jupiter.api.Test;

import vorlage.Bestellung;
import vorlage.Gericht;
import vorlage.Kellner;
import vorlage.Kunde;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class BestellungTest {

    @Test
    public void testBestellungConstructor() {
        Kunde kunde = new Kunde("Max Mustermann", 1);
        Kellner kellner = new Kellner("Anna Schmidt", 101);
        Bestellung bestellung = new Bestellung(1, new Date(), kunde, kellner);

        assertEquals(1, bestellung.bestellnummer());
        assertNotNull(bestellung.bestelldatum());
        assertEquals(kunde, bestellung.getKunde());
        assertEquals(kellner, bestellung.getKellner());
    }

    @Test
    public void testGerichtHinzufuegen() {
        Gericht gericht = new Gericht("Pizza Margherita", "Pizza mit Tomaten und Käse", 8.50);
        Kunde kunde = new Kunde("Max Mustermann", 1);
        Kellner kellner = new Kellner("Anna Schmidt", 101);
        Bestellung bestellung = new Bestellung(1, new Date(), kunde, kellner);

        bestellung.gerichtHinzufuegen(gericht);
        assertTrue(bestellung.getGerichte().contains(gericht));
    }

    @Test
    public void testGesamtSumme() {
        Gericht gericht1 = new Gericht("Pizza Margherita", "Pizza mit Tomaten und Käse", 8.50);
        Gericht gericht2 = new Gericht("Spaghetti Bolognese", "Pasta mit Fleischsauce", 12.00);
        Kunde kunde = new Kunde("Max Mustermann", 1);
        Kellner kellner = new Kellner("Anna Schmidt", 101);
        Bestellung bestellung = new Bestellung(1, new Date(), kunde, kellner);

        bestellung.gerichtHinzufuegen(gericht1);
        bestellung.gerichtHinzufuegen(gericht2);

        assertEquals(20.50, bestellung.getGesamtbetrag(), 0.01);
    }
}
