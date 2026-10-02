package com.meloire.fizzbuzz;

public class FizzBuzz {
    public static String de(int nbre) {
        boolean divisiblePar3 = nbre % 3 == 0;
        boolean divisiblePar5 = nbre % 5 == 0;

        if(divisiblePar3 && divisiblePar5){
            return "FizzBuzz";
        }
        else if(divisiblePar3){
            return "Fizz";
        }
        else if(divisiblePar5){
            return "Buzz";
        }

        return Integer.toString(nbre);
    }
}
