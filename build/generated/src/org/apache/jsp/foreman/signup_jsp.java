package org.apache.jsp.foreman;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Log In Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"../assets/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row  mt-5\">\n");
      out.write("                <div class=\"col-3\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-6\">\n");
      out.write("\n");
      out.write("                    <div class=\"card\">\n");
      out.write("\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                            <form id=\"signUp\" method=\"post\" name=\"signup\" action=\"/GroupProject/signup_user\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"Emailaddress\">User Name</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"Username\" aria-describedby=\"user\"\n");
      out.write("                                           placeholder=\"User name\" name=\"username\" required=\"\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"Emailaddress\">Email address</label>\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"Emailaddress\" aria-describedby=\"emailHelp\"\n");
      out.write("                                           placeholder=\"Example@gmail.com\" name=\"Email\" required=\"\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"Emailaddress\">User Type</label>\n");
      out.write("                                    <select name=\"user_type\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                                        <option value=\"1\">ForeMan</option>\n");
      out.write("                                        <option value=\"0\">Mechanic</option>\n");
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"pwd\">Password</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" col-sm-2 col-form-label id=\"password\"\n");
      out.write("                                           placeholder=\"Password\" name=\"password\" required=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"pwd\">Confirm Password</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" col-sm-2 col-form-label id=\"confirmation\"\n");
      out.write("                                           placeholder=\"Confirm password\" name=\"confirmation\"  required=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"index.jsp\">Log In</a>\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary\" onClick=\"validate(this.form)\">Sign Up</button>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                        <script>\n");
      out.write("                                function validate(){\n");
      out.write("                                       if ($('#password').val() === $('#confirmation').val()) {\n");
      out.write("                                    $('#message').html('Matching').css('color', 'green');\n");
      out.write("                                    form.submit();\n");
      out.write("                                } else{\n");
      out.write("                                    $('#message').html('Not Matching').css('color', 'red');\n");
      out.write("                                    alert(\" Your passwords do not match\");\n");
      out.write("                                }\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                }\n");
      out.write("                            \n");
      out.write("\n");
      out.write("\n");
      out.write("                        </script>\n");
      out.write("                        <script src=\"../assets/js/parsely.min.js\"></script>\n");
      out.write("                        <script src=\"../assets/js/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("                        <script src=\"../assets/js/popper.min.js\"></script>\n");
      out.write("\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("                            $(function () {\n");
      out.write("                                $('#signUp').parsley().on('field:validated', function () {\n");
      out.write("                                    var ok = $('.parsley-error').length === 0;\n");
      out.write("//                                    $('.bs-callout-info').toggleClass('hidden', !ok);\n");
      out.write("//                                    $('.bs-callout-warning').toggleClass('hidden', ok);\n");
      out.write("                                })\n");
      out.write("                                        .on('form:submit', function () {\n");
      out.write("                                            return false; // Don't submit form for this demo\n");
      out.write("                                        });\n");
      out.write("                            });\n");
      out.write("                        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </body>\n");
      out.write("\n");
      out.write("                        </html>");
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
