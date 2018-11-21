<%-- 
    Document   : Signup
    Created on : Nov 9, 2018, 11:35:26 PM
    Author     : Shubham Mishra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign-Up</title>
    
<link rel="icon" href="logo.png" height="30" width="60">
   
       
		<style>
     	body {background-color:cornsilk;
            font-family: Arial, Helvetica, sans-serif;}
        * {box-sizing: border-box}
		
		input[type=text], input[type=password],input[type=email],input[type=tel] {
        width: 100%;
        padding: 10px;
        margin: 5px 0 22px 0;
        display: inline-block;
        border: none;
        background: #f1f1f1;
}#submit
{
  background-color: grey;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 30%;
    opacity: 2.9;
}
hr {
    border: 1px solid #f1f1f1;
    margin-bottom: 25px;
}

		</style>
    </head>
    <body>
        <form action="InfoAdd" name="form" method="post" style="border:1px solid #ccc">
    <fieldset>

                 <legend>  <h2>Sign Up</h2> </legend>
            <p>Please fill in this form to create an account.</p>
            <hr>
            <label for="Name" ><b>Name</b></label><br>
            <input type="text" placeholder="Enter your Name"  name="Name" minlength=4 required>
            <br><label for="email" ><b>Email</b></label><br>
            <input type="email" placeholder="Enter your Email" name ="email" required>
            <br><label for="password" ><b>Password</b></label><br>
            <input type="password" placeholder="Password" name="password" minlength=6 required> 
            <br><label for="confirm"><b>Confirm Password</b></label><br>
            <input type="password" placeholder="Confirm Password" name="confirm">
            <br><label for="phone" ><b>Mobile Number</b></label><br>
            <input type="tel" placeholder="Enter your Mobile number"  name="phone" minlength=10 maxlength=10 required>
            <br><label for="address" ><b>Address</b></label><br>
            <input type="text" placeholder="Enter your Address" name="address" required>
            <br>
           <center> <input type="submit" id="submit" value ="Signup"></center>

    </fieldset> </form>
    </body>

</html>
