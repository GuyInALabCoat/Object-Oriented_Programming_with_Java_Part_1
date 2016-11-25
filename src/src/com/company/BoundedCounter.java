package com.company;

public class BoundedCounter {
    private int value;      // object variable remembers the value of the counter
    private int upperLimit; // object variable that stores the value of the upper limit

    public BoundedCounter(int upperLimit){
        this.value = 0;     // set counter to initial value of 0
        this.upperLimit = upperLimit;  // set object upper limit to passed limit
    }

    public void next(){  // increments the value of the counter
        if(this.value == this.upperLimit){ // if the value of the counter would be more than upperLimit, it wraps around to 0
            this.value = 0;
        } else {
            this.value++;
        }
    }

    public String toString(){ // returns a two digit string representation
        if (this.value < 10){
            return "0" + this.value;
        } else {
            return "" + this.value;
        }
    }

    public int getValue() { // getter method to return value of counter
        return this.value;
    }

    public void setValue(int setValue){  // sets the value of the counter to the passed value, unless it is less than 0 or more than upperLimit
        if(setValue >= 0 || setValue <= this.upperLimit) {
            this.value = setValue;
        }
    }

    public static void main(String[] args) throws Exception{
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        seconds.setValue(50);
        minutes.setValue(59);
        hours.setValue(23);

        while(true){ // self updating clock than prints updates to the screen every sec
            System.out.println(hours + ":" + minutes + ":" + seconds);
            Thread.sleep(1000);
            seconds.next();
            if(seconds.getValue() == 0) {
                minutes.next();
                if(minutes.getValue() == 0) {
                    hours.next();
            }
            }
        }

        /*System.out.print("seconds: ");
        int s = com.company.Week1.IntReader();
        System.out.print("minutes: ");
        int m = com.company.Week1.IntReader();
        System.out.print("hours: ");
        int h = com.company.Week1.IntReader();

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while (i < 121){
            System.out.println( hours + ":" + minutes + ":" + seconds); // the current time printed
            seconds.next();
            if(seconds.getValue() == 0) {
                minutes.next();
                if(minutes.getValue() == 0) {
                    hours.next();
            }
            }
            i++;
        }*/
    }
}
