
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="db.DbConnect"%>
<%@page import="java.util.HashMap"%>
<%
    HashMap ud=(HashMap)session.getAttribute("userdata");
    if(ud!=null){
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>peopletalk</title>
    </head>
    <body>
           <div>
               <form action="editprofile.jsp" method="post">
    <center><h1>People Talk</h1></center><br>
     <%
	String m=(String)session.getAttribute("msg");
	if(m!=null){
%>
		<b><%= m%></b>
<%
            session.setAttribute("msg", null);
	}
%> <hr>
    <h2>WELCOME <b><%=ud.get("name")%></b><a href='Logout.jsp'>logout</a></h2><hr>
     <img src="GetPhoto?email=<%=ud.get("email")%>" width="200" height="230"><br>
     EMAIL :<b><%=ud.get("email")%></b></br>
     PHONE NO :<b><%=ud.get("phone")%></b></br>
     DATE :<b><%=ud.get("dob")%></b></br>
     <input type="submit" value="Edit Profile" /><hr>
               </form>
           </div>
           <div>
            <form action="Searchprocess.jsp" method="post">
            <center><h2>Search People</h2><hr></center>     
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
             </form>
           </div>
    <%        
       }else{
      session.setAttribute("msg", "Plz Login First");
      response.sendRedirect("index.jsp");
      }
    %>
    </body>
</html>
