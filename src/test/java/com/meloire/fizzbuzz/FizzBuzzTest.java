package com.meloire.fizzbuzz;

import org.junit.jupiter.api.Test;
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
}
