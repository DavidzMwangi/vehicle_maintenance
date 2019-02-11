


<!DOCTYPE html>
<html lang="en">

    <head>


        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Log In Page</title>
        <link rel="stylesheet" href="../assets/css/bootstrap.min.css">
    </head>

    <body>

        <div class="container">
            <div class="row  mt-5">
                <div class="col-3">


                </div>
                <div class="col-6">

                    <div class="card">

                        <div class="card-body">

                            <form id="signUp" method="post" name="signup" action="/GroupProject/signup_user">
                                <div class="form-group">
                                    <label for="Emailaddress">User Name</label>
                                    <input type="text" class="form-control" id="Username" aria-describedby="user"
                                           placeholder="User name" name="username" required="">

                                </div>

                                <div class="form-group">
                                    <label for="Emailaddress">Email address</label>
                                    <input type="email" class="form-control" id="Emailaddress" aria-describedby="emailHelp"
                                           placeholder="Example@gmail.com" name="Email" required="">

                                </div>



                                <div class="form-group">
                                    <label for="Emailaddress">User Type</label>
                                    <select name="user_type" class="form-control">

                                        <option value="1">ForeMan</option>
                                        <option value="0">Mechanic</option>

                                    </select>

                                </div>
                                <div class="form-group">
                                    <label for="pwd">Password</label>
                                    <input type="password" class="form-control" col-sm-2 col-form-label id="password"
                                           placeholder="Password" name="password" required="">
                                </div>
                                <div class="form-group">
                                    <label for="pwd">Confirm Password</label>
                                    <input type="password" class="form-control" col-sm-2 col-form-label id="confirmation"
                                           placeholder="Confirm password" name="confirmation"  required="">
                                </div>
                                <a href="../index.jsp">Log In</a>
                                <button type="submit" class="btn btn-primary" onClick="validate(this.form)">Sign Up</button>

                            </form>


                        
                        <script>
                                function validate(){
                                       if ($('#password').val() === $('#confirmation').val()) {
                                    $('#message').html('Matching').css('color', 'green');
                                    form.submit();
                                } else{
                                    $('#message').html('Not Matching').css('color', 'red');
                                    alert(" Your passwords do not match");
                                }
                                    
                                    
                                }
                            


                        </script>
                        <script src="../assets/js/parsely.min.js"></script>
                        <script src="../assets/js/jquery-3.3.1.slim.min.js"></script>
                        <script src="../assets/js/popper.min.js"></script>

                        <script type="text/javascript">
                            $(function () {
                                $('#signUp').parsley().on('field:validated', function () {
                                    var ok = $('.parsley-error').length === 0;
//                                    $('.bs-callout-info').toggleClass('hidden', !ok);
//                                    $('.bs-callout-warning').toggleClass('hidden', ok);
                                })
                                        .on('form:submit', function () {
                                            return false; // Don't submit form for this demo
                                        });
                            });
                        </script>







                        </body>

                        </html>