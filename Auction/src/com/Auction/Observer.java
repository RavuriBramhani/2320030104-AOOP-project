package com.Auction;

import java.util.List;
import java.util.ArrayList;

public interface Observer {
	
	void update(String event);
	}

	abstract class Auction {
		private List<Observer> Bidder = new ArrayList<>();

	    public void subscribe(Observer bidder) {
	        Bidder.add(bidder);
	    }

	    public void unsubscribe(Observer bidder) {
	        Bidder.remove(bidder);
	    }

	    public void notifyBidders(String event) {
	        for (Observer bidder : Bidder) {
	            bidder.update(event);
	        }
	    }

	    public abstract void startAuction();
	    public abstract void placeBid();
	    public abstract void endAuction();

}
