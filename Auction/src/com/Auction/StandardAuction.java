package com.Auction;

public class StandardAuction extends AuctionTemp {
	
	public void startAuction() {
        System.out.println("Starting standard auction...");
        notifyBidders("Standard auction has started!");
    }

    @Override
    public void placeBid() {
        System.out.println("Placing a bid in the standard auction.");
        notifyBidders("A new bid has been placed in the standard auction.");
    }

    @Override
    public void endAuction() {
        System.out.println("Ending standard auction.");
        notifyBidders("Standard auction has ended!");
    }

}
