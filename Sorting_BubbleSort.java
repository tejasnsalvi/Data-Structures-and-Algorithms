package com.demigod.tutorial.sorting;

public class BubbleSort {

    public static void main(String args[]) {

        int[] myArr = {10, -8, -1, 5, 3, 7, 40, 9};
        sorting(myArr, myArr.length);
        printArray(myArr);
    }

    private static void sorting(int[] myArr, int length) {

        for (int i = 0; i < length - 1; i++) {
        // i loop is only for looping till lenght-1 passes
        
        //here you swap adjacent elements 
            for (int j = 0; j < length - i - 1; j++) {
                if (myArr[j] > myArr[j + 1]) {
                    // swap arr[j+1] and arr[i] 
                    int temp = myArr[j + 1];
                    myArr[j + 1] = myArr[j];
                    myArr[j] = temp;
                }
            }
        }
    }

    /* A utility function to print array */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    /**
     * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
     * Example:
     * First Pass:
     * ( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
     * ( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
     * ( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
     * ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.
     *
     * Second Pass:
     * ( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
     * ( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
     * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
     * ( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )
     * Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.
     *
     * Third Pass:
     * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
     * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
     * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
     * ( 1 2 4 5 8 ) –> ( 1 2 4 5 8 ) 
     */
}
