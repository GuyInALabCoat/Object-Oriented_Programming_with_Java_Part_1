package com.company;

public class DecreasingCounter {
    private int value;      //object variable that remembers the value of the counter
    private int initialValue;   //object variable that remembers the initial value of the counter

    private DecreasingCounter(int valueAtStart){
        this.value = valueAtStart; // sets counter = passed value
        this.initialValue = valueAtStart; // sets "initialValue" = initial passed value
    }

    private void printValue(){
        System.out.println("value: " + this.value); // prints the counter variable
    }

    private void decrease(){
        if (this.value > 0) { // if counter is greater than 0, it will decrement it by 1
            this.value--;
        }
    }

    private void reset(){
        this.value = 0; // resets the counter to 0
    }

    private void setInitial(){
        this.value = initialValue; // returns the counter to its initial value
    }

    public static void main(String[] args){
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();

    }
}
