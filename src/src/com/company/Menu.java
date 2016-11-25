package com.company;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals; // object variable that stores Strings, called "meals"

    private Menu(){
        this.meals = new ArrayList<String>(); // sets object variable to an empty ArrayList
    }

    private void addMeal(String meal){
        if (!this.meals.contains(meal)) { // adds a new meal to the list if it doesn't already exist
            this.meals.add(meal);
        }
    }

    private void printMeals(){
        for (String meal:meals) { // prints the meals in a menu
            System.out.println(meal);
        }
    }

    private void clearMenu(){
        this.meals.clear(); // resets menu list to an empty ArrayList
    }

    public static void main(String[] args){
        Menu todaysMenu = new Menu(); // creates an object of class com.company.Menu called todaysMenu

        todaysMenu.addMeal("Hamburger");
        todaysMenu.addMeal("Fish'n'Chips");
        todaysMenu.addMeal("Sauerkraut");

        todaysMenu.printMeals();

        todaysMenu.clearMenu();

        todaysMenu.printMeals();


    }

}
