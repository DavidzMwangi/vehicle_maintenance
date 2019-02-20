<%-- 
    Document   : showWorkOrder
    Created on : Feb 11, 2019, 11:07:44 AM
    Author     : MUNTAZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="../foreman/layouts/header.html" %>

<!--<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.css">

<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.js"></script>-->
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
                                   
                                    
                                    
                                    <table  class="table table-responsive ">
                                        
                                        <thead>
                                            <tr>
                                                
                                               
                                                <th>Vehicle Name</th>
                                        <th>Date</th>
                                          <th>Work Instructions</th> 
                                          <th>More Details</th> 
                                             <th>Spares</th> 
                                             <th>Approve Extra Defects</th> 
                                             <th>Status</th> 
                                            </tr>
                                        </thead>
                                        <tbody>
                                           
                                            <c:forEach var="workorder" items="${workorders}">
                                                
                                              <tr>
                                                <td>${workorder.getRegNo()}</td>
                                                <td>${workorder.getCreatedAt()}</td>
                                                <td>${workorder.getWorkInstructions()}</td>
                                                <td><a href="/GroupProject/moreWorkOrder?work_order_id=${workorder.getId()}" class="btn btn-primary">View More</a></td>
                                                <td><a href="/GroupProject/view_spares?work_order_id=${workorder.getId()}" class="btn btn-primary">View Spares</a></td>
                                                <td><a href="/GroupProject/additionalDefects?work_order_id=${workorder.getId()}" class="btn btn-primary">Extra Defects</a></td>
                                                
                                                <td>
                                                
                                                 <c:if test="${workorder.isCompleted()==false}">
                                                     <span class="badge badge-danger">Incomplete</span>

                                                 </c:if>
                                                     
                                                     <c:if test="${workorder.isCompleted()==true}">
                                                         <span class="badge badge-success">Complete</span>

                                                     </c:if>
                                                </td>
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
            
<!--            <script>
                $(document).ready( function () {
    $('#table_id').DataTable();
} );
                </script>-->
                      <%@ include file="../foreman/layouts/footer.html" %>
 