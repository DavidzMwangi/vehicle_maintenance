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
                                   
                                    
                                    
                                    <table class="table table-responsive ">
                                        
                                        <thead>
                                            <tr>
                                                
                                               
                                                <th>Vehicle Name</th>
                                        <th>Date</th>
                                          <th>Work Instructions</th> 
                                          <th>More Details</th> 
                                             <th>Spares</th> 
                                             <th>Approve Extra Defects</th> 
                                             <th>Actions</th> 
                                            </tr>
                                        </thead>
                                        <tbody>
                                           
                                            <c:forEach var="workorder" items="${workorders}">
                                                
                                              <tr>
                                                <td>${workorder.getRegNo()}</td>
                                                <td>${workorder.getCreatedAt()}</td>
                                                <td>${workorder.getWorkInstructions()}</td>
                                                <td><a href="/GroupProject/moreWorkOrder/${workorder.getId()}" class="btn btn-primary">View More</a></td>
                                                <td><a href="/GroupProject/view_spares?work_order_id=${workorder.getId()}" class="btn btn-primary">View Spares</a></td>
                                                <td><a href="/GroupProject/extraDefects/${workorder.getId()}" class="btn btn-primary">Extra Defects</a></td>
                                                
                                                <td>Actions </td>
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
 