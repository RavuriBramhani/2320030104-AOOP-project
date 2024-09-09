package com.tree;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetExam {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");

        System.out.println("Initial TreeSet: " + treeSet);

        treeSet.remove("Cherry");

        System.out.println("After removing 'Cherry': " + treeSet);

        treeSet.add("Fig");

        System.out.println("After adding 'Fig': " + treeSet);

        Iterator<String> iterator = treeSet.iterator();
        System.out.print("Final TreeSet: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
	}
}
