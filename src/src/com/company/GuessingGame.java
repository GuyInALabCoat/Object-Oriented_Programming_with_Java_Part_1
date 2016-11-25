package com.company;

import java.util.Scanner;

public class GuessingGame {
    private Scanner reader;

    public GuessingGame(){
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit){
        instructions(lowerLimit, upperLimit);                                           // prints out the instructions for how the guessing game is run

        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);               // calculate the maximum number of questions that can be asked

        for (int i = 0; i < maxQuestions; i++){
            if (lowerLimit == upperLimit){
                break;
            }
            int averageNumber = average(lowerLimit, upperLimit);                        // calculate the average between the lower and upper limit
            if (isGreaterThan(averageNumber)){                                          // ask if the number is greater than the average value
                lowerLimit = averageNumber;                                             // if true, set the lower limit equal to the average
            } else {
                upperLimit = averageNumber;                                             // else set the upper limit equal to the average
            }
        }

        System.out.println("The number you're thinking of is " + upperLimit);
    }

    public boolean isGreaterThan(int value){
        System.out.println("Is your number greater than " + value + "? (y/n)");
        if(reader.nextLine().equals("y")){
            return true;
        }
        return false;
    }

    public int average(int firstNumber, int secondNumber){

        return ((firstNumber + secondNumber) / 2);
    }

    public void instructions(int lowerLimit, int upperLimit){
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking of with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you with a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method;
    public static int howManyTimesHalvable(int number){
        // we create a base two logarithm of the given value
        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }

    public static void main(String[] args){
        GuessingGame game = new GuessingGame();

        game.play(6, 12);                                                               // define the number space that a number can be chosen from
    }
}
