package com.MaxMin;


import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Integer[] intArray = {5, 2, 8, 1, 9};
        ValueComparator<Integer> intComparator = new ValueComparator<>();
        System.out.println("Integer Array:");
        System.out.println("Max: " + intComparator.findMax(intArray));
        System.out.println("Min: " + intComparator.findMin(intArray));

        // String array
        String[] strArray = {"apple", "banana", "kiwi", "orange"};
        ValueComparator<String> strComparator = new ValueComparator<>();
        System.out.println("\nString Array:");
        System.out.println("Max: " + strComparator.findMax(strArray));
        System.out.println("Min: " + strComparator.findMin(strArray));

        // Character array
        Character[] charArray = {'d', 'a', 'c', 'b'};
        ValueComparator<Character> charComparator = new ValueComparator<>();
        System.out.println("\nCharacter Array:");
        System.out.println("Max: " + charComparator.findMax(charArray));
        System.out.println("Min: " + charComparator.findMin(charArray));

        // Float array
        Float[] floatArray = {3.4f, 2.2f, 5.1f, 1.6f};
        ValueComparator<Float> floatComparator = new ValueComparator<>();
        System.out.println("\nFloat Array:");
        System.out.println("Max: " + floatComparator.findMax(floatArray));
        System.out.println("Min: " + floatComparator.findMin(floatArray));
	}

}
