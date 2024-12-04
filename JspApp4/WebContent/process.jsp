<%!

		int data=100;
		int cube(int n)
		{
			return n*n*n;
			
		}
%>
<center>
	<h1>
			<%= "The value is="+data %> <br>
	</h1>
	<h1>
			<%=  "The cube of a given number is="+cube(5) %>
	</h1>
</center>

x