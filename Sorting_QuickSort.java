package com.demigod.tutorial.sorting;

public class QuickSort {

    public static void main(String args[]) {

        int[] myArr = {10, -8, -1, 5, 3, 7, 40, 7};
        sorting(myArr, 0, myArr.length - 1);
        printArray(myArr);
    }

    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      start  --> Starting index, 
      end  --> Ending index */
    private static void sorting(int[] myArr, int start, int end) {

        if (start < end) {
            int partitionIndex = getPartitionIndex(myArr, start, end); //partition index , element present over here is in its correct position
            sorting(myArr, start, partitionIndex - 1); // left side array before partition index
            sorting(myArr, partitionIndex + 1, end); // right side array after partition index
        }
    }

    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    private static int getPartitionIndex(int[] myArr, int start, int end) {

        int pivot = myArr[end]; // we take pivot as the last element in index
        int i = start - 1;

        for (int j = start; j < end; j++) {
            // If current element is smaller than the pivot 
            if (myArr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = myArr[j];
                myArr[j] = myArr[i];
                myArr[i] = temp;
            }
        }

        // swap arr[i+1] and arr[pivot] 
        int temp = myArr[end];
        myArr[end] = myArr[i + 1];
        myArr[i + 1] = temp;

        return i + 1;
    }

    /* A utility function to print array */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}
