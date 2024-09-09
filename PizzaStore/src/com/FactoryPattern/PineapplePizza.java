package com.FactoryPattern;

public class PineapplePizza extends Pizza{
	private String name = "Pineapple Pizza";
    private String dough = "Soft and Strechy";
    private String sauce = "Tomato Sauce";
    
    public PineapplePizza() {
    	toppings.add("Grated Reggiano Cheese");
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
