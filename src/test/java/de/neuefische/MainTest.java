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
        assertEquals("Super Passwort - schön lang!", actual);

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

    // BONUS 1
    // Checke, ob kleine/große Buchstaben enthalten sind

    @Test
    void passwordContainsNoUppercaseLetters() {
        // GIVEN
        String password = "passwordwithnoppercase";
        // WHEN
        String actual = Main.PWcontainsUppercaseLetters(password);
        // THEN
        assertEquals("Das Passwort soll mindestens einen großen Buchstaben enthalten!", actual);
    }
    @Test
    void passwordContainsUppercaseLetters() {
        // GIVEN
        String password = "passwordContainsUppercase";
        // WHEN
        String actual = Main.PWcontainsUppercaseLetters(password);
        // THEN
        assertEquals("Super Passwort - inklusive großen Buchstaben!", actual);

    }

    // BONUS 2
    // Verbiete "schlechte" Passwörter wie "passwort" oder "123456"

    @Test
    void passwordIsToEasy() {
        // GIVEN
        String password = "passwort";
        // WHEN
        String actual = Main.badPassword(password);
        // THEN
        assertEquals("Das Passwort ist zu einfach.", actual);

    }





    // Verbiete "schlechte" Passwörter wie "passwort" oder "123456"
    // Schaue dir auf GitHub Labs weitere Einsteigervideos an


}