package com.company;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared){
        if (this.year < compared.year){     // first we'll compare years
            return true;
        }

        // if the years are the same, we'll compare the months
        if (this.year == compared.year && this.month < compared.month){
            return true;
        }

        // years and months the same, we'll compare the days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day){
            return true;
        }

        return false;
    }

    public void advance(){
        if (this.day == 30) {      // increments the date by one, assuming 30 days in month
            this.day = 1;

            if (this.month == 12) {
                this.month = 1;
                this.year++;
            } else {
                this.month++;
            }
        } else {
            this.day++;
        }
    }

    public void advance(int numberOfDays){
        for(int i = 0; i < numberOfDays; i++){
            this.advance();
        }
    }

    private MyDate afterNumberOfDays(int days){

        // creates a copy of the current date and advances it by the number of days
        MyDate newMyDate = new MyDate(this.day, this.month, this.year);

        newMyDate.advance(days);

        return newMyDate;
    }

    public int differenceInYears(MyDate comparedDate){
            int daysDiff = this.day - comparedDate.day;
            daysDiff += (this.month - comparedDate.month) * 30;
            daysDiff += (this.year - comparedDate.year) * 365;

        return (Math.abs(daysDiff) / 365);
    }

    public static void main(String[] args){
       /* com.company.MyDate day = new com.company.MyDate(25, 2, 2011);
        com.company.MyDate newDate = day.afterNumberOfDays(7);
        for(int i = 1; i <= 7; i++){
            System.out.println("Friday after " + i + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);
        }
        System.out.println("This week's Friday is " + day);
        System.out.println("The date 790 days from this week's Friday is " + day.afterNumberOfDays(790));*/

        MyDate first = new MyDate(24, 12, 2009);
        MyDate second = new MyDate(1, 1, 2011);
        MyDate third = new MyDate(25, 12, 2010);

        System.out.println(first + " and " + second + " difference in years: " + second.differenceInYears(first));
        System.out.println(second + " and " + first + " difference in years: " + first.differenceInYears(second));
        System.out.println(first + " and " + third + " difference in years: " + third.differenceInYears(first));
        System.out.println(third + " and " + first + " difference in years: " + first.differenceInYears(third));
        System.out.println(third + " and " + second + " difference in years: " + second.differenceInYears(third));
        System.out.println(second + " and " + third + " difference in years: " + third.differenceInYears(second));
    }
}
