
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ include file="../mechanic/layouts/header.html" %>


            <div class="content">
                <div class="container-fluid">
                    <div class="row">

                        <div class="col-md-12">
                            <div class="card ">
                                <div class="card-header ">
                                    <h4 class="card-title"> Additional Defects</h4>

                                </div>
                                <div class="card-body ">
                                    <form method="post" action="addAdditionalDefect">
                                    
                                    <input name="work_order_id" type="hidden" value="<%= request.getAttribute("work_order_id") %>"/>
                                 
                                    
                                    <div class="row">
                                        
                                    <div class="form-group col-md-6">
                                        <label>Name</label> 
                                        <input type="text" name="name" class="form-control"/>
                                        
                                    </div>
                                    
                                        
                                      
                                    </div>  
                                   
                                    <button type="submit" class="btn btn-success">Submit</button>
                                    </form>
                                </div>
                                
                            </div>
                        </div>
                    </div>
                
                </div>
            </div>
                      <%@ include file="../mechanic/layouts/footer.html" %>
 