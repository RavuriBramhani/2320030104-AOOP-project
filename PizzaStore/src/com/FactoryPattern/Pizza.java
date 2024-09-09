package com.FactoryPattern;

import java.util.ArrayList;

abstract class Pizza {
    abstract String getName();
    abstract String getDough();
    abstract String getSauce();
    protected ArrayList<String> toppings=new ArrayList<>();
    
    public void prepare() {
    	System.out.println("Preparing Pizza");
    	System.out.println("Mixing dough");
    	System.out.println("Adding sauce");
    	System.out.println("Adding toppings");
    	System.out.println("Baking in the oven");
    }
    
   public void bake() {
    	System.out.println("Bake in the oven for 30min at 450");
    }
    
   public void cut() {
    	System.out.println("Cut the pizza and serve");
    }
     
}
