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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("    <title>Log In Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"row  mt-5\">\n");
      out.write("            <div class=\"col-3\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-6\">\n");
      out.write("\n");
      out.write("                <div class=\"card\">\n");
      out.write("\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                       <form name=\"LogIn\" id=\"login\" action=\"/GroupProject/login\" method=\"post\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"UserName\">User Name</label>\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"username\" id=\"Username\" aria-describedby=\"emailHelp\"\n");
      out.write("                                    placeholder=\"User name\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"pwd\">Password</label>\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"password\" col-sm-2 col-form-label id=\"exampleInputPassword1\"\n");
      out.write("                                    placeholder=\"Password\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group form-check\">\n");
      out.write("                                <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                                <label class=\"form-check-label\" for=\"exampleCheck1\">Remember Me</label>\n");
      out.write("                            </div>\n");
      out.write("                            <p> Not yet registered please Sign Up</p>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary\">Log In</button>\n");
      out.write("                            <a href=\"/GroupProject/foreman/signup.jsp\">sign up</a>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-3\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- <div class=\"col-sm-8 col-offset-sm-3\">\n");
      out.write("\n");
      out.write("                \n");
      out.write("            </div> -->\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <script src=\"/assets/js/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"/assets/js/popper.min.js\"></script>\n");
      out.write("    <script src=\"/assets/js/parsely.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(function () {\n");
      out.write("          $('#login').parsley().on('field:validated', function() {\n");
      out.write("            var ok = $('.parsley-error').length === 0;\n");
      out.write("            $('.bs-callout-info').toggleClass('hidden', !ok);\n");
      out.write("            $('.bs-callout-warning').toggleClass('hidden', ok);\n");
      out.write("          })\n");
      out.write("          .on('form:submit', function() {\n");
      out.write("            return false; // Don't submit form for this demo\n");
      out.write("          });\n");
      out.write("        });\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
