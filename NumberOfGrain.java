package com.epam.brainStorm;

import java.math.BigDecimal;

public class NumberOfGrain {

    public static void main(String[] args) {
        System.out.println(numOfGrain(64));
    }

    static BigDecimal numOfGrain(int numberOfCells) {
        BigDecimal numberOfGrain = new BigDecimal(1);
        for (int i = 0; i < numberOfCells; i++) {
            System.out.println(numberOfGrain);
            numberOfGrain =  numberOfGrain.add(new BigDecimal(Math.pow(2, i)));

        }
        return numberOfGrain;
    }

}
