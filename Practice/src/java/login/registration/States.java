package login.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/States"})
public class States extends HttpServlet {
   @Override
   public void service (HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
   {
       String Loc =req.getParameter("Locality");
      try
      {
         Connection conn=DBConnection.getConnection();
         String query1;
         query1 = "select * from Appdata where state=(?)";
         PreparedStatement Ps1=conn.prepareStatement(query1);
         Ps1.setString(1,Loc);
         Ps1.execute();
         ResultSet f=Ps1.getResultSet();
         ArrayList<Statebean> al=new ArrayList<Statebean>();
         {
             while(f.next())
             {
                 al.add(new Statebean());
             }
         }
         
         
      }
      catch (Exception e)
      {
          
      }
      
   }
}
