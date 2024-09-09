package com.Auction;

public class Bidder implements Observer{
	
	private String name;

    public Bidder(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println("Bidder " + name + " received notification: " + event);
    }

}
