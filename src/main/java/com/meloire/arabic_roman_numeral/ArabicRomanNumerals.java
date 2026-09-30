package com.meloire.arabic_roman_numeral;

public class ArabicRomanNumerals {
    public static String convert(int nbr) {
        StringBuilder resultat = new StringBuilder();
        if (nbr >= 5) {
            resultat.append("V");
            nbr -= 5;
        }
        if (nbr == 4) {
            resultat.append("IV");
            nbr -= 4;
        }
        while (nbr >= 1) {
            resultat.append("I");
            nbr -= 1;
        }
        return resultat.toString();
    }
}
