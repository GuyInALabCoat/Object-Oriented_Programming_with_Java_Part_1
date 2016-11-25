package com.company;

import java.util.Random;

public class Dice {
    private Random random;          // creates object variable of class Random but doesn't assign it a value;
    private int numberOfSides;      // object variable that stores the number of sides of the dice

    private Dice(int numberOfSides){
        this.numberOfSides = numberOfSides;
        random = new Random();      // initializes random to a random number generator
    }

    private int roll() {
        return random.nextInt(numberOfSides) + 1;
    }

    public static void main(String[] args){
        Dice dice = new Dice(6);

        int i = 0;
        while (i < 10){
            System.out.println(dice.roll());
            i++;
        }
    }
}
