package com.company;

public class Product {
    private double price; // All objects of the class com.company.Product have a price, name and amount
    private String name;
    private int amount;

    private Product(String nameAtStart, double priceAtStart, int amountAtStart){ // Constructor: sets the variables of objects of the class com.company.Product
        this.price = priceAtStart;
        this.name = nameAtStart;
        this.amount =  amountAtStart;
    }

    public static void main(String[] args){
        Product banana = new Product("Banana", 1.1, 13); // creates object with the name "banana"
        banana.printProduct();

    }

    private void printProduct(){ // object method that prints the following string
        System.out.println(this.name + ", price " + this.price + " amount " + this.amount);
    }
}
