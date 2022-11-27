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
        System.out.println(PWcontainsUppercaseLetters(input));
        System.out.println(badPassword(input));
        }
    }
    // Überprüfe die Länge des Passworts.
    public static String passwordLength(String passwordPH) {
        int wordLength = passwordPH.length();
        if (wordLength >= 8) {
            return "Super Passwort - schön lang!";
        } else {
            return "Das Passwort muss mindestens 8 Zeichen lang sein.";
        }
    }

    // Überprüfe dann, ob Zahlen enthalten sind.
    public static String PWcontainsNumbers(String passwordPH) {
        for (int i = 0; i < passwordPH.length(); ++i) {
            if (Character.isDigit(passwordPH.charAt(i))) {
                return "Super Passwort - mit Zahl und so!";
            }
        }
        return "Das Passwort muss mindestens eine Zahl enthalten!";
    }

    // BONUS 1
    // Checke, ob kleine/große Buchstaben enthalten sind

    public static String PWcontainsUppercaseLetters(String passwordPH) {
        boolean containsUppercase = false;
        boolean containsLowercase = false;
        for(int i=0; i < passwordPH.length(); i++) {
            if (Character.isUpperCase(passwordPH.charAt(i))) {
                containsUppercase = true;
            }
            if (Character.isLowerCase(passwordPH.charAt(i))) {
                containsLowercase = true;
            }
        }
            if(containsUppercase && containsLowercase) {
            return "Super Passwort - inklusive kleinen und großen Buchstaben!";
        }
            if(containsUppercase && !containsLowercase) {
            return "Das Passwort muss auch mindestens einen Kleinbuchstaben enthalten!";
        }
            if(containsLowercase && !containsUppercase) {
            return "Das Passwort muss auch mindestens einen Großbuchstaben enthalten!";
        }

        return "Das Passwort muss mindestens einen kleinen und einen großen Buchstaben enthalten!";

    }


    // BONUS 2
    // Verbiete "schlechte" Passwörter wie "passwort" oder "123456"

    public static String badPassword(String passwordPH) {

        return "Das Passwort ist zu einfach.";
    }


}

