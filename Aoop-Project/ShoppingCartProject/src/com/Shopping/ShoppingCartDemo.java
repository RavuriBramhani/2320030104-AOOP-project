package com.Shopping;

public class ShoppingCartDemo {

	public static void main(String[] args) {
        ShoppingCartFacade cartFacade = new ShoppingCartFacade();
        
        String itemId = "item1";
        int quantity = 2;
        
        if (cartFacade.addItemToCart(itemId, quantity)) {
            System.out.println("Item added to cart successfully.");
        }
        
        String[] itemIds = { "item1", "item2" };
        int[] quantities = { 2, 3 };
        String paymentDetails = "Credit Card";
        
        if (cartFacade.checkoutAndPay(itemIds, quantities, paymentDetails)) {
            System.out.println("Checkout and Payment Successful.");
        } else {
            System.out.println("Checkout or Payment Failed.");
        }

	}

}
