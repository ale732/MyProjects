package auction;

import auction.myBean.Auction;
import org.json.simple.parser.JSONParser;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;

public class AuctionListAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, ServletRequest request, ServletResponse response) throws Exception {
        AuctionListForm auctionListForm=new AuctionListForm();

        JSONParser parser=new JSONParser();
        Object object=parser.parse(new FileReader("/Users/u17401612/Documents/myProject/ru.mea/myStruts1.3/src/main/resources/auctions.properties"));

        JSONArray array= (JSONArray) object;

        List<Auction> auctions = new ArrayList<Auction>();

        for(int i=0; i<array.size();i++){
            Auction exsAuction= (Auction) array.get(i);
            auctions.add(exsAuction);
        }

        auctionListForm.setData(auctions);

        return (mapping.findForward("ok"));
    }

}
