<% 
	String name = request.getParameter("t1");
    int  n=Integer.parseInt(name);
	
	for(int i=2;i<=n;i++)
	{
	  boolean flag=true;
	  for(int j=2;j<i/2;j++)
	  {
		  if(i%j==0)
		  {
			  flag=false;
			  break;

		  }  
	  }
	  if(flag)
	     out.println(i+" ");
	 
	}
%>

