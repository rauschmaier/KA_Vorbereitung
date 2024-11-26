package test;

import org.junit.jupiter.api.Test;

import vorlage.Gericht;

import static org.junit.jupiter.api.Assertions.*;

public class GerichtTest {

    @Test
    public void testValidPrice() {
        Gericht gericht = new Gericht("Pizza Margherita", "Pizza mit Tomaten und Käse", 8.50);
        assertEquals(8.50, gericht.getPreis(), "Der Preis sollte korrekt gesetzt sein");
    }

    @Test
    public void testInvalidPrice() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Gericht("Pizza Margherita", "Pizza mit Tomaten und Käse", 0);
        }, "Es sollte eine Ausnahme geworfen werden, wenn der Preis 0 ist");

        assertThrows(IllegalArgumentException.class, () -> {
            new Gericht("Pizza Margherita", "Pizza mit Tomaten und Käse", -5);
        }, "Es sollte eine Ausnahme geworfen werden, wenn der Preis negativ ist");
    }
}
