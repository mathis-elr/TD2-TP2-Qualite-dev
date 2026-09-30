package com.meloire.facteurs_premiers;

import java.util.ArrayList;

public class FacteurPremier {

    public ArrayList<Integer> generate(int nbre){
        ArrayList<Integer> facteurs = new ArrayList<>();
        while (nbre % 2 == 0) {
            facteurs.add(2);
            nbre /= 2;
        }
        if (nbre > 1) {
            facteurs.add(nbre);
        }
        return facteurs;
    }
}
