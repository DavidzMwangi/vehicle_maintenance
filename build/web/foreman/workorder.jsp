<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8" />
    <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
    <link rel="icon" type="image/png" href="../assets/img/favicon.ico">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>Light Bootstrap Dashboard - Free Bootstrap 4 Admin Dashboard by Creative Tim</title>
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
    <!--     Fonts and icons     -->
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" />
    <!-- CSS Files -->
    <link href="/GroupProject/assets/css/bootstrap.min.css" rel="stylesheet" />
    <link href="/GroupProject/assets/css/light-bootstrap-dashboard.css?v=2.0.1" rel="stylesheet" />
    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link href="/GroupProject/assets/css/demo.css" rel="stylesheet" />
</head>

<body>
    <div class="wrapper">
        <div class="sidebar" data-image="assets/img/sidebar-5.jpg">
            <!--
        Tip 1: You can change the color of the sidebar using: data-color="purple | blue | green | orange | red"

        Tip 2: you can also add an image using data-image tag
    -->
                <%@ include file="../foreman/layouts/sidebar.html" %>

        <div class="main-panel">
            <!-- Navbar -->
            <nav class="navbar navbar-expand-lg " color-on-scroll="500">
                <div class=" container-fluid  ">
                    <a class="navbar-brand" href="#pablo"> Dashboard </a>
                    <button href="" class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-bar burger-lines"></span>
                        <span class="navbar-toggler-bar burger-lines"></span>
                        <span class="navbar-toggler-bar burger-lines"></span>
                    </button>
                    <div class="collapse navbar-collapse justify-content-end" id="navigation">
                        <ul class="nav navbar-nav mr-auto">
                            <li class="nav-item">
                                <a href="#" class="nav-link" data-toggle="dropdown">
                                    <i class="nc-icon nc-palette"></i>
                                    <span class="d-lg-none">Dashboard</span>
                                </a>
                            </li>
                            <li class="dropdown nav-item">
                                <a href="#" class="dropdown-toggle nav-link" data-toggle="dropdown">
                                    <i class="nc-icon nc-planet"></i>
                                    <span class="notification">5</span>
                                    <span class="d-lg-none">Notification</span>
                                </a>
                                <ul class="dropdown-menu">
                                    <a class="dropdown-item" href="#">Notification 1</a>
                                    <a class="dropdown-item" href="#">Notification 2</a>
                                    <a class="dropdown-item" href="#">Notification 3</a>
                                    <a class="dropdown-item" href="#">Notification 4</a>
                                    <a class="dropdown-item" href="#">Another notification</a>
                                </ul>
                            </li>
                            <li class="nav-item">
                                <a href="#" class="nav-link">
                                    <i class="nc-icon nc-zoom-split"></i>
                                    <span class="d-lg-block">&nbsp;Search</span>
                                </a>
                            </li>
                        </ul>
                        <ul class="navbar-nav ml-auto">
                            <li class="nav-item">
                                <a class="nav-link" href="#pablo">
                                    <span class="no-icon">Account</span>
                                </a>
                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="http://example.com" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <span class="no-icon">Dropdown</span>
                                </a>
                                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                    <a class="dropdown-item" href="#">Action</a>
                                    <a class="dropdown-item" href="#">Another action</a>
                                    <a class="dropdown-item" href="#">Something</a>
                                    <a class="dropdown-item" href="#">Something else here</a>
                                    <div class="divider"></div>
                                    <a class="dropdown-item" href="#">Separated link</a>
                                </div>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#pablo">
                                    <span class="no-icon">Log out</span>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
            
            


                <div class="content">
                    <div class="container-fluid">
                        <div class="row">
                            <!--                        <div class="col-md-4">
                                                        <div class="card ">
                                                            <div class="card-header ">
                                                                <h4 class="card-title">Email Statistics</h4>
                                                                <p class="card-category">Last Campaign Performance</p>
                                                            </div>
                                                            <div class="card-body ">
                                                                <div id="chartPreferences" class="ct-chart ct-perfect-fourth"></div>
                                                            </div>
                                                            <div class="card-footer ">
                                                                <div class="legend">
                                                                    <i class="fa fa-circle text-info"></i> Open
                                                                    <i class="fa fa-circle text-danger"></i> Bounce
                                                                    <i class="fa fa-circle text-warning"></i> Unsubscribe
                                                                </div>
                                                                <hr>
                                                                <div class="stats">
                                                                    <i class="fa fa-clock-o"></i> Campaign sent 2 days ago
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>-->
                            <div class="col-md-12">
                                <div class="card ">
                                    <div class="card-header ">
                                        <h4 class="card-title">Create a work order</h4>
                                        <p class="card-category">work order</p>
                                    </div>
                                    <div class="card-body ">
                                        <c:if test="${status =='success'}">
                                            <div class="alert alert-success">
                                                Saved the work order successfully
                                            </div>
                                            
                                        </c:if>
                                        <form action="workOrder" method="post">



         
                                                                                        <div class="form-group row">
                                                <label for="regNo" class="col-sm-4 col-form-label">Registration Number</label>
                                                <div class="col-sm-8">

                                                    <select class="form-control" name="vehicleId" id="v-dropdown">
<!--                                                        <option value="">select</option>-->
                                                        <c:forEach var="vehicle" items="${vehicles}">
                                                            <option value="${vehicle.id}" >${vehicle.regNo}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </div>
                                            
<!--                                            <input type="hidden" value="" name="vehicleId" id="vehicleId"/>-->
                                            <div class="form-group row">
                                                <label for="department" class="col-sm-4 col-form-label">Department</label>
                                                <div class="col-sm-8">
                                                    <input type="text" class="form-control" id="department" >
                                                </div>
                                            </div>

                                            <div class="form-group row">
                                                <label for="model" class="col-sm-4 col-form-label">Model</label>
                                                <div class="col-sm-8">
                                                    <input type="text" class="form-control" id="model">
                                                </div>
                                            </div>


                                            <div class="form-group row">
                                                <label for="chasisNo" class="col-sm-4 col-form-label">Chasis Number</label>
                                                <div class="col-sm-8">
                                                    <input type="text" class="form-control" id="chasisNo" >
                                                </div>
                                            </div>



                                            <div class="form-group row">
                                                <label for="engineNo" class="col-sm-4 col-form-label">Engine Number</label>
                                                <div class="col-sm-8">
                                                    <input type="text" class="form-control" id="engineNo" >
                                                </div>
                                            </div>

                                            <div class="form-group row">
                                                <label for="odometer" class="col-sm-4 col-form-label">Odometer Reading</label>
                                                <div class="col-sm-8">
                                                    <input type="text" class="form-control" id="odometer" name="vehicleOdometer">
                                                </div>
                                            </div>

                                            <div class="form-group row">
                                                <label for="fuel" class="col-sm-4 col-form-label">Fuel</label>
                                                <div class="col-sm-8">
                                                    <input type="text" class="form-control" id="fuel" name="vehicleFuel">
                                                </div>
                                            </div>

<!--                                            <div class="form-group row">
                                                <label for="contactPerson" class="col-sm-4 col-form-label">Contact Person</label>
                                                <div class="col-sm-8">
                                                    <input type="text" class="form-control" id="contactPerson" name="contact">
                                                </div>
                                            </div>-->

                                            <div class="form-group row">
                                                <label for="ptime" class="col-sm-4 col-form-label">Promised Time</label>
                                                <div class="col-sm-8">
                                                    <input type="date" class="form-control" id="ptime" name="ptime">
                                                </div>
                                            </div> 

                                            <div class="form-group row">
                                                <label for="regNo" class="col-sm-4 col-form-label">Assign Mechanic</label>
                                                <div class="col-sm-8">

                                                    <select class="form-control" id="v-dropdown" name="mechanicId">
                                                        <option value="">select</option>
                                                        <c:forEach var="mechanic" items="${mechanics}">
                                                            <option value="${mechanic.id}" >${mechanic.name}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </div>

                                            <div class="form-group row">
                                                <label for="regNo" class="col-sm-4 col-form-label">Type of work</label>
                                                <div class="col-sm-8">

                                                    <select class="form-control" id="v-dropdown" name="servicing">
                                                        <option value="0">Defects</option>
                                                        <option value="1">Servicing</option>
                                                        
                                                    </select>
                                                </div>
                                            </div>



                                            <div class="form-group row">
                                                <label for="instructions" class="col-sm-4 col-form-label">Work Instructions</label>
                                                <div class="col-sm-8">
                                                    <textarea class="form-control" id="instructions"  style="height: 80px;" name="instruction" ></textarea>
                                                </div>
                                            </div>

                                            <div class="form-group row">
                                                <label class="col-sm-4"></label>
                                                <div class="col-sm-8">
                                                    <input type="submit" value="create order" class="btn btn-success"/>
                                                </div>
                                            </div>



                                        </form>

                                    </div>

                                </div>
                            </div>
                        </div>

                    </div>
                </div>
                
   <script type="text/javascript">
                                  

                                        $("#v-dropdown").on('change', function () {
                                            var id = $(this).val();
                                            if (id === "")
                                                return;
                                            var url = "/GroupProject/getVehicleDetails?id=" + id;

                                            $.ajax({
                                                type: "GET",
                                                url: url,

                                                async: false,
                                                success: function (data) {
                                                    $("#department").val(data.department);
                                                    
                                                    $('#department').attr('readonly', true);
                                                    $("#model").val(data.modelNo);
                                                    $('#model').attr('readonly', true);
                                                    $("#chasisNo").val(data.chasisNo);
                                                    $('#chasisNo').attr('readonly', true);
                                                    $("#odometer").val(data.odometerReading);
                                                    $("#fuel").val(data.fuelType);
                                                    
                                                     $("#vehicleId").val(id);
                                                }
                                            });


                                        });

                                    });
    </script>

   <footer class="footer">
                <div class="container">
                    <nav>
                        <ul class="footer-menu">
                            <li>
                                <a href="#">
                                    Home
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Company
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Portfolio
                                </a>
                            </li>
                            <li>
                                <a href="#">
                                    Blog
                                </a>
                            </li>
                        </ul>
                        <p class="copyright text-center">
                            �
                            <script>
                                document.write(new Date().getFullYear())
                            </script>
                            <a href="http://www.creative-tim.com">Creative Tim</a>, made with love for a better web
                        </p>
                    </nav>
                </div>
            </footer>
        </div>
    </div>
  
</body>
<!--   Core JS Files   -->
<script src="../assets/js/core/jquery.3.2.1.min.js" type="text/javascript"></script>
<script src="../assets/js/core/popper.min.js" type="text/javascript"></script>
<script src="../assets/js/core/bootstrap.min.js" type="text/javascript"></script>
<!--  Plugin for Switches, full documentation here: http://www.jque.re/plugins/version3/bootstrap.switch/ -->
<script src="../assets/js/plugins/bootstrap-switch.js"></script>
<!--  Google Maps Plugin    -->
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
<!--  Chartist Plugin  -->
<script src="../assets/js/plugins/chartist.min.js"></script>
<!--  Notifications Plugin    -->
<script src="../assets/js/plugins/bootstrap-notify.js"></script>
<!-- Control Center for Light Bootstrap Dashboard: scripts for the example pages etc -->
<script src="../assets/js/light-bootstrap-dashboard.js?v=2.0.1" type="text/javascript"></script>
<!-- Light Bootstrap Dashboard DEMO methods, don't include it in your project! -->
<script src="../assets/js/demo.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
        // Javascript method's body can be found in assets/js/demos.js
        demo.initDashboardPageCharts();

        demo.showNotification();

    });
</script>

</html>
 

