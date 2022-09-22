<h2>
<%
 String uname = request.getParameter("txt_uid");
 String pass = request.getParameter("txt_pwd");
 
 out.println("Banking System");
 
%>
</h2>

<a href = "createaccount.jsp">Create account</a> <br><br>
<a href = "transaction.jsp">Transaction</a> <br><br>
<a href = "display.jsp">Display Statement</a> <br><br>
<a href = "creditcard.jsp">Authorize Credit Card Transaction</a> <br><br>