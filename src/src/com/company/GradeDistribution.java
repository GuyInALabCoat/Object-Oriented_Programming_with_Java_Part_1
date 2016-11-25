package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);               // one Scanner object

        System.out.println("Type exam scores, -1 completes:");

        doSomething(scanner);                                   // runs the grade distribution
    }

    public static void doSomething(Scanner scanner) {
        int[] grades = new int[6];                              // creates the empty array to hold the grade histogram

        while (true) {
            String riw = scanner.nextLine();
            int grade = Integer.parseInt(riw);                  // reads next line into var grade

             if (grade == -1){                                  // if -1 is entered, exit the while loop
                break;
            } else {
                 calculateGrade(grade, grades);                 // entered number and array are passed to method
                                                                // notice how the method receives a reference to the array object so any changes also show up in the main program
            }
        }

        printGradeDistribution(grades);                         // prints the grade distribution as a star histogram

        calculateAcceptancePercentage(grades);

    }

    public static void calculateGrade(int grade, int[] grades) {    // given the grade and the array
        if (grade <= 29){                                           // the grade must first be matched with the appropriate grade level
            grades[0] += 1;                                         // then, instead of storing the grade value
        }   else if (30 <= grade && grade <= 34) {                  // we simply increment that particular grade level in the array
            grades[1] += 1;                                         // with 0-29, 30-34, 35-39, 40-44, 45-49, 50-60 corresponding to
        }   else if (35 <= grade && grade <= 39) {                  // grade level 0, 1, 2, 3, 4, 5 respectively
            grades[2] += 1;
        }   else if (40 <= grade && grade <= 44) {
            grades[3] += 1;
        }   else if (45 <= grade && grade <= 49) {
            grades[4] += 1;
        }   else if (50 <= grade && grade <= 60) {
            grades[5] += 1;
        }   else {
            System.out.println("\nInvalid Number");
        }
    }

    public static void printGradeDistribution(int[] grades) {
        System.out.println("Grade distribution: ");
        for (int i = 5; i >= 0; i--) {                                  // starting from grade level 5
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {                       // using an incrementer, we print the number of stars
                System.out.print("*");                                  // corresponding to the number of grades at that particular grade level.
            }
            System.out.print('\n');                                     // carriage return at the end of each line
        }
    }

    public static void calculateAcceptancePercentage(int[] grades){
        System.out.print("Acceptance percentage: ");                    // All the grades besides zeros are accepted
        double accepted = 0.0;
        for (int k = 1; k < grades.length; k++ ){
            accepted += grades[k];
        }
        System.out.print(100 * (accepted / (grades[0] + accepted)));    // Acceptance percentage is calculated as 100*accepted/allScores
    }
}