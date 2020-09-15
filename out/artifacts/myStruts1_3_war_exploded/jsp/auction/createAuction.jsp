<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%--
  Created by IntelliJ IDEA.
  User: u17401612
  Date: 01.09.2020
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html:html>
    <HEAD>
        <TITLE>Create Auction!</TITLE>
    </HEAD>
    <BODY>
    <c:set var="auctionId" value="${form.auction.auctionId}"/>
    <html:errors/>
    <html:form action="/SaveAuctionAction">
        <TABLE border="0" width="100%">
            <TR>
                <TH align="right">Auction Id:</TH><TD align="left">
                <html:text property="auctionId"/></TD>
            </TR>
            <TR>
                <TD align="right"><html:submit/></TD>
                <TD align="left"><html:reset/></TD>
            </TR>
        </TABLE>
    </html:form>
    </BODY>
</html:html>
