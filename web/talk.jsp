<%-- 
    Document   : talk
    Created on : Nov 17, 2017, 4:14:01 PM
    Author     : Nitish Chauhan
--%>

<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    HashMap ud=(HashMap)session.getAttribute("userdata");
    if(ud!=null){
        
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./CSS/style.css" type="text/css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body style="background-color:powderblue;">
         <center><h1>People Talk</h1></center><br>
         <form action="profile.jsp" method="POST">
    <h2>WELCOME <b><%=ud.get("name")%></b> Now You Can Talk <a href='Logout.jsp'>logout</a></h2>
    Go to : <input type="submit" value="Home" />
    <hr>
     </form>
         Email :
    </body>
</html>
 <%
}else{
session.setAttribute("msg", "Plz Login First!");
response.sendRedirect("index.jsp");
}    
%>