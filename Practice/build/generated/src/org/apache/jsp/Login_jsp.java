package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<title>LOGIN</title>\n");
      out.write("<link rel=\"icon\" href=\"user.png\" height=\"30\" width=\"60\">\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<style>\n");
      out.write("body {background-color: whitesmoke;\n");
      out.write("    font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("form {border: 4px solid black;\n");
      out.write("     text-align:center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("    width: 60%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write(".signin {\n");
      out.write("  background-color:whitesmoke;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".imgcontainer {\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 24px 0 12px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img.avatar {\n");
      out.write("    width: 15%;\n");
      out.write("    border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    padding: 70px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form action=\"LoginServlet\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <h1>LOGIN</h1>\n");
      out.write("    <img src=\"user.png\" alt=\"Avatar\" class=\"avatar\">\n");
      out.write("    <hr>\n");
      out.write("\n");
      out.write("  <label for=\"email\"><b>Enter Email</b></label>\n");
      out.write("    <input type=\"text\" placeholder=\"Enter Email\" name=\"email\" required>\n");
      out.write("   <br>\n");
      out.write("   <br>\n");
      out.write("   <label for=\"psw\"><b>Password</b></label>\n");
      out.write("   <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" required>\n");
      out.write("   <br>\n");
      out.write("   <br>\n");
      out.write("<!--    <p>By creating an account you agree to our <a href=\"#\">Terms & Privacy</a>.</p>-->\n");
      out.write("    <button type=\"submit\" class=\"registerbtn\">LOGIN</button>\n");
      out.write("    <div class=\"container signin\">\n");
      out.write("    <p style=\"color:black;\">Don't have an account? <a style=\"color:blue;\" href=\"Signup.jsp\">Sign up</a>.</p>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("    </hr>\n");
      out.write("   \n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
