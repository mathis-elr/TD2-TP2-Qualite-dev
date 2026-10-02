package com.meloire.fizzbuzz;

public class FizzBuzz {
    public static String de(int nbre) {
        if(nbre % 3 == 0){
            return "Fizz";
        }
        else if(nbre == 5){
            return "Buzz";
        }
        return String.valueOf(nbre);
    }
}
