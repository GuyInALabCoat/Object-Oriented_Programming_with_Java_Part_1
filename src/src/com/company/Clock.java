package com.company;

public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursLimit, int minutesLimit, int secondsLimit){
        hours = new BoundedCounter(hoursLimit);   // counters that represent hours, minutes and seconds are created and set to 0
        minutes = new BoundedCounter(minutesLimit);
        seconds = new BoundedCounter(secondsLimit);

        hours.setValue(23);     // set counters to initial values
        minutes.setValue(59);
        seconds.setValue(50);

    }

    public void tick(){
        seconds.next();
        if (seconds.getValue() == 0){
            minutes.next();
            if (minutes.getValue() == 0){
                hours.next();
            }
        }
    }

    public String toString(){
        return hours + ":" + minutes + ":" + seconds;
    }

    public static void main(String[] args){
        Clock clock = new Clock(23, 59, 59);


        int i = 0;
        while(i < 20){
            System.out.println(clock);
            clock.tick();
            i++;
        }
    }
}
