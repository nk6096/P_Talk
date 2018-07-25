package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>peopletalk</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center><h1>People Talk</h1></center>\n");
      out.write("    ");

	String m=(String)session.getAttribute("msg");
	if(m!=null){

      out.write("\n");
      out.write("\t\t<b>");
      out.print( m);
      out.write("</b>\n");

            session.setAttribute("msg", null);
	}

      out.write(" \n");
      out.write("<hr>    \n");
      out.write("<h2>Login Form</h2>\n");
      out.write("    <div>\n");
      out.write("    <form action='Loginprocess.jsp' method='post'>\n");
      out.write("    <b>User Id :</b><span style=\"margin-left:0.8em\"><input type='text' name='email' required /></span>\n");
      out.write("    </br></br>\n");
      out.write("    <b>Password :</b><input type='password' name='pass' required />\n");
      out.write("    </br></br>\n");
      out.write("    <input type='submit' value='Login' /><br>\n");
      out.write("    <a href='ForgetPass.jsp'>Forget Pass ?</a><hr>\n");
      out.write("    </form>\n");
      out.write("        </div>\n");
      out.write("<!--<div>\n");
      out.write("<h3>Forget Password:</h3>\n");
      out.write("<form action='ForgetPass.jsp' method='post'>\n");
      out.write("\t<b>Registered Email ID:</b> <input type='text' name='email' required /> \n");
      out.write("\t<br><br>\n");
      out.write("\t\t<input type='submit' value='Submit'/>\n");
      out.write("\t\t<input type='reset' value='Clear'/>\n");
      out.write("</form>\n");
      out.write("<hr> \n");
      out.write("   \n");
      out.write("</div>-->\n");
      out.write("        <div>\n");
      out.write("            <h2>Registration Form</h2>\n");
      out.write("            <form action='Register' method='post' enctype=\"multipart/form-data\">\n");
      out.write("<b>Email Id :</b><span style=\"margin-left:0.2em\"><input type='text' name='email' required /></span>\n");
      out.write("</br></br>\n");
      out.write("<b>Password :</b><input type='password' name='pass' required />\n");
      out.write("</br></br>\n");
      out.write("<b>Name :</b><span style=\"margin-left:1.5em\"><input type='text' name='name' required /></span>\n");
      out.write("</br></br>\n");
      out.write("<b>Phone :</b><span style=\"margin-left:1.4em\"><input type='text' name='phone' required /></span>\n");
      out.write("</br></br>\n");
      out.write("<b>DOB :</b><span style=\"margin-left:2em\"><input type=\"date\" value=\"2017-01-04\" name=\"dob\"/></span>\n");
      out.write("</br></br>\n");
      out.write("<b>Photo :</b><span style=\"margin-left:1.5em\"><input type=\"file\" name=\"photo\" value=\"\" width=\"150\" /></span>\n");
      out.write("</br></br>\n");
      out.write("<b>State :</b><span style=\"margin-left:1.6em\"><select name=\"state\">\n");
      out.write("    <option>New Delhi</option>\n");
      out.write("    <option>Bihar</option>\n");
      out.write("    <option>Punjab</option>\n");
      out.write("    <option>UP</option>\n");
      out.write("    </select></span>\n");
      out.write("</br></br>\n");
      out.write("<b>City :</b><span style=\"margin-left:2em\"><select name=\"city\">\n");
      out.write("    <option>Greater Noida</option>\n");
      out.write("    <option>Ghaziabad</option>\n");
      out.write("    <option>Ambala</option>\n");
      out.write("    <option>Patna</option>\n");
      out.write("    </select></span>\n");
      out.write("</br></br>\n");
      out.write("<b>Area :</b><span style=\"margin-left:1.8em\"><select name=\"area\">\n");
      out.write("    <option>Dadri</option>\n");
      out.write("    <option>SurajPur</option>\n");
      out.write("    <option>Gamma</option>\n");
      out.write("    <option>Alpha</option>\n");
      out.write("    </select></span>\n");
      out.write("</br></br>\n");
      out.write("<input type='submit' value='Register' />\n");
      out.write("<input type='reset' value='Clear'/>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
