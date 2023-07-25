package com.java.dolmayan.dsa.sorting;

public class SelectionSort {

    public void selectionSort(int[] arr) {
        // Mutates arr so that it is sorted via selecting the minimum element and
        // swapping it with the corresponding index
        int minIndex;
        for(int i=0; i<arr.length; i++){
            minIndex = i;

            for(int j=i+1; j< arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
        // Swap current index with minimum element in rest of list
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;






        }






    }



}
