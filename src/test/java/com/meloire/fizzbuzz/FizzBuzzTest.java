package com.meloire.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void un_doit_renvoyer_un(){
        assertThat(fizzBuzz.de(1)).isEqualTo("1");
    }

    @Test
    public void trois_doit_renvoyer_Fizz(){
        assertThat(fizzBuzz.de(3)).isEqualTo("Fizz");
    }

    @Test
    public void cinq_doit_renvoyer_Buzz(){
        assertThat(fizzBuzz.de(5)).isEqualTo("Buzz");
    }

    @Test
    public void neuf_doit_renvoyer_Fizz(){
        assertThat(fizzBuzz.de(9)).isEqualTo("Fizz");
    }

    @Test
    public void dix_doit_renvoyer_Buzz(){
        assertThat(fizzBuzz.de(10)).isEqualTo("Buzz");
    }

    @Test
    public void quinze_doit_renvoyer_FizzBuzz(){
        assertThat(fizzBuzz.de(15)).isEqualTo("FizzBuzz");
    }

    @Test
    public void negatif_doit_renvoyer_erreur(){
        assertThat(fizzBuzz.de(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void trente_doit_renvoyer_fizzbuzz() {
        assertThat(fizzBuzz.de(30)).isEqualTo("FizzBuzz");
    }

    @ParameterizedTest(name = "de({0}) doit renvoyer \"{1}\"")
    @CsvSource({
            "1,  1",
            "2,  2",
            "3,  Fizz",
            "4,  4",
            "5,  Buzz",
            "6,  Fizz",
            "7,  7",
            "8,  8",
            "9,  Fizz",
            "10, Buzz",
            "11, 11",
            "12, Fizz",
            "13, 13",
            "14, 14",
            "15, FizzBuzz",
            "16, 16",
            "17, 17",
            "18, Fizz",
            "19, 19",
            "20, Buzz"
    })
    void de_doit_retourner_la_valeur_attendue_de_1_a_20(int entree, String attendu) {
        assertThat(fizzBuzz.de(entree)).isEqualTo(attendu);
    }
}
