package com.binary;

public class BinarySearch<T extends Comparable<T>> {
	
	public int search(T[] array, T target) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = target.compareTo(array[mid]);

            if (comparison == 0) {
                return mid; 
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;

}
}
