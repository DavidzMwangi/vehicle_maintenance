<%@ include file="../foreman/layouts/header.html" %>


            <!-- End Navbar -->
            <div class="content">
                <div class="container-fluid">
                    <div class="row">

                        <div class="col-md-12">
                            <div class="card ">
                                <div class="card-header ">
                                    <h4 class="card-title">New Vehicle</h4>
                                    <p class="card-category">New Vehicle</p>
                                </div>
                                <div class="card-body ">
                                   
                                    
                                    
                                    <table class="table table-responsive table-bordered">
                                        
                                        <thead>
                                            <tr>
                                                <th>Reg Number</th>
                                                <th>Chasis Number</th>
                                                <th>Model Number</th>
                                                <th>Department</th>
                                                <th>Contact Person</th>
                                                <th>Fuel Type</th>
                                                <th>Odometer Reading</th>
                                                <th>Extension</th>
                                               
                                            </tr>
                                        </thead>
                                        <tbody>
                                           
                                            <%-- <c:forEach var="vehicle" items="${vehicles}">
                                                
                                              <tr>
                                                <td>${vehicle.reg_no}</td>
                                                <td>${vehicle.chasis_no}</td>
                                                <td>${vehicle.model_no}</td>
                                                <td>${vehicle.department}</td>
                                                <td>${vehicle.contact_person}</td>
                                                <td>${vehicle.fuel_type}</td>
                                                <td>${vehicle.odometer_reading}</td>
                                                <td>${vehicle.extension}</td>
                                                
                                            </tr>  
                                                
                                            </c:forEach>
                                            
                                            --%>
                                        </tbody>
                                    </table>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                
                </div>
            </div>
                      <%@ include file="../foreman/layouts/footer.html" %>
 