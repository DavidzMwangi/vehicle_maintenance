package org.apache.jsp.foreman;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class workorder_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/foreman/../foreman/layouts/sidebar.html");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"../assets/img/apple-icon.png\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" href=\"../assets/img/favicon.ico\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("    <title>Light Bootstrap Dashboard - Free Bootstrap 4 Admin Dashboard by Creative Tim</title>\n");
      out.write("    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n");
      out.write("    <!--     Fonts and icons     -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700,200\" rel=\"stylesheet\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\" />\n");
      out.write("    <!-- CSS Files -->\n");
      out.write("    <link href=\"/GroupProject/assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"/GroupProject/assets/css/light-bootstrap-dashboard.css?v=2.0.1\" rel=\"stylesheet\" />\n");
      out.write("    <!-- CSS Just for demo purpose, don't include it in your project -->\n");
      out.write("    <link href=\"/GroupProject/assets/css/demo.css\" rel=\"stylesheet\" />\n");
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
      out.write("                ");
      out.write("  <div class=\"sidebar-wrapper\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"http://www.creative-tim.com\" class=\"simple-text\">\n");
      out.write("                        Foreman HomePage\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"/GroupProject/index.jsp\">\n");
      out.write("                            <i class=\"nc-icon nc-chart-pie-35\"></i>\n");
      out.write("                            <p>Dashboard</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"nav-link\" href=\"/GroupProject/foreman/newVehicle.jsp\">\n");
      out.write("                            <i class=\"nc-icon nc-circle-09\"></i>\n");
      out.write("                            <p>New Vehicle</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"nav-link\" href=\"/GroupProject/foreman/allVehicles.jsp\">\n");
      out.write("                            <i class=\"nc-icon nc-notes\"></i>\n");
      out.write("                            <p>All Vehicles</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                     <li>\n");
      out.write("                        <a class=\"nav-link\" href=\"/GroupProject/foreman/addMechanic.jsp\">\n");
      out.write("                            <i class=\"nc-icon nc-notes\"></i>\n");
      out.write("                            <p>New Mechanic </p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                     <li>\n");
      out.write("                        <a class=\"nav-link\" href=\"/GroupProject/foreman/allMechanics.jsp\">\n");
      out.write("                            <i class=\"nc-icon nc-circle-09\"></i>\n");
      out.write("                            <p>All Mechanics</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"nav-link\" href=\"/GroupProject/workOrder\" >\n");
      out.write("                            <i class=\"nc-icon nc-circle-09\"></i>\n");
      out.write("                            <p>Work Order</p>\n");
      out.write("                        </a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
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
      out.write("                        <ul class=\"nav navbar-nav mr-auto\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link\" data-toggle=\"dropdown\">\n");
      out.write("                                    <i class=\"nc-icon nc-palette\"></i>\n");
      out.write("                                    <span class=\"d-lg-none\">Dashboard</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"dropdown nav-item\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\">\n");
      out.write("                                    <i class=\"nc-icon nc-planet\"></i>\n");
      out.write("                                    <span class=\"notification\">5</span>\n");
      out.write("                                    <span class=\"d-lg-none\">Notification</span>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Notification 1</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Notification 2</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Notification 3</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Notification 4</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Another notification</a>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link\">\n");
      out.write("                                    <i class=\"nc-icon nc-zoom-split\"></i>\n");
      out.write("                                    <span class=\"d-lg-block\">&nbsp;Search</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#pablo\">\n");
      out.write("                                    <span class=\"no-icon\">Account</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"http://example.com\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <span class=\"no-icon\">Dropdown</span>\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Something</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                                    <div class=\"divider\"></div>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Separated link</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#pablo\">\n");
      out.write("                                    <span class=\"no-icon\">Log out</span>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <!--                        <div class=\"col-md-4\">\n");
      out.write("                                                        <div class=\"card \">\n");
      out.write("                                                            <div class=\"card-header \">\n");
      out.write("                                                                <h4 class=\"card-title\">Email Statistics</h4>\n");
      out.write("                                                                <p class=\"card-category\">Last Campaign Performance</p>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"card-body \">\n");
      out.write("                                                                <div id=\"chartPreferences\" class=\"ct-chart ct-perfect-fourth\"></div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"card-footer \">\n");
      out.write("                                                                <div class=\"legend\">\n");
      out.write("                                                                    <i class=\"fa fa-circle text-info\"></i> Open\n");
      out.write("                                                                    <i class=\"fa fa-circle text-danger\"></i> Bounce\n");
      out.write("                                                                    <i class=\"fa fa-circle text-warning\"></i> Unsubscribe\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <hr>\n");
      out.write("                                                                <div class=\"stats\">\n");
      out.write("                                                                    <i class=\"fa fa-clock-o\"></i> Campaign sent 2 days ago\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>-->\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                                <div class=\"card \">\n");
      out.write("                                    <div class=\"card-header \">\n");
      out.write("                                        <h4 class=\"card-title\">Create a work order</h4>\n");
      out.write("                                        <p class=\"card-category\">work order</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body \">\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        <form action=\"workOrder\" method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("         \n");
      out.write("                                                                                        <div class=\"form-group row\">\n");
      out.write("                                                <label for=\"regNo\" class=\"col-sm-4 col-form-label\">Registration Number</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("\n");
      out.write("                                                    <select class=\"form-control\" name=\"vehicleId\" id=\"v-dropdown\">\n");
      out.write("<!--                                                        <option value=\"\">select</option>-->\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("<!--                                            <input type=\"hidden\" value=\"\" name=\"vehicleId\" id=\"vehicleId\"/>-->\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label for=\"department\" class=\"col-sm-4 col-form-label\">Department</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"department\" >\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label for=\"model\" class=\"col-sm-4 col-form-label\">Model</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"model\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label for=\"chasisNo\" class=\"col-sm-4 col-form-label\">Chasis Number</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"chasisNo\" >\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label for=\"engineNo\" class=\"col-sm-4 col-form-label\">Engine Number</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"engineNo\" >\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label for=\"odometer\" class=\"col-sm-4 col-form-label\">Odometer Reading</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"odometer\" name=\"vehicleOdometer\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label for=\"fuel\" class=\"col-sm-4 col-form-label\">Fuel</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"fuel\" name=\"vehicleFuel\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label for=\"contactPerson\" class=\"col-sm-4 col-form-label\">Contact Person</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" id=\"contactPerson\" name=\"contact\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label for=\"ptime\" class=\"col-sm-4 col-form-label\">Promised Time</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"date\" class=\"form-control\" id=\"ptime\" name=\"ptime\">\n");
      out.write("                                                </div>\n");
      out.write("                                            </div> \n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label for=\"regNo\" class=\"col-sm-4 col-form-label\">Assign Mechanic</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("\n");
      out.write("                                                    <select class=\"form-control\" id=\"v-dropdown\" name=\"mechanicId\">\n");
      out.write("                                                        <option value=\"\">select</option>\n");
      out.write("                                                        ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label for=\"regNo\" class=\"col-sm-4 col-form-label\">Type of work</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("\n");
      out.write("                                                    <select class=\"form-control\" id=\"v-dropdown\" name=\"servicing\">\n");
      out.write("                                                        <option value=\"0\">Defects</option>\n");
      out.write("                                                        <option value=\"1\">Servicing</option>\n");
      out.write("                                                        \n");
      out.write("                                                    </select>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label for=\"instructions\" class=\"col-sm-4 col-form-label\">Work Instructions</label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <textarea class=\"form-control\" id=\"instructions\"  style=\"height: 80px;\" name=\"instruction\" ></textarea>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-sm-4\"></label>\n");
      out.write("                                                <div class=\"col-sm-8\">\n");
      out.write("                                                    <input type=\"submit\" value=\"create order\" class=\"btn btn-success\"/>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </form>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("                                  \n");
      out.write("\n");
      out.write("                                        $(\"#v-dropdown\").on('change', function () {\n");
      out.write("                                            var id = $(this).val();\n");
      out.write("                                            if (id === \"\")\n");
      out.write("                                                return;\n");
      out.write("                                            var url = \"/GroupProject/getVehicleDetails?id=\" + id;\n");
      out.write("\n");
      out.write("                                            $.ajax({\n");
      out.write("                                                type: \"GET\",\n");
      out.write("                                                url: url,\n");
      out.write("\n");
      out.write("                                                async: false,\n");
      out.write("                                                success: function (data) {\n");
      out.write("                                                    $(\"#department\").val(data.department);\n");
      out.write("                                                    \n");
      out.write("                                                    $('#department').attr('readonly', true);\n");
      out.write("                                                    $(\"#model\").val(data.modelNo);\n");
      out.write("                                                    $('#model').attr('readonly', true);\n");
      out.write("                                                    $(\"#chasisNo\").val(data.chasisNo);\n");
      out.write("                                                    $('#chasisNo').attr('readonly', true);\n");
      out.write("                                                    $(\"#odometer\").val(data.odometerReading);\n");
      out.write("                                                    $(\"#fuel\").val(data.fuelType);\n");
      out.write("                                                    \n");
      out.write("                                                     $(\"#vehicleId\").val(id);\n");
      out.write("                                                }\n");
      out.write("                                            });\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        });\n");
      out.write("\n");
      out.write("                                    });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("   <footer class=\"footer\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <nav>\n");
      out.write("                        <ul class=\"footer-menu\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    Home\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    Company\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    Portfolio\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\">\n");
      out.write("                                    Blog\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <p class=\"copyright text-center\">\n");
      out.write("                            ©\n");
      out.write("                            <script>\n");
      out.write("                                document.write(new Date().getFullYear())\n");
      out.write("                            </script>\n");
      out.write("                            <a href=\"http://www.creative-tim.com\">Creative Tim</a>, made with love for a better web\n");
      out.write("                        </p>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  \n");
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
      out.write("    $(document).ready(function() {\n");
      out.write("        // Javascript method's body can be found in assets/js/demos.js\n");
      out.write("        demo.initDashboardPageCharts();\n");
      out.write("\n");
      out.write("        demo.showNotification();\n");
      out.write("\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write(" \n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status =='success'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <div class=\"alert alert-success\">\n");
        out.write("                                                Saved the work order successfully\n");
        out.write("                                            </div>\n");
        out.write("                                            \n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("vehicle");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vehicles}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vehicle.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${vehicle.regNo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("mechanic");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mechanics}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mechanic.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mechanic.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }
}
