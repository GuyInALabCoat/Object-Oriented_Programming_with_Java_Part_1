package com.company;

public class CashRegister {
    private double cashInRegister;      // the amount of cash in the register
    private int economicalSold;         // the amount of economical lunches sold
    private int gourmetSold;            // the amount of gourmet lunches sold

    private CashRegister(){
        this.cashInRegister = 1000;     // at the start the register has 1000 euros
    }

    private double payEconomical(double cashGiven){
        if (cashGiven >= 2.50){     // if given cash is at least the price of the lunch:
            this.cashInRegister += 2.50;   // the price of the lunch is added to register
            this.economicalSold++;      // the amount of sold lunches is incremented by one
            return cashGiven - 2.50;    // the method returns cashGiven - lunch price
        }

        return cashGiven;       // if not enough money is given, all is returned and nothing else happens
    }

    private double payGourmet(double cashGiven){
        if (cashGiven >= 4.00){     // if given cash is at least the price of the lunch:
            this.cashInRegister += 4.00;   // the price of lunch is added to the register
            this.gourmetSold++;     // the amount of the sold lunches is incremented by one
            return cashGiven - 4.00;    // the method returns cashGiven - lunch price
        }

        return cashGiven;       // if not enough money is given, all is returned and nothing else happens
    }

    public String toString(){
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }

    private boolean payEconomical(LyyraCard card){
        if (card.pay(2.50)){    // if the balance of the card is at least the price of the lunch:
            this.economicalSold++;  // the amount of sold lunches is incremented by one
            return true;        // the method returns true
        }

        return false;       // if not, the method returns false
    }

    private boolean payGourmet(LyyraCard card){
        if (card.pay(4.00)){    // if the balance of the card is at least the price of the lunch:
            this.gourmetSold++;     // the amount of sold lunches is incremented by one
            return true;        // the method returns true
        }

        return false;       // if not, the method returns false
    }

    private void loadMoneyToCard(LyyraCard card, double sum){
        card.loadMoney(sum);    // if sum > 0, the value of sum is loaded onto the card
                                // max value that can be stored on the card is 150.00 euros
        this.cashInRegister += sum; // loaded money is added to the register

    }

    public static void main(String[] args){
        CashRegister unicafeExactum = new CashRegister();
        System.out.println(unicafeExactum);

        LyyraCard cardOfJim = new LyyraCard(2);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        boolean succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        unicafeExactum.loadMoneyToCard(cardOfJim, 100);

        succeeded = unicafeExactum.payGourmet(cardOfJim);
        System.out.println("payment success: " + succeeded);

        System.out.println("the card balance " + cardOfJim.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}
