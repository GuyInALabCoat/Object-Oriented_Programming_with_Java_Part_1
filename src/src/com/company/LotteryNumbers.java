package com.company;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    private LotteryNumbers(){
        this.random = new Random();
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    private ArrayList<Integer> numbers(){
        return this.numbers;
    }

    private void drawNumbers(){
        for (int i = 0; i < 7; i++) {
            int number = random.nextInt(39) + 1;

            if (!this.containsNumber(number)){
                this.numbers().add(number);
            }
        }
    }

    private boolean containsNumber(int number){
        return this.numbers().contains(number);
    }

    public static void main(String[] args){
        LotteryNumbers lotteryNumbers = new LotteryNumbers();
        ArrayList<Integer> numbers = lotteryNumbers.numbers();

        System.out.println("Lottery numbers:");
        for (int number:numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}
