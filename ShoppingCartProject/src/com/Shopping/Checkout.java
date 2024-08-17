package com.Shopping;

public class Checkout {
	
	public double calculateTotal(String[] itemIds, int[] quantities) {
        double total = 0.0;
        for (int i = 0; i < itemIds.length; i++) {
            total += 10 * quantities[i];
        }
        System.out.println("Total calculated: " + total);
        return total;
    }

}
