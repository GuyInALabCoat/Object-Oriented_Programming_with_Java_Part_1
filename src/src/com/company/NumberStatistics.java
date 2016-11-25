package com.company;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    private NumberStatistics(){
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    private void addNumber(int number){
        this.sum += number;
        this.amountOfNumbers++;
    }

    private int amountOfNumbers(){
        return this.amountOfNumbers;
    }

    private int sum(){
        return this.sum;
    }

    private double avarage(){
        return this.sum() / (double)this.amountOfNumbers();
    }

    public static void main(String[] args){
        NumberStatistics sums = new NumberStatistics();
        NumberStatistics evenNumbers = new NumberStatistics();
        NumberStatistics oddNumbers = new NumberStatistics();

        System.out.println("Type numbers: ");

        while (true){
            int input = Week1.IntReader();
            if (input == -1){
                break;
            } else {
                sums.addNumber(input);
                if (input % 2 == 0){
                    evenNumbers.addNumber(input);
                } else {
                    oddNumbers.addNumber(input);
                }
            }
        }
        System.out.println("sum: " + sums.sum());
        System.out.println("sum of even: " + evenNumbers.sum());
        System.out.println("sum of odd: " + oddNumbers.sum());
    }
}
