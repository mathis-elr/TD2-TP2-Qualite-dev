package com.meloire.facteurs_premiers;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FacteurPremierTest {

    private final FacteurPremier facteurPremier = new FacteurPremier();

    @Test
    void test1_donne_liste_vide() {
        assertThat(facteurPremier.generate(1)).isEmpty();
    }

    @Test
    void test2_donne_deux() {
        assertThat(facteurPremier.generate(2)).containsExactly(2);
    }

    @Test
    void test3_donne_trois() {
        assertThat(facteurPremier.generate(3)).containsExactly(3);
    }

    @Test
    void test4_donne_deux_et_deux() {
        assertThat(facteurPremier.generate(4)).containsExactly(2, 2);
    }

    @Test
    void test6_donne_deux_et_trois() {
        assertThat(facteurPremier.generate(6)).containsExactly(2, 3);
    }

    @Test
    void test8_donne_deux_et_deux_et_deux() {
        assertThat(facteurPremier.generate(8)).containsExactly(2, 2, 2);
    }

    @Test
    void test9_donne_trois_et_trois() {
        assertThat(facteurPremier.generate(8)).containsExactly(3, 3);
    }
}
