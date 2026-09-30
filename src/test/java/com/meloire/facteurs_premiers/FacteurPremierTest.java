package com.meloire.facteurs_premiers;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;


public class FacteurPremierTest {

    private final FacteurPremier facteurPremier = new FacteurPremier();

    @Test
    void test1_donne_liste_vide() {
        assertThat(facteurPremier.generate(1)).isEmpty();
    }
}
