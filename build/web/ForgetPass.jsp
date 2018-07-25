<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center><h1>People Talk</h1></center><hr>
         <%
	String m=(String)session.getAttribute("msg");
	if(m!=null){
%>
		<b><%= m%></b>
<%
            session.setAttribute("msg", null);
	}
%> 
<form action="ForgetPassProcess.jsp" method="POST">
    Enter Registered Email Id :<input type="text" name="email" value="" />
    <input type="submit" value="Send" />
</form>
    </body>
</html>