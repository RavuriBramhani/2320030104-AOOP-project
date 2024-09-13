package com.thread;

import java.lang.Thread;

public class Main {

	public static void main(String[] args) {
		
		Number number=new Number();
		
		Thread t1 = new Thread(new Runnable() {
            public void run() {
                number.printTwo();
            }
        });
		
		Thread t2 = new Thread(new Runnable() {
            public void run() {
                number.printThree();
            }
        });
		
		Thread t3 = new Thread(new Runnable() {
            public void run() {
                number.printFour();
            }
        });
		
		Thread t4 = new Thread(new Runnable() {
            public void run() {
                number.printFive();
            }
        });
		
		Thread t5 = new Thread(new Runnable() {
            public void run() {
                number.printNumber();
            }
        });
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		 try {
	            t1.join();
	            t2.join();
	            t3.join();
	            t4.join();
	            t5.join();
	        } 
		 catch (InterruptedException e) {
	            e.printStackTrace();
	        }
		

	}

}
