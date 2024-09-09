package com.Auction;

public class ReserveAuction extends AuctionTemp{
	
	private double reservePrice;

    public ReserveAuction(double reservePrice) {
        this.reservePrice = reservePrice;
    }

    public void startAuction() {
        System.out.println("Starting reserve auction with a reserve price of " + reservePrice + "...");
        notifyBidders("Reserve auction has started! Reserve price is " + reservePrice);
    }

    public void placeBid() {
        System.out.println("Placing a bid in the reserve auction.");
        notifyBidders("A new bid has been placed in the reserve auction.");
    }

    public void endAuction() {
        System.out.println("Ending reserve auction.");
        notifyBidders("Reserve auction has ended!");
    }

}
