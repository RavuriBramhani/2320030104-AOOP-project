package com.Shopping;


class ShoppingCartFacadeTest {

	private ShoppingCartFacade cartFacade;

    public void setUp() {
        cartFacade = new ShoppingCartFacade();
    }

    public void testAddItemToCart() {
        cartFacade.addItemToCart("item1", 1);
        cartFacade.addItemToCart("item2", 2);
        cartFacade.addItemToCart("item3", 0);
        cartFacade.addItemToCart("item4", -1);
    }
 
    public void testReserveItem() {
        cartFacade.addItemToCart("item1", 1);
        cartFacade.addItemToCart("item2", 2);
        
    }

    public void testCheckoutAndPaySuccess() {
        cartFacade.addItemToCart("item1", 2);
        cartFacade.addItemToCart("item2", 3);
        String[] itemIds = { "item1", "item2" };
        int[] quantities = { 2, 3 };
        cartFacade.checkoutAndPay(itemIds, quantities, "Valid Payment");
    }

  void testCheckoutAndPayFailure() {
        cartFacade.addItemToCart("item1", 2);
        cartFacade.addItemToCart("item2", 3);
        String[] itemIds = { "item1", "item2" };
        int[] quantities = { 2, 3 };
        cartFacade.checkoutAndPay(itemIds, quantities, "");
    }

    public void testCalculateTotal() {
        Checkout checkout = new Checkout();
        String[] itemIds = { "item1", "item2" };
        int[] quantities = { 2, 3 };
        checkout.calculateTotal(itemIds, quantities);
        
    }

    public void testInventoryCheck() {
        InventoryManagment inventory = new InventoryManagment();
        inventory.checkItemAvailability("item1", 1);
        inventory.checkItemAvailability("item2", 2);
        
    }
}





