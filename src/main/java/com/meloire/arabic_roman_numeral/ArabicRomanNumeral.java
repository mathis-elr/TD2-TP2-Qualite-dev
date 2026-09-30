package com.meloire.arabic_roman_numeral;

public class ArabicRomanNumeral {
    public static String convert(int nbr) {
        StringBuilder resultat = new StringBuilder();
        if (nbr == 4) {
            return "IV";
        }
        while (nbr >= 1) {
            resultat.append("I");
            nbr -= 1;
        }
        return resultat.toString();
    }
}
