package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void bloedsinnstest () {
       // GIVEN
        int number = 1;
        // WHEN
        int actual = Main.wirTesten();
        // THEN
        assertEquals(1, actual);

        // assertTrue(true);

        // mehrere asserts sind möglich
    }

}