package com.company;

public class Counter {
    private int counterVar;
    private boolean check;

    private Counter(int startingValue, boolean check){ // Main Constructor: sets the counter and check to the passed values
        this.counterVar = startingValue;
        this.check = check;
    }

    private Counter(int startingValue){ // overloaded constructor calling the main constructor, sets check = false
        this(startingValue, false);
    }

    private Counter(boolean check){ // overloaded constructor calling the main constructor, sets counter to 0
        this(0, check);
    }

    private Counter(){ // overloaded constructor calling the main constructor, sets the counter = 0, and check = false
        this(0, false);
    }

    public static void main(String[] args){

    }

    private int value(){    // returns the current value of the counter
        return this.counterVar;
    }

    private void increase(){    // increments the counter by 1
        this.counterVar++;
    }

    private void decrease(){    // if checking is on and counter > 0, decrements counter
        if (this.check) {
            if (this.counterVar > 0) {
                this.counterVar--;
            }
        }   else    {           // if checking is off, permits decrementing bellow 0
            this.counterVar--;
        }
    }
}
