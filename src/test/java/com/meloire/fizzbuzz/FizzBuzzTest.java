package com.meloire.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void un_doit_renvoyer_un(){
        assertThat(fizzBuzz.de(1)).isEqualTo("1");
    }
}
