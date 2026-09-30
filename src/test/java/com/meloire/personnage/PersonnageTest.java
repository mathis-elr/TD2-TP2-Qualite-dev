package com.meloire.personnage;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonnageTest {

    @Test
    void nouveau_personnage_est_oriente_nord() {
        Personnage personnage = new Personnage();
        assertThat(personnage.getOrientation()).isEqualTo(Orientation.NORD);
    }
}
