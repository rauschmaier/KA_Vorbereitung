package test;

import org.junit.jupiter.api.Test;

import vorlage.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class RestaurantTest {

    @Test
    public void testBestellungAufnehmen() {
        Restaurant restaurant = new Restaurant();
        Gericht gericht = new Gericht("Pizza Margherita", "Pizza mit Tomaten und Käse", 8.50);
        Kunde kunde = new Kunde("Max Mustermann", 1);
        Kellner kellner = new Kellner("Anna Schmidt", 101);
        Bestellung bestellung = new Bestellung(1, new Date(), kunde, kellner);

        bestellung.gerichtHinzufuegen(gericht);
        restaurant.bestellungAufnehmen(bestellung);

        assertTrue(restaurant.getBestellungen().contains(bestellung));
    }

    @Test
    public void testBestellungEntfernen() {
        Restaurant restaurant = new Restaurant();
        Gericht gericht = new Gericht("Pizza Margherita", "Pizza mit Tomaten und Käse", 8.50);
        Kunde kunde = new Kunde("Max Mustermann", 1);
        Kellner kellner = new Kellner("Anna Schmidt", 101);
        Bestellung bestellung = new Bestellung(1, new Date(), kunde, kellner);

        bestellung.gerichtHinzufuegen(gericht);
        restaurant.bestellungAufnehmen(bestellung);
        restaurant.bestellungEntfernen(bestellung);

        assertFalse(restaurant.getBestellungen().contains(bestellung));
    }
}
