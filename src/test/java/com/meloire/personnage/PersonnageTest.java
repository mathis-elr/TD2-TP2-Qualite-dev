package com.meloire.personnage;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonnageTest {

    @Test
    void nouveau_personnage_est_oriente_nord() {
        Personnage personnage = new Personnage();
        assertThat(personnage.getOrientation()).isEqualTo(Orientation.NORD);
    }

    @Test
    void tourner_une_fois_donne_est() {
        Personnage personnage = new Personnage();
        Orientation resultat = personnage.tourner(1);

        assertThat(resultat).isEqualTo(Orientation.EST);
        assertThat(personnage.getOrientation()).isEqualTo(Orientation.EST);
    }

    @Test
    void tourner_deux_fois_donne_sud() {
        Personnage personnage = new Personnage();
        assertThat(personnage.tourner(2)).isEqualTo(Orientation.SUD);
    }

    @Test
    void tourner_trois_fois_donne_ouest() {
        Personnage personnage = new Personnage();
        assertThat(personnage.tourner(3)).isEqualTo(Orientation.OUEST);
    }

    @Test
    void tourner_quatre_fois_fait_un_tour_complet_et_revient_au_nord() {
        Personnage personnage = new Personnage();
        assertThat(personnage.tourner(4)).isEqualTo(Orientation.NORD);
    }
}
