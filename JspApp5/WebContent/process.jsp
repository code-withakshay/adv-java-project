<%@page errorPage="error.jsp" %>

<%

	String sno1=request.getParameter("t1");
	String sno2=request.getParameter("t2");
	
	int a=Integer.parseInt(sno1);
	int b=Integer.parseInt(sno2);
	
	int c=a/b;
%>
<center>
	<h1>
			<%= "Division of two Numbers is ="+c  %>
	</h1>
</center>