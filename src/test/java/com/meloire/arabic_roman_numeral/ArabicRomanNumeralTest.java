package com.meloire.arabic_roman_numeral;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ArabicRomanNumeralTest {

    @Test
    void un_donne_I() {
        assertThat(ArabicRomanNumeral.convert(1)).isEqualTo("I");
    }

    @Test
    void deux_donne_II() {
        assertThat(ArabicRomanNumeral.convert(2)).isEqualTo("II");
    }

    @Test
    void quatre_donne_IV() {
        assertThat(ArabicRomanNumeral.convert(4)).isEqualTo("IV");
    }
}
