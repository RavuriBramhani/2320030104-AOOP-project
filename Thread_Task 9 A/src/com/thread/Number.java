package com.thread;

public class Number {
	
	private static final int Max_Number=15;
	
	
	public void printTwo() {
		for(int i=1;i<Max_Number;i++) {
			if(i%2==0 && i%3!=0 && i%4!=0 && i%5!=0) {	
				System.out.println("Divisible by 2: "+i);	
			}
		}
	}
	
	public void printThree() {
		for(int i=1;i<Max_Number;i++) {
            if(i%2!=0 && i%3==0 && i%4!=0 && i%5!=0) {
            	System.out.println("Divisible by 3: "+i);
			}	
		}
	}
	
	public void printFour() {
		for(int i=1;i<Max_Number;i++) {
            if(i%2!=0 && i%3!=0 && i%4==0 && i%5!=0) {
            	System.out.println("Divisible by 4: "+i);
			}	
		}
	}
	
	
	public void printFive() {
		for(int i=1;i<Max_Number;i++) {
            if(i%2!=0 && i%3!=0 && i%4!=0 && i%5==0) {
            	System.out.println("Divisible by 5: "+i);
			}	
		}
	}
	
	public void printNumber() {
		for(int i=1;i<Max_Number;i++) {
            if(i%2!=0 && i%3!=0 && i%4!=0 && i%5!=0) {
            	System.out.println("Number is: "+i);
			}	
		}
		
	}		

}
