
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Log In Page</title>
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
       <!DOCTYPE html>
<html lang="en">



<body>
    <div class="container">


        <div class="row  mt-5">
            <div class="col-3">


            </div>
            <div class="col-6">

                <div class="card">

                    <div class="card-body">

                       <form name="LogIn" id="login" action="/GroupProject/login" method="post">
                            <div class="form-group">
                                <label for="UserName">User Name</label>
                                <input type="text" class="form-control" name="username" id="Username" aria-describedby="emailHelp"
                                    placeholder="User name">

                            </div>
                            <div class="form-group">
                                <label for="pwd">Password</label>
                                <input type="password" class="form-control" name="password" col-sm-2 col-form-label id="exampleInputPassword1"
                                    placeholder="Password">
                            </div>
                            <div class="form-group form-check">
                                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                <label class="form-check-label" for="exampleCheck1">Remember Me</label>
                            </div>
                            <p> Not yet registered please Sign Up</p>
                            <button type="submit" class="btn btn-primary">Log In</button>
                            <a href="/GroupProject/foreman/signup.jsp">sign up</a>
                        </form>
                    </div>
                </div>
            </div>

            <div class="col-3">

            </div>
            <!-- <div class="col-sm-8 col-offset-sm-3">

                
            </div> -->
        </div>
    </div>
    
    <script src="/assets/js/jquery-3.3.1.slim.min.js"></script>
    <script src="/assets/js/popper.min.js"></script>
    <script src="/assets/js/parsely.min.js"></script>
    <script type="text/javascript">
        $(function () {
          $('#login').parsley().on('field:validated', function() {
            var ok = $('.parsley-error').length === 0;
            $('.bs-callout-info').toggleClass('hidden', !ok);
            $('.bs-callout-warning').toggleClass('hidden', ok);
          })
          .on('form:submit', function() {
            return false; // Don't submit form for this demo
          });
        });
        </script>
        

        






</body>


</html>
