<%@page import="java.util.HashMap"%>
<%@page import="db.DbConnect"%>
<%@page import="java.sql.*"%>
<%
    HashMap ud=(HashMap)session.getAttribute("userdata");
    if(ud!=null){
%>
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>peopletalk</title>
    </head>
     <body>
<%
String a=request.getParameter("area");
String c=request.getParameter("city");
String s=request.getParameter("state");
DbConnect db=(DbConnect)application.getAttribute("db");
    if(db==null){
    db=new DbConnect();
    application.setAttribute("db",db);
    }
    PreparedStatement getArea=(PreparedStatement)db.getgetArea();
    getArea.setString(1, a);
    getArea.setString(2, c);
    getArea.setString(3, s);
    ResultSet rs=getArea.executeQuery();
    if(rs.next()){    
    %>
    <center><h1>People Talk</h1></center><hr>    
    <div>
     <form action="profile.jsp" method="POST">
    <h2>WELCOME <b><%=ud.get("name")%></b> <a href='Logout.jsp'>logout</a></h2>
    Go to : <input type="submit" value="Home" />
    <hr>
     </form>
      </div>
    <div>
            <form action="Searchprocess.jsp" method="post">
            <center><h2>Search People</h2></center>     
           <b>State :</b><select name="state">
               <option>New Delhi</option>
               <option>Bihar</option>
               <option>Punjab</option>
               <option>UP</option>
               </select>
                   </br></br>
           <b>City :</b><select name="city">
               <option>Greater Noida</option>
               <option>Ghaziabad</option>
               <option>Ambala</option>
               <option>Patna</option>
               </select>
                   </br></br>
           <b>Area :</b><select name="area">
               <option>Dadri</option>
               <option>SurajPur</option>
               <option>Gamma</option>
               <option>Alpha</option>
               </select>
                  </br></br>
<input type='submit' value='Go' /> 
             </form><hr>
           </div>
    Search Results for:<b> <%=rs.getString(7)%>, <%=rs.getString(8)%>,
        <%=rs.getString(9)%></b>
  <hr>
  <%  
      do{
          if((ud.get("email")).equals(rs.getString(1))==false){
   %>
   <img src="GetPhoto?email=<%=rs.getString(1)%>" width="100" height="120"><br>
   Name :<b><%=rs.getString(3)%></b><br>
   Email :<b><%=rs.getString(1)%></b><br>
   <form action="talk.jsp" method="POST">
       <input type="hidden" name="remail" value="<%=rs.getString(1)%>" />
   <input type="submit" value="Talk" />
   </form>
   <hr>
    </body>
</html>
    <%
       } }while(rs.next());
    %>
    <%
}else{
    session.setAttribute("msg","No Record!!");
    response.sendRedirect("profile.jsp");
    }      
%>
 <%
}else{
session.setAttribute("msg", "Plz Login First!");
response.sendRedirect("index.jsp");
}    
%>