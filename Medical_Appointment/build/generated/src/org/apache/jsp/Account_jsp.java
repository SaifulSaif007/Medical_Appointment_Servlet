package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Account_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <title>Account Information</title>\n");
      out.write("        \t<style type=\"text/css\">\n");
      out.write("\t\t\n");
      out.write("\t#header\n");
      out.write("\t{\n");
      out.write("\t\tbackground-color: black;\n");
      out.write("\t\theight: 100px;\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t \n");
      out.write("\t}\t\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t*\n");
      out.write("\t{\n");
      out.write("\t\tmargin: 0;\n");
      out.write("\t\tpadding: 0;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("       \n");
      out.write("\t#logo\n");
      out.write("\t{\n");
      out.write("\t\tmargin-top: 20px;\n");
      out.write("\t\tmargin-left: 200px;\n");
      out.write("\t\theight: 64px;\n");
      out.write("\t\twidth: 64px;\n");
      out.write("\t\tbackground-image: url(logo.PNG);\n");
      out.write("\t\tfloat: left;\n");
      out.write("\t \n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t#nav\n");
      out.write("\t{\n");
      out.write("\t\tcolor: white;\n");
      out.write("\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t#list\n");
      out.write("\n");
      out.write("\t{\n");
      out.write("\t\t \n");
      out.write("\t\tmargin-left: 400px;\n");
      out.write("\t\t\n");
      out.write("\t\tlist-style: none;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t#nav li\n");
      out.write("\t{\n");
      out.write("\t\tfloat: left;\n");
      out.write("\t\tmargin-left: 25px;\n");
      out.write("\t\tmargin-top: 30px;\n");
      out.write("\t\tpadding: 10px;\n");
      out.write("\t\tborder : 1px solid silver;\n");
      out.write("\t\tborder-radius: 8px;\n");
      out.write("\t\tbackground-color: #252525\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t#nav a\n");
      out.write("\t{\n");
      out.write("\t\ttext-decoration: none;\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t}\n");
      out.write("\t#list a:hover\n");
      out.write("\t{\n");
      out.write("\t\tcolor: blue;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t#para\n");
      out.write("\t{\n");
      out.write("\t\tmargin-top: 20px;\n");
      out.write("\t\tmargin-left: 100px;\n");
      out.write("\t\tmargin-right: 50px;\n");
      out.write("                margin-bottom: 50px;\n");
      out.write("                \n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t#Footer\n");
      out.write("\t{\n");
      out.write("\t\tbackground-color: black;\n");
      out.write("\t\tcolor: white;\n");
      out.write("\t\theight: 100px;\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\t \n");
      out.write("\t\t \n");
      out.write("\t}\n");
      out.write(" \n");
      out.write("\t#copy\n");
      out.write("\n");
      out.write("\t{\n");
      out.write(" \t\theight: 30px;\n");
      out.write("\t\twidth: 1100px;\n");
      out.write("\t\tmargin-top: 30px;\n");
      out.write("\t\tfloat: left;\n");
      out.write("\t\ttext-align: right;\n");
      out.write("\t \n");
      out.write(" \n");
      out.write("\n");
      out.write("\t}\n");
      out.write("        #input\n");
      out.write("        {\n");
      out.write("            height: 150px;\n");
      out.write("            width: 200px;\n");
      out.write("            margin-left: 50px;\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        }\n");
      out.write("         \n");
      out.write("        #sub\n");
      out.write("        {\n");
      out.write("          height: 30px;\n");
      out.write("          width: 50px;\n");
      out.write("        \n");
      out.write("          text-align: center;\n");
      out.write("          \n");
      out.write("        \n");
      out.write("        }\n");
      out.write("        #welcome_text\n");
      out.write("        {\n");
      out.write("            height: 20px;\n");
      out.write("            padding: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("            color: blueviolet;\n");
      out.write("            margin-top: 50px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        #sign_info\n");
      out.write("        {\n");
      out.write("            height: 60px;\n");
      out.write("            margin-left: 150px;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            color: blue;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        .button {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 10px 20px;\n");
      out.write("    text-align: center;\n");
      out.write("    display: inline-block;\n");
      out.write("    font-size: 16px;\n");
      out.write("    margin: 4px 2px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</style>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("        <div id=\"header\">\n");
      out.write("\t\t <div id= \"logo\"></div>\n");
      out.write("\t\t <div id= \"nav\">\n");
      out.write("\t\t \t<ul id =\"list\">\n");
      out.write("\t\t \t\t<li><a href=\"#\"> Home </li>   </a>\n");
      out.write("\t\t \t\t<li><a href=\"Registration\"> Registration </li>  </a>\n");
      out.write("\t\t \t\t<li><a href=\"#\"> Get Appointment </li></a>\n");
      out.write("\t\t \t\t<li><a href=\"#\"> Account </li></a>\n");
      out.write("\t\t \t\t<li><a href=\"#\"> About </li>  </a>\n");
      out.write("\t\t \t</ul>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("     \n");
      out.write("        <h1>Hello</h1>\n");
      out.write("       ");

          String name ="";
          String mail ="";
          String age ="";
          String gender="";
          String addr ="";
          
   
          
           HttpSession session2 = request.getSession(false);
          
           if(session2 != null){
               name =session2.getAttribute("Uname").toString();
               mail =session2.getAttribute("Email").toString();
               age  =session2.getAttribute("Age").toString();
               gender = session2.getAttribute("Gender").toString();
               addr   =session2.getAttribute("Addr").toString();       
          }
         
           
            
      out.write("\n");
      out.write("        <div id = \"para\">\n");
      out.write("             \n");
      out.write("            \n");
      out.write("        <form action=\"Account\" method=\"post\">\n");
      out.write("   \n");
      out.write("            Name: <br> <input type=\"text\" name=\"name\" value=\"");
      out.print( name );
      out.write("\"><br><br> \n");
      out.write("            Email: <br> <input type=\"text\" name=\"email\" value=\"");
      out.print( mail );
      out.write("\"> <br> <br>\n");
      out.write("            Password: <br> <input type=\"text\" name=\"pass\"> <br> <br>\n");
      out.write("            Age :<br>  <input type=\"text\" name=\"age\" value=\"");
      out.print( age );
      out.write("\"> <br> <br>\n");
      out.write("            Gender: <br> <input type=\"text\" name=\"gender\" value=\"");
      out.print( gender );
      out.write("\"> <br> <br>\n");
      out.write("            Address:<br>  <input type=\"text\" name=\"address\" value=\"");
      out.print( addr );
      out.write("\"> <br> <br>\n");
      out.write("            <br>  <input type=\"submit\" id=\"sub\" value=\"Update\"  width=\"58\" height=\"58\"> \n");
      out.write("        </form>\n");
      out.write("      \n");
      out.write("            <form action=\"Doctor_list\" method=\"get\">\n");
      out.write("                 <input type=\"submit\" id=\"sub\" value=\"Doctor\"  width=\"58\" height=\"58\"> \n");
      out.write("            </form>\n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("        <div id =\"Footer\">\n");
      out.write("\t \n");
      out.write("\t\t<div id=\"copy\">\t\t \n");
      out.write("\t\t\t\tCopyright &copy Saiful Islam.\n");
      out.write("                                \n");
      out.write("\t\t </div>\t \n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("        \n");
      out.write("    \n");
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