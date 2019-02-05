

<%@ include file="../foreman/layouts/header.html" %>

                <div class="content">
                    <div class="container-fluid">
                        <!--<div class="row">-->
                           
                            <!--<div class="col-md-12">-->
                                <div class="card ">
                                    <div class="card-header ">
                                        <h4 class="card-title">New Mechanic</h4>
                                        <p class="card-category">New Mechanic</p>
                                    </div>
                                    <div class="card-body">


                                        <form action="/GroupProject/addMechanic" method="post">
                                            <div class="row">
                                                 <div class="form-group col-md-6">
                                                <label>Full Name</label>
                                                <input type="text"  class="form-control" name="name" placeholder="Enter your Full Name">
                                            </div>
                                            <div class="form-group col-md-6">
                                                <label>Email</label>
                                                <input type="email" name="email" class="form-control " placeholder="Enter your  email">
                                            </div>
                                                
                                            </div>
                                           
                                            <div class="row">
                                                
                                                <div class="form-group col-md-6">
                                                <label>Password</label>
                                                <input type="password" name="password"  class="form-control" placeholder="password">
                                            </div> 
                                            </div>
                                           
                                            <div class="col-md-12">
                                                <button type="submit" class="btn btn-primary">Submit</button>
                                                <!--<button type="submit"  class="btn btn-primary">Submit<button>-->
                                            </div>

                                        </form>



                                    </div>

                                <!--</div>-->
                            <!--</div>-->
                        </div>

                    </div>
               
<%@ include file="../foreman/layouts/footer.html" %>
