<%--
  Created by IntelliJ IDEA.
  User: u17401612
  Date: 03.08.2020
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-logic" prefix="logic" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-tiles" prefix="tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html:html>
    <HEAD>
        <TITLE>Create Auction!</TITLE>
    </HEAD>
    <BODY>${auction.auctionId}
    <c:set var="data" value=""/>
    <c:set var="auctions" value="${form.data}"/>
    <html:errors/>
    <html:form action="/ListAuction">
        <c:forEach var="auction" items="${auctions}"/>
        <p>
            <c:out value="${auction.auctionId}"/>
        </p>
    </html:form>
    </BODY>
</html:html>
