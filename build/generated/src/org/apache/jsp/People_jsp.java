package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.HashMap;

public final class People_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    HashMap ud=(HashMap)session.getAttribute("userdata");
    if(ud!=null){

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>peopletalk</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color:powderblue;\">\n");
      out.write("        <div>\n");
      out.write("     <form action=\"profile.jsp\" method=\"POST\">\n");
      out.write("    <center><h1>People Talk</h1></center><hr>\n");
      out.write("    <h2>WELCOME <b>");
      out.print(ud.get("name"));
      out.write("</b> <a href='Logout.jsp'>logout</a></h2>\n");
      out.write("    Go to : <input type=\"submit\" value=\"Home\" />\n");
      out.write("    <hr>\n");
      out.write("     </form>\n");
      out.write("      </div>\n");
      out.write("    <div>\n");
      out.write("            <form action=\"Searchprocess.jsp\" method=\"post\">\n");
      out.write("            <center><h2>Search People</h2></center>     \n");
      out.write("           <b>State :</b><select name=\"state\">\n");
      out.write("               <option>New Delhi</option>\n");
      out.write("               <option>Bihar</option>\n");
      out.write("               <option>Punjab</option>\n");
      out.write("               <option>UP</option>\n");
      out.write("               </select>\n");
      out.write("                   </br></br>\n");
      out.write("           <b>City :</b><select name=\"city\">\n");
      out.write("               <option>Greater Noida</option>\n");
      out.write("               <option>Ghaziabad</option>\n");
      out.write("               <option>Ambala</option>\n");
      out.write("               <option>Patna</option>\n");
      out.write("               </select>\n");
      out.write("                   </br></br>\n");
      out.write("           <b>Area :</b><select name=\"area\">\n");
      out.write("               <option>Dadri</option>\n");
      out.write("               <option>SurajPur</option>\n");
      out.write("               <option>Gamma</option>\n");
      out.write("               <option>Alpha</option>\n");
      out.write("               </select>\n");
      out.write("                  </br></br>\n");
      out.write("<input type='submit' value='Go' /> \n");
      out.write("             </form><hr>\n");
      out.write("           </div>\n");
      out.write("    \n");

}else{
session.setAttribute("msg", "Plz Login First!");
response.sendRedirect("index.jsp");
}    

      out.write("\n");
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