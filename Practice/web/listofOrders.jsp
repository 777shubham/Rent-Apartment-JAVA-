<%@page import="java.util.ArrayList"%>
<%@page import="login.registration.ListingBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<ListingBean> ar2 = (ArrayList<ListingBean>)request.getAttribute("LordOne"); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Owned Apartments</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
            function func1()
            {
                alert("Request cancelled");
            }
            function myfunction()
            {
                document.getElementById("demo").style.color="white";
            }
      </script>
  <style>
/*    p {
    font-family: "Times New Roman", Times, serif;
    font-size: 30px;
}
  #lol {
    background-color: #E0F2F1;
}
.colorgraph {
  height: 5px;
  border-top: 0;
  background: #c4e17f;
  border-radius: 5px;
  background-image: -webkit-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -moz-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -o-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
}

   .rainbow {
  
    Font options 
  font-family: 'Pacifico', cursive;
  text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;
  
    Chrome, Safari, Opera 
  -webkit-animation: rainbow 3s infinite; 
  
   Internet Explorer 
  -ms-animation: rainbow 3s infinite;
  
   Standar Syntax 
  animation: rainbow 3s infinite; 
}

 Chrome, Safari, Opera 
@-webkit-keyframes rainbow{
  0%{color: orange;}	
  10%{color: purple;}	
	20%{color: red;}
	40%{color: yellow;}
	60%{color: green;}
	100%{color: blue;}
	100%{color: orange;}	
}

 Internet Explorer 
@-ms-keyframes rainbow{
  0%{color: orange;}	
  10%{color: purple;}	
	20%{color: red;}
	40%{color: yellow;}
	60%{color: green;}
	100%{color: blue;}
	100%{color: orange;}	
}

 Standar Syntax 
@keyframes rainbow{
  0%{color: orange;}	
  10%{color: purple;}	
	20%{color: red;}
	40%{color: yellow;}
	60%{color: green;}
	100%{color: blue;}
	100%{color: orange;}
}*/


  .content:hover{
        box-shadow: 5px 5px 15px rgba(0,0,0,1.0);
    }
   
* {
    box-sizing: border-box;
}
.footer
{
  background-color:#713a11;
  color:white;
  padding:20px;
  font-family: Verdana,sans-serif;
  text-align:left;

}  
body {
    background-color: #f1f1f1;
    padding: 20px 150px 20px 150px;
    font-family: Arial;
}

/* Center website */
.main {
    max-width: 5000px;
    margin: auto;
}

h1 {
    font-size: 50px;
    word-break: break-all;
}

.row {
    margin: 5px -10px;
}

/* Add padding BETWEEN each column (if you want) */
.row,
.row > .column {
    padding: 8px;
}

/* Create four equal columns that floats next to each other */
.content {
    align-content:center;
    width: 100%;
}

/* Clear floats after rows */ 
.row:after {
    content: "";
    display: table;
    clear: both;
}

/* Content */
.content {
    background-color: white;
    padding: 10px;
}

/* Responsive layout - makes a two column-layout instead of four columns */
@media screen and (max-width: 900px) {
    .column {
        width: 100%;
    }
}

/* Responsive layout - makes the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
    .column {
        width: 100%;
    }
}
  </style>
  
    </head>
    
    <body>
      
        <nav class="navbar navbar-inverse" >
  <div class="container-fluid" >
    <div class="navbar-nav mr-auto">
      <a class="navbar-brand" href="front.jsp"><img src="head.jpg" height="30" width="40"></a>
    </div>
  </div>
</nav>
        
        
    
    <center><h1 style="text-shadow:2px 2px red;" ><b><u>Orders</u></b></h1></center>
    
    <br>
    <h3>
    <div class="row">                    
 
    <div class="content" style="background-color: #ADD8E6;" >
        
   <%  if(!ar2.isEmpty()){
          for(int i=0;i<ar2.size();i++)
      { %>
      
      <div style="height:300px;" id="lol">
       <a href=<%= ar2.get(i).getImgLink()%> target="_blank" >
           <img src=<%= ar2.get(i).getImgLink()%> width="250" height="250" style="float:left;margin:0 20px 20px 0; border:solid; border-radius:15px 50px ; border-color:black;"> </a>
           <br><b><p style="color:#black; font-family: cursive;">Email :<%= ar2.get(i).getUserEmail()%></p></b>
           <b><p style="color:black; font-family: cursive;">State :<%= ar2.get(i).getState()%></p></b>
           <b><p style="color:black; font-family: cursive;">Address :<%= ar2.get(i).getAddress()%></p></b>
           <b><p style="color:black; font-family: cursive;">Bedrooms :<%= ar2.get(i).getBedrooms()%></p></b>
           <b><p style="color:black; font-family: cursive;">Requested By:<%= ar2.get(i).getRequestStatus()%></p></b>
      <form method="post" action="CancelRequest" onsubmit="func1()">
          <input type="hidden" name="APD" value=<%=ar2.get(i).getApId()%> >
<!--                    <button type="submit" class="btn btn-danger">Cancel Request</button>-->
      <input type="submit" value="Cancel Request" style="color:red;"></form>

    
<!--  </div>-->
  </div>
      
<hr style="color:black;">
      <%}}%>
      </div>
      </div>
    </h3>
      
    
   
       
          <br>
    </body>
</html>
