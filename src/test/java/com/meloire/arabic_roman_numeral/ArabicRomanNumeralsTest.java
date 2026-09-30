package com.meloire.arabic_roman_numeral;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

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
}
