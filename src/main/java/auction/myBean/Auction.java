package auction.myBean;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;

@JsonAutoDetect
public class Auction implements Serializable {
    private int auctionId;

    public int getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(int auctionId) {
        this.auctionId = auctionId;
    }

//    public Auction(int auctionId) {
//        this.auctionId = auctionId;
//    }
}
