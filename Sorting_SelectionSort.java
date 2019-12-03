package com.demigod.tutorial.sorting;

public class SelectionSort {

    public static void main(String args[]) {

        int[] myArr = {10, -8, -1, 5, 3, 7, 40, 9};
        sorting(myArr, myArr.length);
        printArray(myArr);
    }

    private static void sorting(int[] myArr, int length) {

        for (int i = 0; i < length; i++) {

            int min_idx = i; // lets consider i'th index as a minimum number
            for (int j = i + 1; j < length; j++) {
                if (myArr[i] < myArr[j])
                    min_idx = j; //here if j'th element is less than i'th element then put the index of j'th elemnt as small index
            }

            // here we swap the minimum index element to i'th position
            int temp = myArr[min_idx];
            myArr[min_idx] = myArr[i];
            myArr[i] = temp;
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
     * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
     *
     * 1) The subarray which is already sorted.
     * 2) Remaining subarray which is unsorted.
     *
     * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
     *
     *
     *
     * Following example explains the above steps:
     *
     *
     *
     * arr[] = 64 25 12 22 11
     *
     * // Find the minimum element in arr[0...4]
     * // and place it at beginning
     * 11 25 12 22 64
     *
     * // Find the minimum element in arr[1...4]
     * // and place it at beginning of arr[1...4]
     * 11 12 25 22 64
     *
     * // Find the minimum element in arr[2...4]
     * // and place it at beginning of arr[2...4]
     * 11 12 22 25 64
     *
     * // Find the minimum element in arr[3...4]
     * // and place it at beginning of arr[3...4]
     * 11 12 22 25 64 
     */
    
}
