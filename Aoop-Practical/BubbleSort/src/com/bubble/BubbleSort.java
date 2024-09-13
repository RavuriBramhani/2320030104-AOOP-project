package com.bubble;

public class BubbleSort {
	
	public static <T extends Comparable<T>> void bubbleSort(T[] array) {
        if (array == null || array.length < 2) {
            return; 
        }

        boolean swapped;
        int n = array.length;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1].compareTo(array[i]) > 0) {
                
                    T temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } 
        while (swapped);
    }

}
