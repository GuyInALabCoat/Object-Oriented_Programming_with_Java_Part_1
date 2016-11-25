package com.company;

public class LyyraCard {
    private double balance;


    public LyyraCard(double balanceAtStart){
        this.balance = balanceAtStart; // sets the initial balance to the passed value
    }

    public String toString(){
        return "The Card has " + this.balance + " euros"; // toString method that returns string representation
    }

    public void payEconomical(){
        if (this.balance >= 2.50) {     // if sufficient money on balance, decrement balance
            this.balance -= 2.50;
        }
    }

    public double balance(){
        return this.balance;
    }

    public void payGourmet(){
        if (this.balance >= 4.00) {     // if sufficient money on balance, decrement balance
            this.balance -= 4.00;
        }
    }

    public void loadMoney(double amount){
        if(amount >= 0) {               // amount cannot be negative
            if (this.balance + amount > 150.00) {
                this.balance += (150.00 - this.balance);  // increases balance to max 150
            } else {
                this.balance += amount; // otherwise, increase balance
            }
        }
    }

    public boolean pay(double amount){
        if (this.balance() >= amount){
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        LyyraCard cardPekka = new LyyraCard(20); // new object: cardPekka
        LyyraCard cardBrian = new LyyraCard(30); // new object: cardBrian

        cardPekka.payGourmet();
        cardBrian.payEconomical();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.loadMoney(20);

        cardBrian.payGourmet();

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

        cardPekka.payEconomical();
        cardPekka.payEconomical();

        cardBrian.loadMoney(50);

        System.out.println("Pekka: " + cardPekka);
        System.out.println("Brian: " + cardBrian);

    }
}
