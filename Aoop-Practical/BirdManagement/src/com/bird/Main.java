package com.bird;

public class Main {

	public static void main(String[] args) {
		Bird bird = new Bird();
        bird.fly(); 
  
        Bird ostrich = new Ostrich();
        try {
            ostrich.fly(); 
        } 
        catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }

	}

}
