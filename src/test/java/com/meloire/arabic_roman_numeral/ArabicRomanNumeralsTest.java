package com.meloire.arabic_roman_numeral;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ArabicRomanNumeralsTest {

    @Test
    void un_donne_I() {
        assertThat(ArabicRomanNumerals.convert(1)).isEqualTo("I");
    }

    @Test
    void deux_donne_II() {
        assertThat(ArabicRomanNumerals.convert(2)).isEqualTo("II");
    }

    @Test
    void trois_donne_III() {
        assertThat(ArabicRomanNumerals.convert(3)).isEqualTo("III");
    }

    @Test
    void quatre_donne_IV() {
        assertThat(ArabicRomanNumerals.convert(4)).isEqualTo("IV");
    }

    @Test
    void six_donne_VI() {
        assertThat(ArabicRomanNumerals.convert(6)).isEqualTo("VI");
    }

    @Test
    void neuf_donne_IX() {
        assertThat(ArabicRomanNumerals.convert(9)).isEqualTo("IX");
    }

    @Test
    void quarante_donne_XL() {
        assertThat(ArabicRomanNumerals.convert(40)).isEqualTo("XL");
    }

    @Test
    void quarante_quatre_donne_XLIV() {
        assertThat(ArabicRomanNumerals.convert(44)).isEqualTo("XLIV");
    }

    @Test
    void zero_leve_une_exception() {
        assertThatThrownBy(() -> ArabicRomanNumerals.convert(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Le nombre doit être compris entre 1 et 50");
    }

    @Test
    void negatif_leve_une_exception() {
        assertThatThrownBy(() -> ArabicRomanNumerals.convert(-5))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Le nombre doit être compris entre 1 et 50");
    }

    @Test
    void superieur_a_cinquante_leve_une_exception() {
        assertThatThrownBy(() -> ArabicRomanNumerals.convert(51))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Le nombre doit être compris entre 1 et 50");
    }
}
