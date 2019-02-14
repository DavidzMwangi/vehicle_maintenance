<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="../foreman/layouts/header.html" %>
 
            <div class="content">
                <div class="container-fluid">
                    <div class="row">

                        <div class="col-md-12">
                            <div class="card ">
                                <div class="card-header ">
                                    <h4 class="card-title">Spares</h4>
                                    <p class="card-category">Work Order Spares</p>
                                </div>
                                <div class="card-body ">
                                   
                                    <table class="table table-responsive">
                                        
                                        <thead>
                                            <tr>
                                                <th>Spare Name</th>
                                                <th>Approval</th>
                                                  <th>Actions</th>

                                               
                                            </tr>
                                        </thead>
                                        <tbody>
                                           
                                            <c:forEach var="spare" items="${spares}">
                                              
                                              <tr>
                                                <td>${spare.getName()}</td>
                                                <td> 
                                                    <c:if test="${spare.getIsApproved()==true}">
                                                        <span class="badge badge-success">Approved</span>
                                                    </c:if>
                                                       <c:if test="${spare.getIsApproved()==false}">
                                                        <a href="/GroupProject/approveSpare?spare_id=${spare.getId()}&work_order_id=${spare.getWorkOrderId()}" class="btn btn-primary">Approve</span>
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
 