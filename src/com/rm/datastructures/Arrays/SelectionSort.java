package com.rm.datastructures.Arrays;

import static com.rm.datastructures.Arrays.SortingUtils.swap;

public class SelectionSort {

    public static int[] sort(int[] arr) {

            for(int lastUnsortedIndex = arr.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
                int largest = 0;
                for(int i = 1; i <= lastUnsortedIndex; i++) {
                    if(arr[i] > arr[largest]) {
                        largest = i;
                    }
                }
                swap(arr, largest, lastUnsortedIndex);
            }

            for(int i: arr ){
                System.out.println(i);
            }

            return arr;
        }

}
