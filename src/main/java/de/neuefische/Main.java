package de.neuefische;

public class Main {
    public static void main(String[] args) {

       //  passwordValidation("nichtsic");
        System.out.println(passwordValidation("nicht"));
    }


    public static String passwordValidation(String passwordPH) {
        int wordLength = passwordPH.length();
        if (wordLength >= 8) {
        return "Das Passwort ist lang genug!";
    }
        else {
            return "Das Passwort muss mindestens 8 Zeichen lang sein.";
        }
}
}