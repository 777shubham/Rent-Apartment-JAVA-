<%@page import="login.registration.ListingBean"%>

<%--<%@page import="login.registration.ListingBean"%>--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% ArrayList<ListingBean> ar = (ArrayList<ListingBean>)request.getAttribute("Lord"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
<title>APARTMENT LIST</title>
<link rel="icon" href="head.jpg" height="30" width="60">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script>
      function funct()
            {
                
                    alert("Apartment Requested ,Check My Orders");
            }
      </script>
  <style>
    p {
        font-family: Arial, Helvetica, sans-serif;
    font-size: 30px;
}
 
/*.colorgraph {
  height: 5px;
  border-top: 0;
  background: black;
  border-radius: 5px;
  background-image: -webkit-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -moz-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: -o-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
  background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);
}*/

/*   .rainbow {
  
    Font options 
  font-family: 'Pacifico', cursive;
  text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;
  
    Chrome, Safari, Opera 
  -webkit-animation: rainbow 3s infinite; 
  
   Internet Explorer 
  -ms-animation: rainbow 3s infinite;
  
   Standar Syntax 
  animation: rainbow 3s infinite; 
}*/

/* Chrome, Safari, Opera */
/*@-webkit-keyframes rainbow{
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
}
*/

  </style>
  
    </head>
    <body>
        <nav class="navbar navbar-inverse">
  <div class="container-fluid" >
    <div class="navbar-nav mr-auto">
        <a class="navbar-brand" href="front.jsp"><h5 style="font-color:white;">BACK TO HOME</h5></a>
    </div>
  </div>
</nav>

      
<!--       <div class="column">-->
    <div class="content"  style = "background-color:whitesmoke;">
            <h3 color="magenta "align="center" style = "background-color:#FBF6D9;  border-style: dotted;
          border-color: black; text-shadow:2px 2px Blue;">CHOICES</h3>
          
       
       <%  if(!ar.isEmpty()){
          for(int i=0;i<ar.size();i++)
      { %>
      <div style="height:250px;" id="lol">
       <a href=<%= ar.get(i).getImgLink()%> target="_blank">
           <img src=<%= ar.get(i).getImgLink()%> width="250" height="250" style="float:left;margin:0 20px 20px 20px; border:solid; border-radius:50px 50px 50px 50px; border-color:black;"> </a>
      <p style="color:#6C2DC7;">Email :<%= ar.get(i).getUserEmail()%></p>
      <p style="color:#6C2DC7;">State :<%= ar.get(i).getState()%></p>
        <p style="color:#6C2DC7;">Address :<%= ar.get(i).getAddress()%></p>
      <p style="color:#6C2DC7;">Bedrooms :<%= ar.get(i).getBedrooms()%></p>
      <form method="post" action="Requestbuy" onsubmit="funct()">
<form action="" method="post" onsubmit="funct()">
      <input type="hidden" name="APD" value=<%=ar.get(i).getApId()%> >
      <input type="hidden" name="AP20" value=<%= ar.get(i).getUserEmail()%> >
      <button type="submit" class="btn btn-success">Request Apartment</button>
<!--    <input type="submit" value="Request Appartment">-->
</form>
      </div>
      
      <hr>
      <%}}%>
      </div>

    </body>
</html>
