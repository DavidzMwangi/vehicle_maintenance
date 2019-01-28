

<%@ include file="../foreman/layouts/header.html" %>

                <div class="content">
                    <div class="container-fluid">
                        <div class="row">
                           
                            <div class="col-md-12">
                                <div class="card ">
                                    <div class="card-header ">
                                        <h4 class="card-title">New Mechanic</h4>
                                        <p class="card-category">New Mechanic</p>
                                    </div>
                                    <div class="card-body ">


                                        <form action="/GroupProject/addMechanic" method="post">
                                            <div class="form-group col-6">
                                                <input type="text"  class="form-control" name="name" placeholder="Enter your Full Name">
                                            </div>
                                            <div class="form-group col-6">
                                                <input type="email" name="email" class="form-control" placeholder="Enter your  email">
                                            </div>
                                            <div class="form-group col-6">
                                                <input type="password" name="password"  class="form-control" placeholder="password">
                                            </div
                                            <div class="col-12">
                                                <button type="submit"  class="btn btn-primary">Submit<button>
                                            </div>

                                        </form>



                                    </div>

                                </div>
                            </div>
                        </div>

                    </div>
               
<%@ include file="../foreman/layouts/footer.html" %>
