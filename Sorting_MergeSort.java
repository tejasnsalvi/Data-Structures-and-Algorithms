package com.demigod.tutorial.sorting;

public class MergeSort {

    /**
     * Merge sort works on Divide and Conquer principle
     * we divide the input array into smallest array possible that is
     * from begining it will have one one element in left and right array and then
     * merge these sorted arrays
     *
     * @param args
     */
    public static void main(String args[]) {

        int[] myArr = {10, -8, -1, 5, 3, 7, 40, 9};
        mergeSort(myArr, myArr.length);
    }

    private static void mergeSort(int[] myArr, int length) {

        if (length <= 1) {
            return;
        }

        int mid = length / 2;

        int[] leftArr = new int[mid];

        int[] rightArr = new int[length - mid];

        for (int i = 0; i < mid; i++)
            leftArr[i] = myArr[i];

        for (int i = mid; i < length; i++)
            rightArr[i - mid] = myArr[i];

        mergeSort(leftArr, mid);
        mergeSort(rightArr, length - mid);
        merging(myArr, leftArr, rightArr);

    }

    /**
     * Here we always pass sorted left and right arrays
     *
     * @param myArr
     * @param leftArr
     * @param rightArr
     */
    private static void merging(int[] myArr, int[] leftArr, int[] rightArr) {

        int i = 0, j = 0, k = 0;

        //Here we compare left array element with right array
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j])
                myArr[k++] = leftArr[i++];
            else
                myArr[k++] = rightArr[j++];
        }

        /**
         * After performing the above either right or left array might have some extra elements 
         * Since we dont know which we check and dump the extra elements from any of the array to myArr
         */

        while (i < leftArr.length)
            myArr[k++] = leftArr[i++];

        while (j < rightArr.length)
            myArr[k++] = rightArr[j++];

        // just for printing purpose
        System.out.print("After Sorting: ");
        for (int m = 0; m < myArr.length; m++)
            System.out.print(myArr[m] + " ");
        System.out.print("\n");
    }
}
