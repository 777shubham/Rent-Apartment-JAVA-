package login.registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ApproveRequest", urlPatterns = {"/ApproveRequest"})
public class Requestapproval extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          try{
              HttpSession sessionbig = request.getSession();
              String EmailOwn=(String) sessionbig.getAttribute("email");
            String email=request.getParameter("AP");
           Connection N = DBConnection.getConnection();
          String Idd01=request.getParameter("APD");
          System.out.println(Idd01);
          String query109="update Apdata set Requestdetail=(?) where ApId=(?)" ;
          PreparedStatement st220 = N.prepareStatement(query109);
          String abd="Approved";
          st220.setString(1, abd);
          st220.setString(2, Idd01);
          int i = st220.executeUpdate();
          if(i!=0)
          {
        String msg="";
        final String user="myhomeotp@gmail.com";//change accordingly  
        final String pass="murtaz22";  
  
       //1st step) Get the session object    
        Properties props = new Properties();  
        
         props.setProperty("mail.transport.protocol", "smtp");     
         props.setProperty("mail.host", "smtp.gmail.com");  
         props.put("mail.smtp.auth", "true");  
         props.put("mail.smtp.port", "465");  
         props.put("mail.debug", "true");  
         props.put("mail.smtp.socketFactory.port", "465");  
         props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");  
         props.put("mail.smtp.socketFactory.fallback", "false");
  
        Session session = Session.getDefaultInstance(props,  
        new javax.mail.Authenticator() {  
        protected PasswordAuthentication getPasswordAuthentication() {  
        return new PasswordAuthentication(user,pass);  
        }  
         });  
        //2nd step)compose message  
        try {  
        MimeMessage message = new MimeMessage(session);  
        message.setFrom(new InternetAddress(user));  
        message.addRecipient(Message.RecipientType.TO,new InternetAddress(email));  
        message.setSubject("NOTIFICATION FROM MYHOME");  
        msg="Your request for Apartment Has been Accepted by "+EmailOwn+", visit the Website and Check MYORDERS";  
        message.setText(msg);
        //3rd step)send message  
       Transport.send(message);  
  
       System.out.println("Done");  
         }
        catch (MessagingException e) {
            System.out.println(e);
       //throw new RuntimeException(e);  
       } 
           request.getRequestDispatcher("/MyOrders").forward(request, response);  
           // response.sendRedirect("FirstPage.jsp");
          }
        }
        catch(IOException | ClassNotFoundException | SQLException e){
            e.printStackTrace();}
    
    }
}
