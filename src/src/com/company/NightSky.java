package com.company;

import java.util.Random;

public class NightSky {
    double density;                 // three object variables, density, height and width
    int width;
    int height;
    Random random = new Random();
    int starsInLastPrint;

    public NightSky(double density){ // constructor, when only density is given
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height){ // constructor, when height and width are provided, but not density
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }

    public NightSky(double density, int width, int height){ // constructor
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine(){
        for(int i = 0; i < this.width; i++){        // prints a line of stars, with length determined by the width
                                                    // and stars determined by the random generator and density
            if(random.nextDouble() <= this.density){    // if random double is less than the given density, print a star
                System.out.print("*");
                this.starsInLastPrint++;            // increment the number of stars in the last print
            } else {
                System.out.print(" ");              // else print a space
            }
        }
    }

    public void print(){                            // prints the night sky of a given size
        this.starsInLastPrint = 0;                  // sets the number of stars counted to 0
        for(int i = 0; i < this.height; i++){       // calls printLine i times
            printLine();
            System.out.println("");                 // carriage return, starts a new line at the end of a print
        }
    }

    public int starsInLastPrint() {                 // returns the number of stars printed in the previous night sky.
        return starsInLastPrint;
    }

    public static void main(String[] args){
        NightSky NightSky = new NightSky(0.05, 80, 40);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }
}
