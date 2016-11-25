package com.company;

public class Search {
    private int[] arrayToSearch;
    private int lowerLimit;
    private int upperLimit;
    private int searchValue;
    private int searchMidPoint;

    public Search(){
    }

    public boolean iterativeBinarySearch(int[] array, int searchedValue){                               // implement iterative Binary search
        this.arrayToSearch = array;
        this.lowerLimit = 0;                                                                            // set lowerLimit equal to the first index in the array
        this.upperLimit = this.arrayToSearch.length - 1;                                                // set upperLimit equal to the last index in the array
        this.searchValue = searchedValue;


        while(true){                                                                                    // setup infinite loop
            if (((this.lowerLimit != 0) || (this.upperLimit == 0)) && (this.lowerLimit - this.upperLimit) >= -1){
                this.lowerLimit++;                                                                      // if (lowerLimit is NOT 0 OR upperLimit is 0) AND the difference between them is -1 (to counteract the fact that decimal values get rounded down)
                                                                                                        // increase the lowerLimit by 1
            }
            this.searchMidPoint = average();                                                            // calculate the middle of the array to be searched

            if (this.lowerLimit > this.upperLimit){                                                     // if the number does not exist in the array, lowerLimit will increase by the statement above resulting in this exit from the loop
                return false;
            } else if (arrayToSearch[this.searchMidPoint] == this.searchValue) {                        // if the number is found in the array, return true
                return true;
            } else if (arrayToSearch[this.searchMidPoint] > this.searchValue) {                         // the search value is LESS than the middle of that current array, therefore the value can only exist to the LEFT of the midpoint
                this.upperLimit = this.searchMidPoint;
            } else {
                this.lowerLimit = this.searchMidPoint;                                                  // else, the value is GREATER than the middle of the current array, and is therefore to the RIGHT of the current midpoint
            }
        }
    }

    private int average() {                                                                             // simple average method. Note that fractions will be rounded DOWN
        return ((this.lowerLimit + this.upperLimit) / 2);
    }

}
