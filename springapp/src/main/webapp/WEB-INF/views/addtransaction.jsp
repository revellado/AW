<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<body>
<h1><fmt:message key="addTransaction.heading"/></h1>
<form:form method="post" commandName="newTransaction">
  <table width="95%" bgcolor="f8f8ff" border="0" cellspacing="0" cellpadding="5">
    <tr>
      <td align="right" width="20%"><fmt:message key="addTransaction.amount"/></td>
        <td width="20%">
          <form:input path="amount"/>
        </td>
        <td width="60%">
          <form:errors path="amount" cssClass="error"/>
        </td>
    </tr>
    <tr>
      <td align="right" width="20%"><fmt:message key="addTransaction.date"/></td>
        <td width="20%">
          <form:input path="date"/>
        </td>
        <td width="60%">
          <form:errors path="date" cssClass="error"/>
        </td>
    </tr>
    <tr>
      <td align="right" width="20%"><fmt:message key="addTransaction.effectiveDate"/></td>
        <td width="20%">
          <form:input path="effectiveDate"/>
        </td>
        <td width="60%">
          <form:errors path="effectiveDate" cssClass="error"/>
        </td>
    </tr>
    <tr>
      <td align="right" width="20%"><fmt:message key="addTransaction.subject"/></td>
        <td width="20%">
          <form:input path="subject"/>
        </td>
        <td width="60%">
          <form:errors path="subject" cssClass="error"/>
        </td>
    </tr>
    <tr>
      <td align="right" width="20%"><fmt:message key="addTransaction.extraInforamtion"/></td>
        <td width="20%">
          <form:input path="extraInformation"/>
        </td>
        <td width="60%">
          <form:errors path="extraInformation" cssClass="error"/>
        </td>
    </tr>
    <tr>
      <td align="right" width="20%"><fmt:message key="addTransaction.transactionType"/></td>
        <td width="20%">
         	<form:select path="transactionType" id="transactionType">
	        	<form:option value=""><fmt:message key="addTransaction.emptyTransactionType"/></form:option>
	       	 	<form:option value="CHARGE"><fmt:message key="addTransaction.charge"/></form:option>
	        	<form:option value="PAYMENT"><fmt:message key="addTransaction.payment"/></form:option>
	        	<form:option value="PAYROLL"><fmt:message key="addTransaction.payroll"/></form:option>
	        	<form:option value="SALARY"><fmt:message key="addTransaction.salary"/></form:option>
	        	<form:option value="IN"><fmt:message key="addTransaction.in"/></form:option>
	        	<form:option value="OUT"><fmt:message key="addTransaction.out"/></form:option>
   			</form:select>
        </td>
        <td width="60%">
          <form:errors path="transactionType" cssClass="error"/>
        </td>
    </tr>
    
  </table>
  <br>
  <input type="submit" value="Execute">
</form:form>
<a href="<c:url value="hello.htm"/>"><fmt:message key="addTransaction.home"/></a>
</body>
</html>