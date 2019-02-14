<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="../foreman/layouts/header.html" %>


            <!-- End Navbar -->
            <div class="content">
                <div class="container-fluid">
                    <div class="row">

                        <div class="col-md-12">
                            <div class="card ">
                                <div class="card-header ">
                                    <h4 class="card-title">All Mechanics</h4>
                                    <p class="card-category">All Mechanics </p>
                                </div>
                                <div class="card-body ">
                                   
                                    
                                    
                                    <table class="table table-responsive">
                                        
                                        <thead>
                                            <tr>
                                                
                                               
                                                <th>Email</th>
                                                <th>Name</th>
                                                 <th>Actions</th>
                                                
                                               
                                            </tr>
                                        </thead>
                                        <tbody>
                                           
                                            <c:forEach var="mechanic" items="${mechanics}">
                                                
                                              <tr>
                                                <td>${mechanic.getEmail()}</td>
                                                <td>${mechanic.getName()}</td>
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
 