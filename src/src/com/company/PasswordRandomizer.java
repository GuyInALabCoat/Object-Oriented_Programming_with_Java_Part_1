package com.company;

import java.util.Random;

public class PasswordRandomizer {
    private Random random;          // objects of this class have a random value, a password length, and a password
    private int passwordLength;
    private String password;

    private PasswordRandomizer(int length){
        this.random = new Random();  // initializes random to an object of the Random class
        this.passwordLength = length;   // initializes passwordLength to the passed length
        this.password = "";         // initializes the password to an empty String
    }

    private String createPassword(){
        this.password = "";         // initializes the password to an empty String
        for (int i = 0; i < this.passwordLength; i++) {     // for each character up to the password length
            int number = random.nextInt(26);            // generate a random number from 0 - 25
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);  // select the character at that index
            this.password = this.password + symbol;     // add character to the password
        }
        return this.password;
    }

    public static void main(String[] args){
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());

    }
}
