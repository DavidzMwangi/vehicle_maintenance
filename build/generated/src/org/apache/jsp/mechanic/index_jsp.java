package org.apache.jsp.mechanic;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/mechanic/layouts/header.html");
    _jspx_dependants.add("/mechanic/layouts/../layouts/sidebar.html");
    _jspx_dependants.add("/mechanic/layouts/footer.html");
  }

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"../assets/img/apple-icon.png\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"../assets/img/favicon.ico\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("    <title>Vehicle Maintenance System</title>\n");
      out.write("    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n");
      out.write("    <!--     Fonts and icons     -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700,200\" rel=\"stylesheet\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\" />\n");
      out.write("    <!-- CSS Files -->\n");
      out.write("    <link href=\"../../GroupProject/assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"../../GroupProject/assets/css/light-bootstrap-dashboard.css?v=2.0.1\" rel=\"stylesheet\" />\n");
      out.write("    <!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("    <link href=\"../../GroupProject/assets/css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <div class=\"sidebar\" data-image=\"assets/img/sidebar-5.jpg\">\n");
      out.write("            <!--\n");
      out.write("        Tip 1: You can change the color of the sidebar using: data-color=\"purple | blue | green | orange | red\"\n");
      out.write("\n");
      out.write("        Tip 2: you can also add an image using data-image tag\n");
      out.write("    -->\n");
      out.write("            ");
      out.write("<div class=\"sidebar-wrapper\" style=\"background-color: green\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"\" class=\"simple-text\">\n");
      out.write("                        Mechanic Home Page\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"/GroupProject/foreman/index.jsp\">\n");
      out.write("                            <i class=\"nc-icon nc-chart-pie-35\"></i>\n");
      out.write("                            <p>Dashboard</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                                                <!--<a class=\"nav-link\" href=\"/GroupProject/foreman/newVehicle.jsp\">-->\n");
      out.write("\n");
      out.write("                        <a class=\"nav-link\" href=\"/GroupProject/addVehicle\">\n");
      out.write("                            <i class=\"nc-icon nc-circle-09\"></i>\n");
      out.write("                            <p>New Vehicle</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"nav-link\" href=\"/GroupProject/allVehicles\">\n");
      out.write("                            <i class=\"nc-icon nc-notes\"></i>\n");
      out.write("                            <p>All Vehicles</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                     <li>\n");
      out.write("                        <a class=\"nav-link\" href=\"/GroupProject/addMechanic\">\n");
      out.write("                            <i class=\"nc-icon nc-notes\"></i>\n");
      out.write("                            <p>New Mechanic </p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li>\n");
      out.write("                        <a class=\"nav-link\" href=\"/GroupProject/allMechanics\">\n");
      out.write("                            <i class=\"nc-icon nc-circle-09\"></i>\n");
      out.write("                            <p>All Mechanics</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"nav-link\" href=\"/GroupProject/workOrder\" >\n");
      out.write("                            <i class=\"nc-icon nc-circle-09\"></i>\n");
      out.write("                            <p> New Work Order</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"nav-link\" href=\"/GroupProject/ShowWorkOrders\" >\n");
      out.write("                            <i class=\"nc-icon nc-circle-09\"></i>\n");
      out.write("                            <p>Show all Work Orders</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"main-panel\">\n");
      out.write("            <!-- Navbar -->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg \" color-on-scroll=\"500\">\n");
      out.write("                <div class=\" container-fluid  \">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#pablo\"> Dashboard </a>\n");
      out.write("                    <button href=\"\" class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-bar burger-lines\"></span>\n");
      out.write("                        <span class=\"navbar-toggler-bar burger-lines\"></span>\n");
      out.write("                        <span class=\"navbar-toggler-bar burger-lines\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse justify-content-end\" id=\"navigation\">\n");
      out.write("                       \n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                          \n");
      out.write("                        \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\">\n");
      out.write("                                    <span class=\"no-icon\">Log out</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            \n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- End Navbar -->\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<h1>Dashboard</h1>\n");
      out.write("                    </div>\n");
      out.write("              \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("            ");
      out.write("  <footer class=\"footer\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <nav>\n");
      out.write("                        \n");
      out.write("                        <p class=\"copyright text-center\">\n");
      out.write("                            Â©\n");
      out.write("                            <script>\n");
      out.write("                                document.write(new Date().getFullYear())\n");
      out.write("                            </script>\n");
      out.write("                            <a href=\"#\">Vehicle Maintenance</a>\n");
      out.write("                        </p>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("</body>\n");
      out.write("<!--   Core JS Files   -->\n");
      out.write("<script src=\"../assets/js/core/jquery.3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../assets/js/core/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../assets/js/core/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<!--  Plugin for Switches, full documentation here: http://www.jque.re/plugins/version3/bootstrap.switch/ -->\n");
      out.write("<script src=\"../assets/js/plugins/bootstrap-switch.js\"></script>\n");
      out.write("<!--  Google Maps Plugin    -->\n");
      out.write("<script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("<!--  Chartist Plugin  -->\n");
      out.write("<script src=\"../assets/js/plugins/chartist.min.js\"></script>\n");
      out.write("<!--  Notifications Plugin    -->\n");
      out.write("<script src=\"../assets/js/plugins/bootstrap-notify.js\"></script>\n");
      out.write("<!-- Control Center for Light Bootstrap Dashboard: scripts for the example pages etc -->\n");
      out.write("<script src=\"../assets/js/light-bootstrap-dashboard.js?v=2.0.1\" type=\"text/javascript\"></script>\n");
      out.write("<!-- Light Bootstrap Dashboard DEMO methods, don't include it in your project! -->\n");
      out.write("<script src=\"../assets/js/demo.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("//    $(document).ready(function() {\n");
      out.write("//        // Javascript method's body can be found in assets/js/demos.js\n");
      out.write("//        demo.initDashboardPageCharts();\n");
      out.write("//\n");
      out.write("//        demo.showNotification();\n");
      out.write("//\n");
      out.write("//    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</html>");
      out.write('\n');
      out.write('\n');
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
