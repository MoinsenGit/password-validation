package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // Überprüfe erst die Länge des Passworts und
    @Test
    void passwordIsLongEnough() {
        // GIVEN
        String password = "meinsicheresPassWort";
        // WHEN
        String actual = Main.passwordLength(password);
        // THEN
        assertEquals("Das Passwort ist lang genug!", actual);

        // assertTrue(true); // mehrere asserts sind möglich
    }

    // Überprüfe, ob Zahlen enthalten sind
    @Test
    void passwordIsNotLongEnough() {
        // GIVEN
        String password = "toshort";
        // WHEN
        String actual = Main.passwordLength(password);
        // THEN
        assertEquals("Das Passwort muss mindestens 8 Zeichen lang sein.", actual);

    }
     @Test
    void passwordContainsNumbers() {
        // GIVEN
        String password = "hasNumbers245";
        // WHEN
        String actual = Main.PWcontainsNumbers(password);
        // THEN
        assertEquals("Super Passwort - mit Zahl und so!", actual);

    }
     @Test
    void passwordContainsNoNumbers() {
        // GIVEN
        String password = "nonumbers";
        // WHEN
        String actual = Main.PWcontainsNumbers(password);
        // THEN
        assertEquals("Das Passwort muss mindestens eine Zahl enthalten!", actual);

    }



}