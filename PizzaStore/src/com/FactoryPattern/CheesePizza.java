package com.FactoryPattern;

public class CheesePizza extends Pizza {
	private String name = "Cheese Pizza";
    private String dough = "Soft and Strechy";
    private String sauce = "Tomato Sauce";
    
    public CheesePizza() {
    	toppings.add("Shredded Cheese");
    }
    
    public String getName() {
    	return name;
    }
    
    public String getDough() {
    	return dough;
    }
    
    public String getSauce() {
    	return sauce;
    }
    
    public void cut() {
    	System.out.println("Cut the pizza into equal pieces");
    }
    
}
