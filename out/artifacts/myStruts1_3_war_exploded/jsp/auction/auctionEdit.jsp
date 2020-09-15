<%--
  Created by IntelliJ IDEA.
  User: u17401612
  Date: 01.08.2020
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>


<html>
<head>
    
</head>
<body>
<html:form action="/CreateAuction.do">
    <bean:write name="auctionForm" property="myNum"/>
    <bean:write name="auctionForm" property="auction.auctionId"/>

    ${auctionForm.auction.auctionId}
    <br/>
    ${hui}
    <input type="hidden"  name="action" value="save">
    <html:submit value="Save"/>

</html:form>



</body>
</html>
