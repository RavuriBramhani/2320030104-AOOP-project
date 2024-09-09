package com.FactoryPattern;

public class PizzaStore {

	public static void main(String[] args) {
		   
		        Pizza CheesePizza = new CheesePizza();
		        Pizza PineapplePizza = new PineapplePizza();

		        System.out.println("Order 1: " + CheesePizza.getName());
		        CheesePizza.prepare();
		        CheesePizza.bake();
		        CheesePizza.cut();
		       
		        System.out.println("\nOrder 2: " + PineapplePizza.getName());
		        PineapplePizza.prepare();
		        PineapplePizza.bake();
		        PineapplePizza.cut();
		       
		    }
		}
	


