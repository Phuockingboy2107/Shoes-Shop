<%-- 
    Document   : Login.jsp
    Created on : Mar 6, 2023, 11:18:25 PM
    Author     : Phuoc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="css2/logincss.css"/>
        <script src=""></script>
        <!------ Include the above in your HEAD tag ---------->

        <script src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
        <link href="https://fonts.googleapis.com/css?family=Kaushan+Script" rel="stylesheet">
        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-5 mx-auto">			
                    <div id="fist">
                        <div class="myform form ">
                            <div class="logo mb-3">
                                <div class="col-md-12 text-center">
                                    <h1 >Signup</h1>
                                </div>        
                            </div>
                            <form action="signup" name="registration" method="post">
                                <p>${mess}</p>
                                
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Username</label>
                                    <input type="text" name="username"  class="form-control" id="email" aria-describedby="emailHelp" placeholder="Enter username">
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Password</label>
                                    <input type="password" name="password" id="password"  class="form-control" aria-describedby="emailHelp" placeholder="Password">
                                </div>
                                 <div class="form-group">
                                    <label for="exampleInputEmail1">Re-Password</label>
                                    <input type="password" name="repassword" id="repassword"  class="form-control" aria-describedby="emailHelp" placeholder="Re-Password">
                                </div>
                                
                                <div class="col-md-12 text-center mb-3">
                                    <button type="submit" class=" btn btn-block mybtn btn-primary tx-tfm">Sign up</button>
                                </div>
                                <div class="col-md-12 ">
                                    <div class="form-group">
                                        <p class="text-center"><a href="Login.jsp" id="signin">Already have an account?</a></p>
                                    </div>
                                </div>
                        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>   
    </body>
</html>
