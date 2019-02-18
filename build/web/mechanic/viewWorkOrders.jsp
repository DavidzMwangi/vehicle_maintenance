
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
                                          <th>Work Instructions</th> 
                                          <th>More Details</th> 
                                             <th> Checklist</th> 
                                             <th>Extra Defects</th> 
                                             <th>Spare Parts</th> 
                                             <th> Servicing Card</th> 
                                             
                                            </tr>
                                        </thead>
                                        <tbody>
                                           
                                            <c:forEach var="workorder" items="${workorders}">
                                                
                                              <tr>
                                                <td>${workorder.getRegNo()}</td>
                                                <td>${workorder.getCreatedAt()}</td>
                                                <td>${workorder.getWorkInstructions()}</td>
                                                <td><a href="/GroupProject/moreWorkOrder/${workorder.getId()}" class="btn btn-primary">View More</a></td>
                                                <td><a href="/GroupProject/addChecklist?work_order_id=${workorder.getId()}" class="btn btn-primary">Checklist</a></td>
                                                <td><a href="/GroupProject/additionalDefects?work_order_id=${workorder.getId()}" class="btn btn-primary">Extra Defects</a></td>
                                                <td><a href="/GroupProject/additionalDefects?work_order_id=${workorder.getId()}" class="btn btn-primary">Spare Parts</a></td>

                                               <td><a href="/GroupProject/additionalDefects?work_order_id=${workorder.getId()}" class="btn btn-primary">Servicing Card</a></td>

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
 