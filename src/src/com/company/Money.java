package com.company;

public class Money {

    private final int euros;                    // instance variables have been set to final so that once set, their values cannot be changed
    private final int cents;

    private Money(int euros, int cents){        // Constructor

        if (cents > 99){                        // if cents is greater than 99, divide by 100 and add remainder to euros
            euros += cents / 100;
            cents %= 100;                       // then store cents mod 100
        }

        this.euros = euros;                     // set the instance variables
        this.cents = cents;
    }

    private int getEuros(){
        return euros;
    }

    private int getCents(){
        return cents;
    }

    public String toString(){                   // Overrides the default toString method
        String zero = "";
        if (cents <= 10){
            zero = "0";
        }

        return getEuros() + "." + zero + getCents() + "e";
    }

    private Money plus(Money added){            // Since Money object is immutable, this method returns a new Money object
        int euroTotal = this.getEuros() + added.getEuros();     // that has a value equal to the sum of the object for which the method was called
        int centTotal = this.getCents() + added.getCents();     // and the object given as a parameter

        return new Money(euroTotal, centTotal);     // return new Money object
    }

    private boolean less(Money compared){       // returns true is the object for which the method was called is less valuable than the object given as a parameter
        if (this.getEuros() < compared.getEuros()){     // first compare euro totals
            return true;
        } else if (this.getEuros() == compared.getEuros() && this.getCents() < compared.getCents()){    // then compare cent totals
            return true;
        } else {
            return false;       // object for which the method was called is more valuable than the object given as a parameter or there is an ERROR.
        }
    }

    private Money minus(Money decremented){     // Similar to plus, returns a Money object with value equal to the difference between two Money objects
        int euroTotal = this.getEuros() - decremented.getEuros();
        int centTotal = this.getCents() - decremented.getCents();

        if (euroTotal < 0){         // if the subtraction results in a value less than 0, simply set the value to 0
            euroTotal = 0;
        } else if (centTotal < 0){
            centTotal = 0;
        }

        return new Money(euroTotal, centTotal);     // return new Money object
    }

    public static void main(String[] args){
        /*com.company.Money a = new com.company.Money(10, 0);
        com.company.Money b = new com.company.Money(5, 0);

        com.company.Money c = a.plus(b);

        System.out.println(a);      // 10.00e
        System.out.println(b);      // 5.00e
        System.out.println(c);      // 15.00e

        a = a.plus(c);              // NOTE: new com.company.Money-object is created and reference to that
                                    // is assigned to variable a.
                                    // The com.company.Money object 10.00e that variable a used to hold
                                    // is not referenced anymore

        System.out.println(a);      // 25.00e
        System.out.println(b);      // 5.00e
        System.out.println(c);      // 15.00e*/

        /*com.company.Money a = new com.company.Money(10, 0);
        com.company.Money b = new com.company.Money(3, 0);
        com.company.Money c = new com.company.Money(5, 0);

        System.out.println(a.less(b)); // false
        System.out.println(b.less(c)); // true*/

        Money a = new Money(10, 0);
        Money b = new Money(3, 50);

        Money c = a.minus(b);

        System.out.println(a);      // 10.00e
        System.out.println(b);      // 3.50e
        System.out.println(c);      // 6.50e

        c = c.minus(a);

        System.out.println(a);      // 10.00e
        System.out.println(b);      // 3.50e
        System.out.println(c);      // 0.00e
    }
}
