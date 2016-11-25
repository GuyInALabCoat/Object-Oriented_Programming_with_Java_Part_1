package com.company;

public class Multiplier {
    private int value; // all objects of the class com.company.Multiplier have a value variable

    private Multiplier(int number){
        this.value = number;  // Sets the variable "value" of the object to the "number" parameter
    }

    public static void main(String[] args){
        Multiplier threeMultiplier = new Multiplier(3); // new object with "value" = 3
        System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));

        Multiplier fourMultiplier = new Multiplier(4); // new object with "value" = 4
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));

        System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
        System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
    }

    private int multiply(int otherNumber){
        return this.value * otherNumber; // returns otherNumber multiplied by the value of the "value" parameter. (or "number", the constructor parameter)
    }
}
