package com.meloire.facteurs_premiers;

import java.util.ArrayList;

public class FacteurPremier {

    public ArrayList<Integer> generate(int nbre){
        ArrayList<Integer> facteurs = new ArrayList<>();
        int diviseur = 2;
        while (nbre > 1) {
            while (nbre % diviseur == 0) {
                facteurs.add(diviseur);
                nbre /= diviseur;
            }
            diviseur++;
        }
        return facteurs;
    }
}
