<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../foreman/layouts/header.html" %>

<link href="../assets/css/bootstrap.min.css" rel="stylesheet" />
    <link href="../assets/css/light-bootstrap-dashboard.css?v=2.0.1" rel="stylesheet" />
    <!-- CSS Just for demo purpose, don't include it in your project -->
    <link href="../assets/css/demo.css" rel="stylesheet" />
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
                                        <form action="dashboard" method="post">



                                            <div class="form-group row">
                                                <label for="regNo" class="col-sm-4 col-form-label">Registration Number</label>
                                                <div class="col-sm-8">

                                                    <select class="form-control" id="v-dropdown">
                                                        <option value="">select</option>
                                                        <c:forEach var="vehicle" items="${vehicles}">
                                                            <option value="${vehicle.id}" >${vehicle.regNo}</option>
                                                        </c:forEach>
                                                    </select>
                                                </div>
                                            </div>
                                            
                                            
                                            <input type="hidden" value="" name="vehicleId" id="vehicleId"/>
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

                                            <div class="form-group row">
                                                <label for="contactPerson" class="col-sm-4 col-form-label">Contact Person</label>
                                                <div class="col-sm-8">
                                                    <input type="text" class="form-control" id="contactPerson" name="contact">
                                                </div>
                                            </div>

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

   <%@ include file="../foreman/layouts/footer.html" %>
 
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
