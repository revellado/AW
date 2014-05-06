<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
  <head><title>Hello :: Spring Application</title></head>
  <body>
    <h1>Listado de transaciones</h1>
    <c:forEach items="${transactions}" var="transaction">
      <c:out value="${transaction.id.id}"/>&nbsp;&nbsp;&nbsp;<c:out value="${transaction.subject}"/>&nbsp;&nbsp;&nbsp;<c:out value="${transaction.extraInformation.toString()}"/>&nbsp;&nbsp;&nbsp;<c:out value="${transaction.date}"/>&nbsp;&nbsp;&nbsp;<c:out value="${transaction.effectiveDate}"/>&nbsp;&nbsp;&nbsp;<c:out value="${transaction.type}"/>&nbsp;&nbsp;&nbsp;<br/>
    </c:forEach>
    
    <br>
    <a href="<c:url value="addtransaction.htm"/>">Add a transaction</a>
    <br>
    
  </body>
</html>