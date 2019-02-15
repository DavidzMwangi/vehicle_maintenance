<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="../foreman/layouts/header.html" %>
 
            <div class="content">
                <div class="container-fluid">
                    <div class="row">

                        <div class="col-md-12">
                            <div class="card ">
                                <div class="card-header ">
                                    <h4 class="card-title">Defects</h4>
                                    <p class="card-category">Work Order Defects</p>
                                </div>
                                <div class="card-body ">
                                   
                                    <table class="table table-responsive">
                                        
                                        <thead>
                                            <tr>
                                                <th>Defect Name</th>
                                                <th>Approval</th>
                                                  <th>Actions</th>

                                               
                                            </tr>
                                        </thead>
                                        <tbody>
                                           
                                            <c:forEach var="defect" items="${defects}">
                                              
                                              <tr>
                                                <td>${defect.getName()}</td>
                                                <td> 
                                                    <c:if test="${defect.getIsApproved()==true}">
                                                        <span class="badge badge-success">Approved</span>
                                                    </c:if>
                                                       <c:if test="${defect.getIsApproved()==false}">
                                                        <a href="/GroupProject/approveDefect?defect_id=${defect.getId()}&work_order_id=${defect.getWorkOrderId()}" class="btn btn-primary">Approve</span>
                                                    </c:if>
                                                        
                                                   </td>
                                                   <td><a href="#" >Delete</a></td>
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
 