package com.Auction;

public abstract class AuctionTemp extends Auction{
	
	public final void conductAuction() {
        startAuction();
        placeBid();
        endAuction();
    }

}
