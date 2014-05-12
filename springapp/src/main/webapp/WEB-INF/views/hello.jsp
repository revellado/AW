<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>
    <c:forEach items="${transactions}" var="transaction">
      <c:out value="${transaction.subject}"/>&nbsp;&nbsp;&nbsp;<c:out value="${transaction.extraInformation.toString()}"/>&nbsp;&nbsp;&nbsp;<c:out value="${transaction.date}"/>&nbsp;&nbsp;&nbsp;<c:out value="${transaction.effectiveDate}"/><br/>
    </c:forEach>
    
    <br>
    <a href="<c:url value="addtransaction.htm"/>"><fmt:message key="addTransaction"/></a>
    <br>
    
  </body>
</html>