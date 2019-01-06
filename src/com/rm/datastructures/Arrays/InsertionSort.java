package com.rm.datastructures.Arrays;

public class InsertionSort {

    public static int[] sort(int[] arr) {
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++) {
            int newElement = arr[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0 && arr[i -1] > newElement; i--) {
                arr[i] = arr[i-1];
            }
            arr[i] = newElement;
        }

        for(int i: arr ){
            System.out.println(i);
        }

        return arr;
    }
}
