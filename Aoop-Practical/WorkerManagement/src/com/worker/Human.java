package com.worker;

public class Human implements Worker,Eater{
	
	public void work() {
        System.out.println("The human is working.");
    }

    public void eat() {
        System.out.println("The human is eating.");
    }

}
