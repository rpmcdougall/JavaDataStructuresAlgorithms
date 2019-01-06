package com.rm.datastructures.Arrays;

import static com.rm.datastructures.Arrays.SortingUtils.swap;

public class BubbleSort {

    public static int[] sort(int[] arr) {

        for(int lastUnsortedIndex = arr.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(arr[i] > arr[i+1]) {
                    swap(arr, i, i+1);
                }
            }
        }

        for(int i: arr ){
            System.out.println(i);
        }

        return arr;
    }

}
