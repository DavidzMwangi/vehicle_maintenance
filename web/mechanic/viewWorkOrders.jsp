
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="../mechanic/layouts/header.html" %>


            <div class="content">
                <div class="container-fluid">
                    <div class="row">

                        <div class="col-md-12">
                            <div class="card ">
                                <div class="card-header ">
                                    <h4 class="card-title"> WorkOrders</h4>
                                    <p class="card-category"> WorkOrders  </p>
                                </div>
                                <div class="card-body ">
                                   
                                    
                                    
                                    <table class="table table-responsive ">
                                        
                                        <thead>
                                            <tr>
                                                
                                               
                                                <th>Vehicle Name</th>
                                        <th>Date</th>
                                          <th>More Details</th> 
                                             <th> Checklist</th> 
                                             <th>Extra Defects</th> 
                                             <th>Spare Parts</th> 
                                             <th> Servicing Card</th> 
                                             <th>Mark Complete</th> 

                                            </tr>
                                        </thead>
                                        <tbody>
                                           
                                            <c:forEach var="workorder" items="${workorders}">
                                                
                                              <tr>
                                                <td>${workorder.getRegNo()}</td>
                                                <td>${workorder.getCreatedAt()}</td>
                                                <td><a href="/GroupProject/mechanicMoreWorkOrder?work_order_id=${workorder.getId()}" class="btn btn-primary">View More</a></td>
                                                <td><a href="/GroupProject/addChecklist?work_order_id=${workorder.getId()}" class="btn btn-primary">Checklist</a></td>
                                                <td><a href="/GroupProject/addAdditionalDefect?work_order_id=${workorder.getId()}" class="btn btn-primary">Extra Defects</a></td>
                                                <td><a href="/GroupProject/addSpare?work_order_id=${workorder.getId()}" class="btn btn-primary">Spare Parts</a></td>

                                                
                                               <td>

                                                   <c:if test="${workorder.isServicing()==true}">
                                                <a href="/GroupProject/addServicingCard?work_order_id=${workorder.getId()}" class="btn btn-primary">Servicing Card</a>

                                                    </c:if>
                                                                                
                                               
                                               </td>

                                               <td>
                                                   <c:if test="${workorder.isCompleted()==false}">
                                                    <a href="/GroupProject/mark_complete?work_order_id=${workorder.getId()}">Mark as Complete</a>

                                                   </c:if>
                                                   <c:if test="${workorder.isCompleted()==true}">
                                                       <span class="badge badge-success">Completed</span>
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
                      <%@ include file="../mechanic/layouts/footer.html" %>
 