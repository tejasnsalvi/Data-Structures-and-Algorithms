package com.demigod.tutorial.sorting;

public class InsertionSort {

    public static void main(String args[]) {

        int[] myArr = {10, -8, -1, 5, 3, 7, 40, 9};
        sorting(myArr, myArr.length);
        printArray(myArr);
    }

    private static void sorting(int[] myArr, int length) {
        for (int i = 1; i < length; i++) {
            int key = myArr[i];
            int j = i - 1;
            
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j >= 0 && myArr[j] > key) {

                myArr[j + 1] = myArr[j];
                j--;
            }
            myArr[j + 1] = key;
        }
    }

    /* A utility function to print array */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
