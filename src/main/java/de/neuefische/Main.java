package de.neuefische;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        String input = "";

        System.out.println("Bitte geben Sie Ihr Passwort ein: \n");
        while(!"Stop".equals(input)) {
            input = src.nextLine();
        System.out.println(passwordLength(input));
        System.out.println(PWcontainsNumbers(input));
        }
    }

    public static String passwordLength(String passwordPH) {
        int wordLength = passwordPH.length();
        if (wordLength >= 8) {
            return "Das Passwort ist lang genug!";
        } else {
            return "Das Passwort muss mindestens 8 Zeichen lang sein.";
        }
    }


    public static String PWcontainsNumbers(String lengthPH) {
        for (int i = 0; i < lengthPH.length(); ++i) {
            if (Character.isDigit(lengthPH.charAt(i))) {
                return "Super Passwort - mit Zahl und so!";
            }
        }
        return "Das Passwort muss mindestens eine Zahl enthalten!";
    }
}

