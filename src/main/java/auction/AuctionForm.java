package auction;

import auction.myBean.Auction;
import org.apache.struts.action.ActionForm;

import java.util.ArrayList;
import java.util.List;

public class AuctionForm extends ActionForm {
    int auctionId;
    private List<Auction> data = new ArrayList<Auction>();

    public List<Auction> getData() {
        return data;
    }

    public void setData(List<Auction> data) {
        this.data = data;
    }

    public int getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(int auctionId) {
        this.auctionId = auctionId;
    }
}
