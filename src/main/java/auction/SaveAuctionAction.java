package auction;

import auction.myBean.Auction;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaveAuctionAction extends Action {

    public ActionForward execute (ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException, ParseException {
        List<Auction> auctions = new ArrayList<>();

        AuctionForm auctionForm = (AuctionForm) form;//ntcn

        Auction newAuction=new Auction();
        int auctionId=auctionForm.getAuctionId();
        newAuction.setAuctionId(auctionId);
        auctions.add(newAuction);

        FileOutputStream fileOutputStream=new FileOutputStream("/Users/u17401612/Documents/myProject/ru.mea/myStruts1.3/src/main/resources/auctions.properties", true);

        ObjectMapper mapper=new ObjectMapper();
        mapper.writeValue(fileOutputStream,auctions);

        AuctionListForm auctionListForm=new AuctionListForm();

        JSONParser parser=new JSONParser();
        Object object=parser.parse(new FileReader("/Users/u17401612/Documents/myProject/ru.mea/myStruts1.3/src/main/resources/auctions.properties"));

        JSONArray array= (JSONArray) object;

        List<Auction> auctionsList = new ArrayList<Auction>();

        for(int i=0; i<array.size();i++){
            Auction exsAuction= (Auction) array.get(i);
            auctionsList.add(exsAuction);
        }

        auctionListForm.setData(auctionsList);
        auctionForm.setData(auctionsList);

        return (mapping.findForward("ok"));
    }
}
