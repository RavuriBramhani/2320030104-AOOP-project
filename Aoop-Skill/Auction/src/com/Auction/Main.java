package com.Auction;

public class Main {

	public static void main(String[] args) {
		Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");

        AuctionTemp standardAuction = new StandardAuction();
        AuctionTemp reserveAuction = new ReserveAuction(1000.0);

        standardAuction.subscribe(bidder1);
        reserveAuction.subscribe(bidder1);
        reserveAuction.subscribe(bidder2);

        System.out.println("== Standard Auction ==");
        standardAuction.conductAuction();
        
        System.out.println("\n== Reserve Auction ==");
        reserveAuction.conductAuction();

        reserveAuction.unsubscribe(bidder2);
        
        System.out.println("\n== Reserve Auction (After Unsubscribe) ==");
        reserveAuction.conductAuction();

	}

}
