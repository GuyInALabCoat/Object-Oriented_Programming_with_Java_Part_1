package com.company;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    private Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    private boolean larger(Apartment otherApartment){
        if (this.squareMeters > otherApartment.squareMeters){   // method returns true if the this apartment is larger than other apartment
            return true;
        }

        return false;
    }

    private int priceDifference(Apartment otherApartment){
        int priceThisApt = this.squareMeters * this.pricePerSquareMeter;   // price of apartment for which the method is called
        int priceOtherApt = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;   // price of other apartment
        return Math.abs(priceThisApt - priceOtherApt);         // returns the abs value of the difference in price
    }

    private boolean moreExpensiveThan(Apartment otherApartment){
        int priceThisApt = this.squareMeters * this.pricePerSquareMeter;
        int priceOtherApt = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

        if (priceThisApt > priceOtherApt){      // if price of this apartment is greater than other apartment, return true
            return true;
        }

        return false;
    }

    public static void main(String[] args){
        Apartment studioManhatten = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);

        System.out.println(studioManhatten.moreExpensiveThan(twoRoomsBrooklyn));
        System.out.println(fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn));
    }
}
