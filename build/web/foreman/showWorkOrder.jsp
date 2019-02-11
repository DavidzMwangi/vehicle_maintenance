<%-- 
    Document   : showWorkOrder
    Created on : Feb 11, 2019, 11:07:44 AM
    Author     : MUNTAZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="../foreman/layouts/header.html" %>


            <!-- End Navbar -->
            <div class="content">
                <div class="container-fluid">
                    <div class="row">

                        <div class="col-md-12">
                            <div class="card ">
                                <div class="card-header ">
                                    <h4 class="card-title">All WorkOrders</h4>
                                    <p class="card-category">All WorkOrders </p>
                                </div>
                                <div class="card-body ">
                                   
                                    
                                    
                                    <table class="table table-responsive table-bordered">
                                        
                                        <thead>
                                            <tr>
                                                
                                               
                                                <th>Work Orders</th>
                                               
                                               
                                            </tr>
                                        </thead>
                                        <tbody>
                                           
                                            <c:forEach var="workorder" items="${workorders}">
                                                
                                              <tr>
                                                <td>${workorder.getVehicleId()}</td>
                                                <td>${workorder.getCreatedAt()}</td>
                                                <td>${workorder.getId()}</td>
                                                <td></td>
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
 