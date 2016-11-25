package com.company;

import java.util.Arrays;

public class Week6 {

    private static int sum(int[] array){    // calculates the sum of the numbers in the array given as a parameter
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;                         // returns the int sum of the array
    }

    private static void printElegantly(int[] array){    // prints the numbers in the array on the sum row, separated by a comma, with no trailing comma
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);

            if (i < array.length - 1){                  // for each cycle in the loop, after printing the number, print a comma, except for the last number
                System.out.print(", ");
            }
        }
    }

    private static int[] copy(int[] array){     // creates a copy of the parameter array
        /*int[] copy = new int[array.length];   // creates a new array with the same length as the parameter array

        for(int i = 0; i < array.length; i++){  // for each element in the parameter, the content is copied to the new array
            copy[i] = array[i];
        }*/

        return array.clone();
    }

    private static int[] reverseCopy(int[] array){  // creates an copy of the parameter array in reversed order
        int[] copy = new int[array.length];         // creates a new array with the same length as the parameter array

        int j = 0;
        for(int i = array.length - 1; i >= 0; i--){ // starting from the end of the original array and decrementing by one
            copy[j] = array[i];                     // copy the content to the new array whose index is incrementing by one
            j++;
        }

        return copy;                                // return the reversed copy
    }

    private static void printArrayAsStars(int[] array){     // prints a line with stars for each number in the array. The line length is determined by the number.
        for(int i = 0; i < array.length; i++){              // outer loop runs the inner loop for each element in the array
            for (int j = 0; j < array[i]; j++){             // prints out the number of stars denoted in each element of the array
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static int smallest(int[] array){
        int a = array[0];
        for(int i = 0; i < array.length; i++){
            if(a > array[i]){
                a = array[i];
            }
        }
        return a;
    }

    private static int indexOfTheSmallest(int[] array){
        int index = 0;
        int a = array[0];
        for(int i = 0; i < array.length; i++){
            if(a > array[i]){
                index = i;
                a = array[i];
            }
        }
        return index;
    }

    private static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int[] copy = new int[array.length - index];
        int j = 0;

        for(int i = index; i < array.length; i++){
            copy[j] = array[i];
            j++;
        }

        return indexOfTheSmallest(copy) + index;
    }

    private static void swap(int[] array, int index1, int index2){
        int temp;

        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void selectionSort(int[] array){
        int smallest;
        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array));
            smallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallest);
        }
    }

    public static void main(String[] args){
//        NightSky NightSky = new NightSky(0.05, 80, 40);
//        NightSky.print();

//        int[] values = {16, 4, 6, 7, 9, 2, 10};
//        System.out.println("smallest: " + smallest(values));

//        System.out.println("Index of the smallest: " + indexOfTheSmallest(values));

//        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
//        System.out.println(indexOfTheSmallestStartingFrom(values, 4));

//        System.out.println(Arrays.toString(values));

//        swap(values, 1, 0);
//        System.out.println(Arrays.toString(values));

//        swap(values, 0, 3);
//        System.out.println(Arrays.toString(values));

//        selectionSort(values);
    }

}
