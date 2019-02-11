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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Log In Page</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("       <!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row  mt-5\">\r\n");
      out.write("            <div class=\"col-3\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-6\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("                       <form name=\"LogIn\" id=\"login\" action=\"/GroupProject/login\" method=\"post\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"UserName\">User Name</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"username\" id=\"Username\" aria-describedby=\"emailHelp\"\r\n");
      out.write("                                    placeholder=\"User name\">\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"pwd\">Password</label>\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"password\" col-sm-2 col-form-label id=\"exampleInputPassword1\"\r\n");
      out.write("                                    placeholder=\"Password\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"form-group form-check\">\r\n");
      out.write("                                <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\r\n");
      out.write("                                <label class=\"form-check-label\" for=\"exampleCheck1\">Remember Me</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p> Not yet registered please Sign Up</p>\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Log In</button>\r\n");
      out.write("                            <a href=\"signup.jsp\">sign up</a>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-3\">\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- <div class=\"col-sm-8 col-offset-sm-3\">\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("            </div> -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"/assets/js/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"/assets/js/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"/assets/js/parsely.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function () {\r\n");
      out.write("          $('#login').parsley().on('field:validated', function() {\r\n");
      out.write("            var ok = $('.parsley-error').length === 0;\r\n");
      out.write("            $('.bs-callout-info').toggleClass('hidden', !ok);\r\n");
      out.write("            $('.bs-callout-warning').toggleClass('hidden', ok);\r\n");
      out.write("          })\r\n");
      out.write("          .on('form:submit', function() {\r\n");
      out.write("            return false; // Don't submit form for this demo\r\n");
      out.write("          });\r\n");
      out.write("        });\r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
