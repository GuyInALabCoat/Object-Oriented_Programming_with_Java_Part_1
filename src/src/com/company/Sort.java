package com.company;

public class Sort {
    private int[] arrayToSort;
    private int[] copyArray;
    private int smallestNumberIndex;
    private int smallestNumberinArray;
    private int smallest;

    public Sort(){
    }

    private int indexOfTheSmallest(){
        this.smallestNumberIndex = 0;                                       // initialize the smallest number index to 0
        this.smallestNumberinArray = this.copyArray[0];                     // set variable to the value of the first element in the copy array
        for(int i = 0; i < copyArray.length; i++){
            if(smallestNumberinArray > copyArray[i]){                       // if the value of the variable is LARGER than the value at the current index of the copy array
                smallestNumberIndex = i;                                    // set the index to the value of the iterator
                smallestNumberinArray = copyArray[i];                       // set the value of the variable to the value at the current index
            }
        }
        return smallestNumberIndex;                                         // return the index
    }
                                                                            // with each pass, the smallest element in the array is swapped with one of the elements to the left of the index
    private int indexOfTheSmallestStartingFrom(int sortSpaceIndex){         // therefore the array to the left of the sortSpaceIndex is already sorted
        this.copyArray = new int[this.arrayToSort.length - sortSpaceIndex]; // Therefore, the unsorted array to the right of the index is copied to another array of the size of the original array - the sortSpaceIndex
        int j = 0;                                                          // iterator for the copy array

        for(int i = sortSpaceIndex; i < this.arrayToSort.length; i++){      // starting at the sort index, iterate through the remaining array
            this.copyArray[j] = this.arrayToSort[i];                        // copy the values to the copy array
            j++;
        }

        return indexOfTheSmallest() + sortSpaceIndex;                       // find the index of the smallest element in the copy array AND add the current sort index
    }

    private void swap(int index1, int index2){
        int temp;                                                           // create a temp variable to hold one of the elements

        temp = this.arrayToSort[index1];                                    // set temp to the value of element1
        this.arrayToSort[index1] = this.arrayToSort[index2];                // set element1 to the value of element2
        this.arrayToSort[index2] = temp;                                    // set element2 to the value of temp, which was originally element1
    }

    public int[]selectionSort(int[] array){
        this.arrayToSort = array;
        for(int i = 0; i < this.arrayToSort.length; i++){                   // iterator that goes through an unsorted array called arrayToSort
            this.smallest = indexOfTheSmallestStartingFrom(i);              // starting from the current value of the iterator, find the index of the smallest value in the array
            swap(i, this.smallest);                                         // swap the elements at the current value of the iterator, and the current smallest element in arrayToSort
        }

        return this.arrayToSort;
    }

}
