package com.company;

import java.util.Scanner;

public class Week1 {

    public static void main(String[] args) {
//Made using the course info available at http://mooc.cs.helsinki.fi/programming-part1/material-2013/week-1?noredirect=1#e13

        int x = 277;
        int y = 111;


//        Name();
//        Hello_World();
//        Spruce();
//        VaryingVariables();
//        SecondsInAYear();
//        Addition(x,y);
//        Multiplication(x,y);
//        Adder();
//        Divider();
//        CalCircumference();
//        BiggerNumber();
//        SumOfAges();
//        PositiveNumber();
//        MajorityAge();
//        EvenOrOdd();
//        GreaterNumber();
//        GradePoints();
//        AgeCheck();
//        Usernames();
//        LeapYear();
//        Password();
    }

    public static String StringReader(){ // reads the string input of the next line
        Scanner reader = new Scanner(System.in);

        return reader.nextLine();
    }

    public static int IntReader(){ // reads the int input of the next line
        Scanner reader = new Scanner(System.in);

        return Integer.parseInt(reader.nextLine());
    }

    private static void Name(){
        System.out.println("Jane Doe");
    }

    private static void Hello_World(){
        System.out.println("Hello world!");
        System.out.println("(And all the people of the world)");
    }

    private static void Spruce(){
        for (int i = 1; i < 10; i += 2) {
            for (int k = 0; k < (4 - i/2); k++)
                System.out.print(" ");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("    *");
    }

    private static void VaryingVariables() {
        int chickens = 9000;
        double bacon = 0.1;
        String tractor = "Zetor";

        System.out.println("Chickens:\n" + chickens + "\nBacon (kg):\n" + bacon);
        System.out.println("A tractor:\n" + tractor + "\n");
        System.out.println("In a nutshell:\n" + chickens + "\n" + bacon + "\n" + tractor);

    }

    private static void SecondsInAYear() {
        int daysPerYear = 365;
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int secondsPerMinute = 60;

        int secondsPerYear = daysPerYear * hoursPerDay * minutesPerHour * secondsPerMinute;

        System.out.println("There are " + secondsPerYear + " in a year.");
    }

    private static void Addition(int x, int y) {
        int result = x + y;

        System.out.println(x + " + " + y + " = " + result);
    }

    private static void Multiplication(int x, int y) {
        int result = x * y;

        System.out.println(x + " * " + y + " = " + result);
    }

    private static void Adder() {
        System.out.print("Type a number: ");

        int number1 = IntReader();

        System.out.print("Type another number: ");

        int number2 = IntReader();

        System.out.println("\nSum of the numbers: " + (number1 + number2));
    }

    private static void Divider() {
        System.out.print("Type a number: ");

        int number1 = IntReader();

        System.out.print("Type another number: ");

        int number2 = IntReader();

        System.out.println("\nDivision: " + number1 + " / " + number2 + " = " + ((double)number1 / number2));
    }

    private static void CalCircumference() {
        System.out.print("Type a radius: ");

        int radius = IntReader();

        System.out.println("\nCircumference of the circle: " + (2 * Math.PI * radius));
    }

    private static void BiggerNumber() {
        System.out.print("Type a number: ");

        int number1 = IntReader();

        System.out.print("Type another number: ");

        int number2 = IntReader();

        int bigger = Math.max(number1, number2);

        System.out.println("\nThe bigger number of the two numbers given was: " + bigger);
    }

    private static void SumOfAges() {
        System.out.print("Type your name: ");

        String name1 = StringReader();

        System.out.print("Type your age: ");

        int age1 = IntReader();

        System.out.print("\nType your name: ");

        String name2 = StringReader();

        System.out.print("Type your age: ");

        int age2 = IntReader();

        System.out.println("\n" + name1 + " and " + name2 + " are " + (age1 + age2) + " years old in total.");
    }

    private static void PositiveNumber(){
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");

        int number1 = IntReader();

        if (number1 >= 0) {
            System.out.println("\nThe number is positive.");
        }   else {
            System.out.println("\nThe number is not positive.");
        }

    }

    private static void MajorityAge(){
        System.out.print("How old are you? ");

        int age = IntReader();

        if (age < 18) {
            System.out.println("\nYou have not reached the age of majority yet!");
        }   else {
            System.out.println("\nYou have reached the age of majority!");
        }
    }

    private static void EvenOrOdd() {
        System.out.print("Type a number: ");

        int number = IntReader();

        if ((number % 2) == 1){
            System.out.println("Number " + number + " is odd.");
        }   else {
            System.out.println("Number " + number + " is even.");
        }
    }

    private static void GreaterNumber() {
        System.out.print("Type the first number: ");

        int number1 = IntReader();

        System.out.print("Type the second number: ");

        int number2 = IntReader();

        if (number1 < number2){
            System.out.println("\nGreater Number: " + number2);
        }   else if (number1 > number2){
            System.out.println("\nGreater Number: " + number1);
        }   else {
            System.out.println("\nThe numbers are equal!");
        }
    }

    private static void GradePoints() {
        System.out.print("Type the points [0-60]: ");

        int number = IntReader();

        if (number <= 29){
                System.out.println("\nGrade: failed");
        }   else if (30 <= number && number <= 34) {
                System.out.println("\nGrade: 1");
        }   else if (35 <= number && number <= 39) {
                System.out.println("\nGrade: 2");
        }   else if (40 <= number && number <= 44) {
                System.out.println("\nGrade: 3");
        }   else if (45 <= number && number <= 49) {
                System.out.println("\nGrade: 4");
        }   else if (50 <= number && number <= 60) {
                System.out.println("\nGrade: 5");
        }   else {
                System.out.println("\nInvalid Number");
        }
    }

    private static void AgeCheck() {
        System.out.print("How old are you? ");

        int age = IntReader();

        if (0 <= age && age <= 120){
            System.out.println("OK");
        }   else {
            System.out.println("Impossible!");
        }
    }

    private static void Usernames() {
        System.out.print("Type your username: ");

        String username = StringReader();

        System.out.print("Type your password: ");

        String password = StringReader();

        if (username.equals("alex") && password.equals("mightyducks")) {
            System.out.println("You are now logged into the system!");
        }   else if (username.equals("emily") && password.equals("cat")) {
            System.out.println("You are now logged into the system!");
        }   else {
            System.out.println("Your username or password was invalid!");
        }
    }

    private static void LeapYear() {
        System.out.print("Type a year: ");

        int year = IntReader();

        if ((year % 4 == 0) && (!(year % 100 == 0) || (year % 400 == 0))) {
            System.out.println("The year is a leap year.");
        }   else {
            System.out.println("The year is not a leap year.");
        }
    }

    private static void Password() {
        String password = "carrot";

        while (true) {
            System.out.print("Type the password: ");

            String input = StringReader();

            if (input.equals(password)){

                System.out.println("Right!");
                System.out.println("\nThe secret is: aoisgan!");
                break;

            }   else {
                System.out.println("Wrong!");
            }
        }
    }
}
