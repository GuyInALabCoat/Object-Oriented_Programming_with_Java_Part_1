package com.company;

public class Account {
    private String name; // instances of the com.company.Account class will have a name and a balance
    private double balance; // also called object variables, object fields or object attributes

    // Constructor: sets the variables of the object. Always has the same name as the class.
    private Account(String initialName, double initialBalance) { // receives two parameters, initialName and initialBalance
        this.name = initialName; // sets the variables of THIS particular object
        this.balance = initialBalance;
    }

    private String getName() {
        return name;
    }

    private double getBalance() {
        return balance;
    }


    public static void main(String[] args) {
        Account bartosAccount = new Account("Barto's com.company.Account", 100.00); // creates an object of the class com.company.Account with the name of bartosAccount
        Account bartosSwissAccount = new Account("Barto's account in Switzerland", 1000000.00); // does the same with the name of bartosSwissAccount

        System.out.println("Initial state");
        System.out.println(bartosAccount.printAccount());
        System.out.println(bartosSwissAccount.printAccount());

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: " + bartosAccount.getBalance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: " + bartosSwissAccount.getBalance());

        System.out.println("Final State");
        System.out.println(bartosAccount.printAccount());
        System.out.println(bartosSwissAccount.printAccount());

        Account A = new Account("A", 100.00);
        Account B = new Account("B", 0.0);
        Account C = new Account("C", 0.0);

        A.transfer(A, B, 50.0);
        A.transfer(B, C, 25.0);

        System.out.println(A.printAccount());
        System.out.println(B.printAccount());
        System.out.println(C.printAccount());

    }

    private double withdrawal(double amount){
        return this.balance = this.getBalance() - amount;
    }

    private double deposit(double amount){
        return this.balance = this.getBalance() + amount;
    }

    private String printAccount(){
        return this.getName() + ": " + this.getBalance();
    }

    private void transfer(Account from, Account to, double amount){
        if (from.getBalance() >= amount){
            to.balance = to.getBalance() + amount;
            from.balance = from.getBalance() - amount;
        } else {
            System.out.println("Insufficient Funds");
        }
    }


}
