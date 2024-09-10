package com.MaxMin;

public class ValueComparator<T extends Comparable<T>> implements Comparable<T> {
	
	public T findMax(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        T max = array[0];
        for (T value : array) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }

    @Override
    public T findMin(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        T min = array[0];
        for (T value : array) {
            if (value.compareTo(min) < 0) {
                min = value;
            }
        }
        return min;
    }

}
