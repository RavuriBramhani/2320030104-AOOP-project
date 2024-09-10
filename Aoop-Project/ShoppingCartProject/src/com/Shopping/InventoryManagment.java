package com.Shopping;

public class InventoryManagment {
	
	public boolean checkItemAvailability(String itemId, int quantity) {
        System.out.println("Checking availability for item: " + itemId);
        return true; 
}
	
	public void reserveItem(String itemId, int quantity) {
        System.out.println("Reserving " + quantity + " of item: " + itemId);
    }
}
