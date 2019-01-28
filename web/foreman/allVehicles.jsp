<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
                                                <th>Engine Number</th>
                                                <th>Chasis Number</th>
                                                <th>Model Number</th>
                                                <th>Department</th>
                                                <th>Fuel</th>
                                                <th>Odometer Reading</th>
                                                <th>Actions</th> 
                                               
                                            </tr>
                                        </thead>
                                        <tbody>
                                           
                                            <c:forEach var="vehicle" items="${vehicles}">
                                                
                                              <tr>
                                                <td>${vehicle.getRegNo()}</td>
                                                <td>${vehicle.getEngineNo()}</td>
                                                <td>${vehicle.getChasisNo()}</td>
                                                <td>${vehicle.getModelNo()}</td>
                                                <td>${vehicle.getDepartment()}</td>
                                                <td>${vehicle.getFuel()}</td>
                                                <td>${vehicle.getOdometerReading()}</td>
                                                <td>Actions</td>
                                            </tr>  
                                                
                                            </c:forEach>
                                            
                                         
                                        </tbody>
                                    </table>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                
                </div>
            </div>
                      <%@ include file="../foreman/layouts/footer.html" %>
 