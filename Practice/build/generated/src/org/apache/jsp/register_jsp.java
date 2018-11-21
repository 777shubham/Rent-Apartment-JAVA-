package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <head>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register Page</title>\n");
      out.write("        <style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;\n");
      out.write("height:500px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("form {border: 4px solid ;\n");
      out.write("     text-align:center;\n");
      out.write("}\n");
      out.write("input:hover {\n");
      out.write("    \n");
      out.write("    opacity: 1;\n");
      out.write("}\n");
      out.write("     </style>  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     \n");
      out.write("<h2><center>Login Form</center></h2>\n");
      out.write("<form style=\"background-color: aqua; margin-left: 20px; margin-right: 20px;\"id=\"form\" action=\"LoginRegister\" method=\"POST\">\n");
      out.write("<fieldset> \n");
      out.write("<div class=\"imgcontainer\">\n");
      out.write("<img src=\"logo.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("</div>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <label for=\"email\"><b>E-mail-Id:</b></label>\n");
      out.write("<input type=\"email\" name=\"email\"/>\n");
      out.write("<br>\n");
      out.write("<label for=\"name\"><b>Name:</b></label>\n");
      out.write("<input type=\"name\" name=\"name\"/>\n");
      out.write("<br><br>\n");
      out.write("<label for=\"password\"><b>Password:</b></label>\n");
      out.write("<input type=\"password\" name=\"password\"/>\n");
      out.write("<br><br>\n");
      out.write("<label for=\"password\"><b>Re-Type Password:</b></label>\n");
      out.write("<input type=\"password\" name=\"repassword\"/>\n");
      out.write("<br><br>\n");
      out.write("<center><input type=\"submit\" name=\"submit\" value=\"register\"></input></center>\n");
      out.write("</div>\t\n");
      out.write("</fieldset>\n");
      out.write("</form>\t\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
