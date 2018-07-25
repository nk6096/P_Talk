package pjava;

import db.DbConnect;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;

@MultipartConfig
public class Register extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
try {
      String e=request.getParameter("email");
      ServletContext application=getServletContext();
      DbConnect db=(db.DbConnect)application.getAttribute("db");
      if(db==null){
      db=new DbConnect();
      application.setAttribute("db",db);
          }
   PreparedStatement userDetails=db.getUserDetails();
    userDetails.setString(1, e);
    ResultSet rs=userDetails.executeQuery();
    if(rs.next()){
    session.setAttribute("msg", "Email ID Already Registered");
    response.sendRedirect("index.jsp");
    }
    else{
String n=request.getParameter("name");
String p=request.getParameter("phone");
String pass=request.getParameter("pass");

String d=request.getParameter("dob");
    java.text.SimpleDateFormat sdf=
            new java.text.SimpleDateFormat("yyyy-MM-dd");
    java.util.Date dt=sdf.parse(d);
    java.sql.Date date=new java.sql.Date(dt.getTime());
    
javax.servlet.http.Part file=request.getPart("photo");
java.io.InputStream fis=file.getInputStream();

String a=request.getParameter("area");
String c=request.getParameter("city");
String s=request.getParameter("state");

PreparedStatement insertUser=db.getInsertUser();
insertUser.setString(1, e);
insertUser.setString(2, pass);
insertUser.setString(3, n);
insertUser.setString(4, p);
insertUser.setDate(5, date);
insertUser.setBinaryStream(6, fis);
insertUser.setString(7, a);
insertUser.setString(8, c);
insertUser.setString(9, s);
insertUser.executeUpdate();
HashMap ud=new HashMap();
ud.put("email",e);
ud.put("name",n);
ud.put("phone",p);
ud.put("dob",date);
session.setAttribute("userdata", ud);
response.sendRedirect("profile.jsp");
    }
} catch (Exception ex) {
    session.setAttribute("msg", 
            "Registration Failed "+ex.getMessage());
    ex.printStackTrace();
    response.sendRedirect("index.jsp");
} 
    }
}
