

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<%@ include file="../foreman/layouts/header.html" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



            <!-- End Navbar -->
            <div class="content">
                <div class="container-fluid">
                    <div class="row">

                        <div class="col-md-12">
                            <div class="card ">
                                <div class="card-header ">
                                    <h4 class="card-title">Workorder  </h4>
                                    
                                </div>
                                <div class="card-body ">
                                   
                                    <div class="row">
                                        
                                        <div class="form-group col-md-5">
                                            <label>Registration</label>
                                            <h3>${requestScope.workOrder.regNo}</h3>
                                        </div>
                                           
                                        <div class="form-group col-md-5">
                                            <label>Department</label>
                                            <h3>${requestScope.workOrder.department}</h3>
                                            
                                        </div>
                                           
                                        <div class="form-group col-md-5">
                                            <label>Model Number</label>
                                            <h3>${requestScope.workOrder.modelNumber}</h3>
                                            
                                        </div>
                                        <div class="form-group col-md-5">
                                            <label>Chasis Number</label>
                                            <h3>${requestScope.workOrder.chasisNumber}</h3>
                                            
                                        </div>
                                        <div class="form-group col-md-5">
                                            <label>Engine Number</label>
                                            <h3>${requestScope.workOrder.engineNumber}</h3>
                                            
                                        </div>
                                        <div class="form-group col-md-5">
                                            <label>Odometer Reading</label>
                                            <h3>${requestScope.workOrder.odometerReading}</h3>
                                            
                                        </div>
                                        <div class="form-group col-md-5">
                                            <label>Fuel</label>
                                            <h3>${requestScope.workOrder.fuel}</h3>
                                            
                                        </div>
                                        <div class="form-group col-md-5">
                                            <label>Promised Time</label>
                                            <h3>${requestScope.workOrder.promisedDate}</h3>
                                            
                                        </div>
                                        <div class="form-group col-md-5">
                                            <label>Mechanic Assigned </label>
                                            <h3>${requestScope.workOrder.mechanicName}</h3>
                                            
                                        </div>
                                        <div class="form-group col-md-5">
                                            <c:if test=" ${requestScope.workOrder.isServicing()==true}">
                                                 <label>Type of work</label>
    
                                                <h3>servicing</h3>
                                                    
                                                    
                                                    
                                                    
                                            </c:if>
                                                    
                                                    
                                                <c:if test="${requestScope.workOrder.isServicing()==false}">
                                                   <label>Type of work</label>

                                                    <h3>Defect</h3>
                                                </c:if>   
                                                    
                                                    
                                                  
                                                  
                                                  
                                            
                                        </div>
                                        <div class="form-group col-md-5">
                                            <label>Work Instruction</label>
                                            <p>${requestScope.workOrder.workInstructions} </p>
                                            
                                        </div>
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                        
                                    </div>
                                    
                                  
                                    
                                </div>
                                
                            </div>
                        </div>
                    </div>
                
                </div>
            </div>
                      <%@ include file="../foreman/layouts/footer.html" %>
 