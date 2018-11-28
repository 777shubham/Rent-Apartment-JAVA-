package login.registration;

import login.registration.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import login.registration.DBConnection;

@WebServlet(name = "ApartmentSearch", urlPatterns = {"/ApartmentSearch"})
public class ApartmentSearch extends HttpServlet {
     @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String State10 = request.getParameter("ste");
         System.out.println("State10 = "+State10);
     HttpSession session111 = request.getSession();
          String abo=(String) session111.getAttribute("Email");
          System.out.println("abo = "+abo);
         try
         {
             Connection conn = DBConnection.getConnection();
             String que="select * from Appdata where state=(?) AND request=(?) AND email_1!=(?)";
             PreparedStatement stmt = conn.prepareStatement(que);
             if(request.getParameter("state") == null)
                 stmt.setString(1, State10);
             else
                 stmt.setString(1, request.getParameter("state"));
              stmt.setString(2, "No Requests");
              stmt.setString(3, abo);
              ResultSet resultSet = stmt.executeQuery();
              response.setContentType("text/html");
              PrintWriter out = response.getWriter();
              ArrayList<ListingBean> Arr = new ArrayList<ListingBean>(); 
             while(resultSet.next()){
               //  String z=resultSet.getString("UserEmail");
                Arr.add(new ListingBean(resultSet.getString("image"),resultSet.getString("roomid"),resultSet.getString("email_1"),resultSet.getString("state"),resultSet.getString("Address"),resultSet.getString("bedroom"),resultSet.getString("request_status"),resultSet.getString("request")));
           
               }
             System.out.println(Arr);
             // out.println("");
              request.setAttribute("Lord", Arr);
              request.getRequestDispatcher("/ListingofAparts.jsp").include(request, response);
          } 
          
         catch (IOException | ClassNotFoundException | SQLException | ServletException ex) {
             System.out.print(ex);
         }
    }

}
