package com.Shopping;

public class ShoppingCartFacade {
	private InventoryManagment inventory;
    private Checkout checkout;
    private PaymentProcessing payment;

    public ShoppingCartFacade() {
        this.inventory = new InventoryManagment();
        this.checkout = new Checkout();
        this.payment = new PaymentProcessing();
    }

    public boolean addItemToCart(String itemId, int quantity) {
        if (inventory.checkItemAvailability(itemId, quantity)) {
            inventory.reserveItem(itemId, quantity);
            return true;
        } else {
            System.out.println("Item not available: " + itemId);
            return false;
        }
    }

    public boolean checkoutAndPay(String[] itemIds, int[] quantities, String paymentDetails) {
        double totalAmount = checkout.calculateTotal(itemIds, quantities);
        return payment.processPayment(paymentDetails, totalAmount);
    }

}
