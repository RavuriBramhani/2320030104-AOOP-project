package com.bubble;

public class Main {

	public static void main(String[] args) {
		Integer[] intArray = {5, 2, 8, 1, 9};
        System.out.println("Original Integer Array:");
        printArray(intArray);

        BubbleSort.bubbleSort(intArray);
        System.out.println("Sorted Integer Array:");
        printArray(intArray);

        Double[] doubleArray = {3.4, 2.2, 5.1, 1.6};
        System.out.println("\nOriginal Double Array:");
        printArray(doubleArray);

        BubbleSort.bubbleSort(doubleArray);
        System.out.println("Sorted Double Array:");
        printArray(doubleArray);

        String[] strArray = {"apple", "banana", "kiwi", "orange"};
        System.out.println("\nOriginal String Array:");
        printArray(strArray);

        BubbleSort.bubbleSort(strArray);
        System.out.println("Sorted String Array:");
        printArray(strArray);
    }

    private static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

	}

}
