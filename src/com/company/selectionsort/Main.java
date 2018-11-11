package com.company.selectionsort;

    public class Main {
        public static void main(String[] args){
            //setting int[] (array) named intArray of integers
            int[] intArray = {20, 35, -15, 7, 55, 1, -22};

            //iterating across array from right to left from last unsorted index, decrementing
            for (int lastUnsortedI = intArray.length - 1; lastUnsortedI > 0;
                 lastUnsortedI--){
                int largest = 0;
                        //inner loop, comparing against largest element
                        for (int i = 1; i <= lastUnsortedI; i++){
                            if(intArray[i] > largest) {
                                largest = i;
                            }

                        }
                //if new largest element after loop, swap largest element with last
                swap(intArray, largest,lastUnsortedI);
            }

            //beginning at index 0, incrementing through length, print out sorted array
            for (int i = 0; i < intArray.length; i++){
                System.out.print(intArray[i]);
            }
        }

        //function to swap(sort) in selection sort
        public static void swap(int[] array, int i, int j){
            //if indexes' integer values of compared indexes are equal, return
            if (i == j){
                return;
            }

        }
    }

//-Selection sort
//        -Beginning of array, unsorted array
//        -Get last unsorted index
//        -Traverse array from left to right
//        -keep track of index of largest element in unsorted partition
//        -keep incrementing vs. largest element’s index, if greater, change largest to that increment’s index
//        -when index of traversal is last unsorted index, swap largest index in unsorted with LAST element in unsorted, decrement last unsorted index, begin traversing again
//
//        In place algo: uses no extra memory or fields, amount of memory doesn’t depend on number of items
//        O(n2): quadratic/squared time complexity
//        One swap per traversal so performs better than bubble sort in general
//        Unstable algo: if you have duplicate elements, original relative order is not preserved

