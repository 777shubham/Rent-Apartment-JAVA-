package login.registration;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet(name = "Requestbuy", urlPatterns = {"/Requestbuy"})
public class Requestbuy extends HttpServlet {
      @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        try{
           Connection N = DBConnection.getConnection();
           HttpSession session12 = request.getSession();
          String ab=(String) session12.getAttribute("Email");
          String Idd1=request.getParameter("APD");
          System.out.println(Idd1);
          String EmailReq=request.getParameter("AP20");
          String query3="update appdata set request=(?) where roomid=(?)";
          PreparedStatement st2 = N.prepareStatement(query3);
          st2.setString(1, ab);
          st2.setString(2, Idd1);
          int i = st2.executeUpdate();
          
          if(i!=0)
          {
                    
             request.getRequestDispatcher("/ListOforderz").forward(request, response);
            
          }
        }
        catch(IOException | ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
}
   
