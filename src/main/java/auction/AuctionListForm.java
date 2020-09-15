package auction;

import auction.myBean.Auction;

import java.util.ArrayList;
import java.util.List;

public class AuctionListForm {
    private List<Auction> data = new ArrayList<Auction>();

    public List<Auction> getData() {
        return data;
    }

    public void setData(List<Auction> data) {
        this.data = data;
    }
}
