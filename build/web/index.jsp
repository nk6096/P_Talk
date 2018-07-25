<%-- 
    Document   : index
    Created on : 4 Nov, 2017, 2:40:30 PM
    Author     : Nitish Chauhan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>peopletalk</title>
    </head>
    <body>
    <center><h1>People Talk</h1></center>
    <%
	String m=(String)session.getAttribute("msg");
	if(m!=null){
%>
		<b><%= m%></b>
<%
            session.setAttribute("msg", null);
	}
%> 
<hr>    
<h2>Login Form</h2>
    <div>
    <form action='Loginprocess.jsp' method='post'>
    <b>User Id :</b><span style="margin-left:0.8em"><input type='text' name='email' required /></span>
    </br></br>
    <b>Password :</b><input type='password' name='pass' required />
    </br></br>
    <input type='submit' value='Login' /><br>
    <a href='ForgetPass.jsp'>Forget Pass ?</a><hr>
    </form>
        </div>
<!--
<div>
<h3>Forget Password:</h3>
<form action='ForgetPass.jsp' method='post'>
	<b>Registered Email ID:</b> <input type='text' name='email' required /> 
	<br><br>
		<input type='submit' value='Submit'/>
		<input type='reset' value='Clear'/>
</form>
<hr> 
   
</div>
-->
        <div>
            <h2>Registration Form</h2>
            <form action='Register' method='post' enctype="multipart/form-data">
<b>Email Id :</b><span style="margin-left:0.2em"><input type='text' name='email' required /></span>
</br></br>
<b>Password :</b><input type='password' name='pass' required />
</br></br>
<b>Name :</b><span style="margin-left:1.5em"><input type='text' name='name' required /></span>
</br></br>
<b>Phone :</b><span style="margin-left:1.4em"><input type='text' name='phone' required /></span>
</br></br>
<b>DOB :</b><span style="margin-left:2em"><input type="date" value="2017-01-04" name="dob"/></span>
</br></br>
<b>Photo :</b><span style="margin-left:1.5em"><input type="file" name="photo" value="" width="150" /></span>
</br></br>
<b>State :</b><span style="margin-left:1.6em"><select name="state">
    <option>New Delhi</option>
    <option>Bihar</option>
    <option>Punjab</option>
    <option>UP</option>
    </select></span>
</br></br>
<b>City :</b><span style="margin-left:2em"><select name="city">
    <option>Greater Noida</option>
    <option>Ghaziabad</option>
    <option>Ambala</option>
    <option>Patna</option>
    </select></span>
</br></br>
<b>Area :</b><span style="margin-left:1.8em"><select name="area">
    <option>Dadri</option>
    <option>SurajPur</option>
    <option>Gamma</option>
    <option>Alpha</option>
    </select></span>
</br></br>
<input type='submit' value='Register' />
<input type='reset' value='Clear'/>
</form>
</div>
    </body>
</html>
