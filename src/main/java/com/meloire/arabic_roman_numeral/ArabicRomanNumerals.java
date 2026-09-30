package com.meloire.arabic_roman_numeral;

public class ArabicRomanNumerals {
    private static final int[] VALEURS = {50, 40, 10, 9, 5, 4, 1};
    private static final String[] SYMBOLES = {"L", "XL", "X", "IX", "V", "IV", "I"};

    public static String convert(int nbr) {
        StringBuilder resultat = new StringBuilder();

        for (int i = 0; i < VALEURS.length; i++) {
            while (nbr >= VALEURS[i]) {
                resultat.append(SYMBOLES[i]);
                nbr -= VALEURS[i];
            }
        }

        return resultat.toString();
    }
}
