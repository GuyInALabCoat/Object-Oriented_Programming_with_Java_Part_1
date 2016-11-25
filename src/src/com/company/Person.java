package com.company;

import java.util.Calendar;

public class Person {
    private String number;
    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv){
        this.name = name;                               // sets the name of the Person object to the given name.
        this.birthday = new MyDate(pp, kk, vv);         // creates a MyDate object with the date equal to day/month/year
    }

    private int age(){
        int day = Calendar.getInstance().get(Calendar.DATE);        // stores current day of the month in day
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // stores current month in month with month + 1 as it starts from 0
        int year = Calendar.getInstance().get(Calendar.YEAR);       // stores current year in year

        MyDate currentYear = new MyDate(day, month, year);          // creates a MyDate object with current date called currentYear

        return birthday.differenceInYears(currentYear);             // calculates the age as a difference between the age of the person and current year
    }

    public String getName(){
        return this.name;
    }

    public String getNumber(){
        return this.number;
    }

    public void changeNumber(String newNumber){
        this.number = newNumber;
    }

    public String toString(){                                       // overrides the default toString method
        if (this.number == null) {
            return this.name + ", born " + this.birthday;
        } else {
            return this.getName() + " number: " + this.getNumber();
        }
    }

    private boolean olderThan(Person compared){         // given a person to compare,
        if (this.birthday.earlier(compared.birthday)){  // using the earlier method of the MyDate Class, compares the current person object to the compared one,
            return true;                                // returns true if the current person has an earlier birthday than compared person
        }                                               // remember that birthday is a MyDate object

        return false;
    }

    public Person(String name, MyDate birthday){        // Constructor
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name){                         // Constructor
        this.name = name;

        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int year = Calendar.getInstance().get(Calendar.YEAR);

        this.birthday = new MyDate(day, month, year);
    }

    public Person(String name, String phoneNumber){     // Constructor
        this.name = name;
        this.number = phoneNumber;
    }

    public static void main(String[] args){
        Person pekka = new Person("Pekka", new MyDate(15, 2, 1983));
        Person steve = new Person("Steve");

        System.out.println(pekka);
        System.out.println(steve);
    }
}
