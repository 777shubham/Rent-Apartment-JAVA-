package login.registration;
import java.sql.*;
public class RegisterDao {

 public boolean getRegistered(RegisterBean RR)
 {
     String Name10 = RR.getName();
     String Email10 = RR.getEmail();
     String Password10 = RR.getPassword();
     String Mobile10 = RR.getMobile();
     String Address10 = RR.getAddress();
     System.out.println(Name10);
     System.out.println(Email10);
     System.out.println(Password10);
     System.out.println(Mobile10);
     System.out.println(Address10);
     
     
     try
     {
         Connection conn=DBConnection.getConnection();
         String query1;
         query1 = "select email from SignUp2019 where email=(?)";
         PreparedStatement Ps1=conn.prepareStatement(query1);
         Ps1.setString(1,Email10);
         Ps1.execute();
         ResultSet f=Ps1.getResultSet();
         if(f.next()){
        conn.close();
          return false;}
         String query="insert into SignUp2019 values(?,?,?,?,?)";
         PreparedStatement pS = conn.prepareStatement(query);
         pS.setString(1, Name10);
         pS.setString(2, Email10);
         pS.setString(3, Password10);
         pS.setString(4, Mobile10);
         pS.setString(5, Address10);
         int i= pS.executeUpdate();
         conn.close();
         if(i!=0)
             return true;
         else
             return false;
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
     return false;
 }
}
