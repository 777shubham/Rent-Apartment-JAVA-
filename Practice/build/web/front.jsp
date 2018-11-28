<%-- 
    Document   : front
    Created on : Nov 10, 2018, 5:11:03 PM
    Author     : Shubham Mishra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 
    <head>
   
<title>APARTMENT-GURU</title>
<link rel="icon" href="head.jpg" height="30" width="60">
        <style>
            
            .division
            {
                height: 150px;
                float: bottom;
            }
            .navbar {
                overflow: hidden;
                background-color: #333;
                font-family: Arial, Helvetica, sans-serif;
            }

            .navbar a {
                float: left;
                font-size: 16px;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }

            .dropdown {
                float: left;
                overflow: hidden;
            }

            .dropdown .dropbtn {
                font-size: 16px;    
                border: none;
                outline: none;
                color: white;
                padding: 14px 16px;
                background-color: inherit;
                font-family: inherit;
                margin: 0;
            }

            .navbar a:hover, .dropdown:hover .dropbtn {
                background-color: red;
            }

            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f9f9f9;
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
            }

            .dropdown-content a {
                float: none;
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
                text-align: left;
            }

            .dropdown-content a:hover {
                background-color: #ddd;
            }

            .dropdown:hover .dropdown-content {
                display: block;
            }

   select{

     padding:18px 
     ;
   }


            * {box-sizing: border-box;}
            body {font-family: Verdana, sans-serif;}
            .mySlides {display: none;}
            img {vertical-align: middle;}

            /* Slideshow container */
            .slideshow-container {
                max-width: 1000px;
                position: relative;
                margin: auto;
            }

            .slideshow-container {
                max-width: 2000px;
                position: relative;
                margin: auto;
            }

div.fixed {
    position: fixed;
/*    bottom: 0;
    right: 0;
    width: 300px;
    border: 3px solid #73AD21;*/
}

            /* The dots/bullets/indicators */
            .dot {
                height: 15px;
                width: 15px;
                margin: 0 2px;
                background-color: #bbb;
                border-radius: 50%;
                display: inline-block;
                transition: background-color 0.6s ease;
            }

            .active {
                background-color: #717171;
            }

            /* Fading animation */
            .fade {
                -webkit-animation-name: fade;
                -webkit-animation-duration: 1.5s;
                animation-name: fade;
                animation-duration: 1.5s;
            }

            @-webkit-keyframes fade {
                from {opacity: .4} 
                to {opacity: 1}
            }

            @keyframes fade {
                from {opacity: .4} 
                to {opacity: 1}
            }

            /* On smaller screens, decrease text size */
            @media only screen and (max-width: 300px) {
                .text {font-size: 11px}
            }




        </style>
    </head>
    <body background="white">
        <a href="front.jsp"><img src="ap1.png" height="100" width="200"></a><br>
     
        <br>
        <div postion="fixed" class="navbar">
            <b><% if (session.getAttribute("Email") == null)
            {
            response.sendRedirect("Login.jsp");
            }
%>
            </b>
             <span style="float:right;color: white;margin: 0px 10px 0px 0px;"><a href="logout.jsp">LOGOUT</a> </span> 
            <span style="float:right;color: white;margin: 15px 10px 0px 0px;">Welcome <%=session.getAttribute("Email")%></span>
             
           
      <font color="White">
          <strong>
         <span style="float:right;color: white;margin: 15px 10px 0px 0px;" id="date"></span>
        </strong>           
      </font>
            <font color="White">
          <strong>
         <span style="float:right;color: white;margin: 15px 10px 0px 0px;" id="time"></span>
        </strong>           
      </font>
            

                <a href="front.jsp">HOME</a>
            <a href="userApart.jsp">UPLOAD APARTMENT</a>
            
                   
            <div class="dropdown">
                <button class="dropbtn">BUY-VILLAS
                    <!--      <i class="fa fa-caret-down"></i>-->
                </button>
                <div class="dropdown-content">
                    <a href="villa1.jsp">5k-10k</a>
                    <a href="#">10k-20k</a>
                    <a href="#">20k above</a>
                </div>
            </div> 

            <div>
            <align="right"><a href="Login.jsp">LOGIN</a>  </align>
            <align="right"><a href="Aboutus.jsp">ABOUT-US</a>  </align>
            <align="right"><a href="#">SEARCH BY LOCATION</a>  </align>
            
            </div>
       <div>
                
          <align="right"><form action="ApartmentSearch" method="post">
        <select name="ste" onchange="this.form.submit()">
          <option value="haryana" onselect="Submit" >HARYANA</option>
        <option value="himachal" onclick="Submit">HIMACHAL</option>
        <option value="chd" onselect="Submit">CHANDIGARH</option>
        <option value="karnataka" onselect="Submit">KARNATAKA</option>
        <option value="delhi" onselect="Submit" >DELHI</option>
        <option value="Punjan" onclick="Submit">PUNJAB</option>
        <option value="meghalaya" onselect="Submit">MEGHALAYA</option>
        <option value="Uttar pradesh" onselect="Submit">UTTAR PRADESH</option>
        <option value="Bihar" onselect="Submit">BIHAR</option>
        <option value="arunanchal pradesh" onclick="Submit">ARUNANCHAL PRADESH</option>
        <option value="j&k" onselect="Submit">J&K</option>
        <option value="punjab" onselect="Submit">PUNJAB</option>
        <option value="west bengal" onselect="Submit" >WEST BENGAL </option>
        <option value="rajasthan" onclick="Submit">RAJASTHAN</option>
        <option value="gujarat" onclick="Submit">GUJARAT</option>
        <option value="goa" onselect="Submit" >Goa</option>
        <option value="Madhya pradesh" onclick="Submit">MADHYA PRADESH</option>
        <option value="gujarat" onclick="Submit">GUJARAT</option>
        </select></align>

      </form>
      
</div>
            
               
        </div>
             
            
   <h1 style="color:Crimson;font-family:crimson
            ;font-size:50;text-align:center; text-shadow:1px 1px 2px black,0 0 25px blue,0 0 5px darkblue;"<b>APARTMENT-GURU</b></h1>


    <center>
        <div class="center" > 
            <div class="slideshow-container">

                <div class="mySlides fade">
                    <img src="v9.jpg" style="width:100%">
                    <div style="color:Crimson;font-family:crimson;font-size:20;" class="text"></div>
                </div>

                <div class="mySlides fade">
                    <img src="2.jpg" style="width:100%">
                    <div style="color:Crimson;font-family:crimson;font-size:20;" class="text"></div>
                </div>

                <div class="mySlides fade">
                    <img src="v3.jpg" style="width:100%">
                    <div style="color:Crimson;font-family:crimson;font-size:20;"class="text"></div>
                </div>

                <div class="mySlides fade">
                    <img src="v5.jpg" style="width:100%">
                    <div style="color:Crimson;font-family:crimson;font-size:20;" class="text"></div>
                </div>

                <br>

                <div style="text-align:center">
                    <span class="dot"></span> 
                    <span class="dot"></span> 
                    <span class="dot"></span>
                    <span class="dot"></span>

                </div>

                <script>
                    var slideIndex = 0;
                    showSlides();

                    function showSlides() {
                        var i;
                        var slides = document.getElementsByClassName("mySlides");
                        var dots = document.getElementsByClassName("dot");
                        for (i = 0; i < slides.length; i++) {
                            slides[i].style.display = "none";
                        }
                        slideIndex++;
                        if (slideIndex > slides.length) {
                            slideIndex = 1;
                        }
                        for (i = 0; i < dots.length; i++) {
                            dots[i].className = dots[i].className.replace(" active", "");
                        }
                        slides[slideIndex - 1].style.display = "block";
                        dots[slideIndex - 1].className += " active";
                        setTimeout(showSlides, 2000);
                    }
                    function vat(element) {
                        var urlParams = new URLSearchParams();
                        var xhr = new XMLHttpRequest();
                        urlParams.append("locality", element.text);
                        xhr.open("POST", "States?"+urlParams.toString());
                        xhr.send();
                    }
                </script>
            </div>
            
            <div>
                <h3 align="center" style="text-shadow:1px 1px 2px black,0 0 25px blue,0 0 5px cyan;">EXPERIENCE TRUE CONVENIENCE IN APARTMENT LIVING </h3>
          <video width="500" height="300" controls="autoplay">
            <source src="video1.mp4" type="video/mp4">
          </video>
                
                <video width="500" height="300" controls="autoplay">
            <source src="video2.mp4" type="video/mp4">
          </video> 
                
                <video width="500" height="300" controls="autoplay">
            <source src="video3.mp4" type="video/mp4">
          </video> 
            </div>
            <script>
                var today = new Date();
 document.getElementById('time').innerHTML=today.toLocaleTimeString();
              var today = new Date();
 document.getElementById('date').innerHTML=today.toLocaleDateString();</script>

            <br>
            <br><br>

            
                <div class="division" style = "background-color:black;font-family:Calibri;width:100%;">
                    <br><p style = "text-align:center;font-size:20px;color:white;">APARTMENTGURU© 2018 All rights reserved. </p>
                    <p style = "text-align:right;font-size:15px;color:white;">Designed by : Shubham Mishra<img src = "user.png" height = 25px width="25px"></p>
                    <p style = "text-align:right;font-size:15px;color:white;">Contact us : PROPERTYGURU@gmail.com&nbsp<a href = "mailto:shubham710mishra@gmail.com"><img src = "gmail.png" height = 25px width="25px"></a> </p>
                    
                </div>
            
            </body>
            </html>

