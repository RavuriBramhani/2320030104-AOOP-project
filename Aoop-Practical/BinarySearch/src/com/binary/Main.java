package com.binary;

public class Main {

	public static void main(String[] args) {
		Integer[] intArray = {1, 3, 5, 7, 9, 11, 13};
        BinarySearch<Integer> intSearch = new BinarySearch<>();
        int intIndex = intSearch.search(intArray, 7);
        System.out.println("Index of 7 in Integer array: " + intIndex);

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        BinarySearch<Double> doubleSearch = new BinarySearch<>();
        int doubleIndex = doubleSearch.search(doubleArray, 4.4);
        System.out.println("Index of 4.4 in Double array: " + doubleIndex);

        String[] strArray = {"apple", "banana", "cherry", "date", "fig"};
        BinarySearch<String> strSearch = new BinarySearch<>();
        int strIndex = strSearch.search(strArray, "cherry");
        System.out.println("Index of 'cherry' in String array: " + strIndex);

	}

}
