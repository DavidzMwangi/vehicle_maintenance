<%@ include file="../foreman/layouts/header.html" %>

            <div class="content">
                <div class="container-fluid">
                    <div class="row">

                        <div class="col-md-12">
                            <div class="card ">
                                <div class="card-header ">
                                    <h4 class="card-title">New Vehicle</h4>
                                    <p class="card-category">New Vehicle</p>
                                </div>
                                <div class="card-body ">
                                    <form method="post" action="/GroupProject/addVehicle">
                                        <div class="row">
                                            
                                            <div class="form-group col-6">
                                                <label>Registration Number</label>
                                                <input type="text" class="form-control" name="reg_no"/>
                                            </div> 
                                            
                                            <div class="form-group col-6">
                                                    <label>Chasis Number</label>
                                                <input type="text" class="form-control" name="chasis_no"/>
                                            </div> 
                                        </div>
                                       
                                        
                                        
                                         <div class="row">
                                            
                                            <div class="form-group col-6">
                                            <label>Model Number</label>
                                                <input type="text" class="form-control" name="model_no"/>
                                            </div> 
                                            
                                            <div class="form-group col-6">
                                            <label>Department</label>
                                                <input type="text" class="form-control" name="department"/>
                                            </div> 
                                        </div>
                                        
                                         <div class="row">
                                            
                                            <div class="form-group col-6">
                                            <label>Engine Number</label>
                                                <input type="number" class="form-control" name="engine_no"/>
                                            </div> 
                                            
                                            <div class="form-group col-6">
                                            <label>Fuel </label>
                                                <input type="number" class="form-control" name="fuel"/>
                                            </div> 
                                        </div>
                                        
                                         <div class="row">
                                            
                                            <div class="form-group col-6">
                                            <label>Odometer Reading</label>
                                                <input type="number" class="form-control" name="odometer_reading"/>
                                            </div> 
                                            
                                            
                                        </div>
                                        
                                        
                                        <div class="row">
                                            <div class="form-group col-6">
                                                <button class="btn btn-primary" type="submit">Submit</button></div>
                                        </div>
                                    </form>
                                    
                                    
                                    
                                </div>
                                
                            </div>
                        </div>
                    </div>
              
                </div>
            </div>
              <%@ include file="../foreman/layouts/footer.html" %>