package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<HEAD><TITLE>ApartmentGuru</TITLE>\n");
      out.write("<link rel=\"icon\" href=\"crown.png\" height=\"18\" width=\"52\">\n");
      out.write("<a href=\"front.jsp\"><img src=\"ap1.png\" align=\"right\" height=\"100\" width=\"100\" style=\"margin:10px;position:fixed;\"></a>\n");
      out.write("<style>\n");
      out.write(".footer\n");
      out.write("{\n");
      out.write("  background-color:#713a11;\n");
      out.write("  color:white;\n");
      out.write("  padding:20px;\n");
      out.write("  font-family: Verdana,sans-serif;\n");
      out.write("\n");
      out.write("}  \n");
      out.write("body\n");
      out.write("{\n");
      out.write("margin:0px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</HEAD>\n");
      out.write("<body bgcolor=#ecdfb2>\n");
      out.write("<p align=\"center\">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<img src=\"1bhklogo.png\" height=\"300\" width=\"600\"></p>\n");
      out.write("<h1><center><font face=\"Cambria\" color=#4A121A>About Us</font></center></h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("<p align=\"center\" style=\"margin:10px\">\n");
      out.write("<font face=\"Comic Sans MS\" color=#4A121A size=\"4.5\">\n");
      out.write("Founded in 2018, with the objective of simplifying property buying & selling, Apartment-Guru.com is India’s No.1 property portal.\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("We Get You Home - That’s the promise we work relentlessly to live up to. We fulfill this promise to property buyers with a well thought through interface for property search & instantly connect them with genuine sellers. This is supplemented with well-researched market reports, personalized and genuine advice, enabling easier & intelligent property buying decisions\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("At Apartment-Guru, we believe in simplifying the home buying process by providing :\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<h3>Assurance:</h3>\n");
      out.write("We certify projects and verify all aspects of it. When you select an Verified property on Apartment-Guru.com, you can be assured that the property has been evaluated from all angles & buy it with 100% confidence.\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<h3>Convenience:</h3>\n");
      out.write("We constantly innovate and create new means to make property search easier for you. Our Virtual Tours ensure that you get a feel of the property without even having to visit it.\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<h3>Assistance:</h3>\n");
      out.write("Through our flagship service called Assisted Property, we provide end to end assistance in property buying - right from property search to home loans to legal formalities and purchase. We have experienced property advisors who will guide you through the property buying journey and ensure you make the right choice with minimum stress.\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("Welcome !\n");
      out.write("\n");
      out.write("\n");
      out.write("</font></p>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("      <div class=\"footer\">\n");
      out.write("        <div>\n");
      out.write("        <div>Copyright 2018 © ApartmentGuru. All rights reserved.\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
