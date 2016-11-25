package com.company;

import java.util.Random;


public class Week2 {

    public static void main(String[] args){

//        Summer();
//        InfSummer();
//        OneToHundred();
//        HundredToOne();
//        ToHundredEven();
//        UpToNumber();
//        BetweenTwoNumbers();
//        SumOfSet();
//        SumBtwTwoNumbers();
//        Factorial();
//        SumOfPowers();
//        AllAboutLoops();
/*        System.out.println("How many? ");
        int counter = 0;
        int repeat = com.company.Week1.IntReader();
        while (counter < repeat) {
            PrintText();
            counter++;
        }*/
//        PrintStars(5);
//        PrintSquare(2);
//        PrintRectangle(17,3);
//        PrintTriangle(4);
//        PrintWhiteSpaces(4);
//        PrintRightTriangle(4);
//        xmasTree(10);
//        drawNumber();

    }

    private static void Summer(){
        int sum = 0;
        int read;

        System.out.print("Type the first number: ");
        read = Week1.IntReader();

        sum = sum + read;

        System.out.print("Type the second number: ");
        read = Week1.IntReader();

        sum = sum + read;

        System.out.print("Type the third number: ");
        read = Week1.IntReader();

        sum = sum + read;

        System.out.println("\nSum: " + sum);
    }

    private static void InfSummer(){
        int sum = 0;
        while (true){
            int read = Week1.IntReader();
            if (read == 0){
                break;
            } else {
                sum = sum + read;
                System.out.println("Sum now: " + sum);
            }
        }

        System.out.println("Sum in the end: " + sum);
    }

    private static void OneToHundred(){
        int number = 1;

        while (number <= 100){
            System.out.println(number);
            number++;
        }
    }

    private static void HundredToOne(){
        int number = 100;

        while (number >= 1){
            System.out.println(number);
            number--;
        }
    }

    private static void ToHundredEven(){
        int number = 2;

        while (number <= 100){
            System.out.println(number);
            number += 2;
        }
    }

    private static void UpToNumber(){
        int number = 1;
        System.out.print("Up to what number? ");

        int read = Week1.IntReader();

        while (number <= read){
            System.out.println(number);
            number++;
        }
    }

    private static void BetweenTwoNumbers(){
        System.out.print("First: ");

        int num1 = Week1.IntReader();

        System.out.print("Last: ");

        int num2 = Week1.IntReader();

        while (num1 <= num2){
            System.out.println(num1);
            num1++;
        }
    }

    private static void SumOfSet(){
        int inc = 1;
        int sum = 0;
        System.out.print("Until what? ");

        int number = Week1.IntReader();

        while (inc <= number){
            sum += inc;
            inc++;
        }

        System.out.println("Sum is " + sum);
    }

    private static void SumBtwTwoNumbers(){
        int sum = 0;
        System.out.print("First: ");

        int num1 = Week1.IntReader();

        System.out.print("Last: ");

        int num2 = Week1.IntReader();

        while (num1 <= num2){
            sum += num1;
            num1++;
        }

        System.out.println("The sum is " + sum);
    }

    private static void Factorial(){
        int factorial = 1;
        int sum = 1;
        System.out.print("Type a number: ");

        int number = Week1.IntReader();

        if (number < 0){
            System.out.println("Undefined");
        } else {
            while (factorial <= number) {
                sum *= factorial;
                factorial++;
            }

            System.out.println("Factorial is " + sum);
        }
    }

    private static void SumOfPowers(){
        int power = 0;
        int result = 0;
        System.out.print("Type a number: ");

        int number = Week1.IntReader();

        while (power <= number) {
            result += (int) Math.pow(2, power);
            power++;
        }

        System.out.println("The result is " + result);
    }

    private static void AllAboutLoops(){
        int sum;
        sum = 0;
        int counter = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Type numbers:");

        while (true){
            int input = Week1.IntReader();

            if (input == -1){
                break;
            } else {
                sum += input;
                counter++;

                if(input % 2 == 0){
                    even++;
                } else{
                    odd++;
                }
            }
        }

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + counter);
        System.out.println("Average: " + ((double)sum / counter));
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

    private static void PrintText(){
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    private static void PrintStars(int amount){
        for (int i = 0; i < amount; i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    private static void PrintSquare(int sideSize){
        for (int i = 0; i < sideSize; i++){
            PrintStars(sideSize);

        }
    }

    private static void PrintRectangle(int width, int height){
        for (int i = 0; i < height; i++) {
            PrintStars(width);
        }
    }

    private static void PrintTriangle(int size){
        for (int i = 1; i <= size; i++){
            PrintStars(i);
        }
    }

    private static void PrintWhiteSpaces(int size){
        for (int i = 1; i <= size; i++){
            System.out.print(" ");
        }
    }

    private static void PrintRightTriangle(int size){
        for (int i = 1; i <= size; i++){
            PrintWhiteSpaces(size - i);
            PrintStars(i);
        }
    }

    private static void xmasTree(int height){
        int size = 1;
        for (int i = 1; i <= height; i++){
            PrintWhiteSpaces(height - i);
            PrintStars(size);
            size += 2;
        }
        int k = 1;
        while (k < 3) {
            PrintWhiteSpaces(height - 2);
            PrintStars(3);
            k++;
        }
    }

    private static void drawNumber(){
        Random rand = new Random();
        int number = rand.nextInt(100);
        int counter = 0;


        while (true) {
            System.out.print("Guess a number: ");
            int input = Week1.IntReader();
            if (input > number) {
                counter++;
                System.out.println("The number is lesser, guesses made: " + counter);
            } else if (input < number) {
                counter++;
                System.out.println("The number is greater, guesses made: " + counter);
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }

}
