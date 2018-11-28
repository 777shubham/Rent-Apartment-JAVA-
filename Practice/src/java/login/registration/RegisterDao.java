package login.registration;
import login.registration.*;
import java.sql.*;
public class RegisterDao {

 public boolean getRegistered(RegisterBean RR)
 {
     String Name = RR.getName();
     String Email = RR.getEmail();
     String Password = RR.getPassword();
     String Mobile = RR.getMobile();
     String Address = RR.getAddress();
     System.out.println(Name);
     System.out.println(Email);
     System.out.println(Password);
     System.out.println(Mobile);
     System.out.println(Address);
     
     
     try
     {
         Connection conn=DBConnection.getConnection();
         String query1;
         query1 = "select email from SignUp2019 where email=(?)";
         PreparedStatement Ps1=conn.prepareStatement(query1);
         Ps1.setString(1,Email);
         Ps1.execute();
         ResultSet f=Ps1.getResultSet();
         if(f.next()){
        conn.close();
          return false;}
         String query="insert into SignUp2019 values(?,?,?,?,?)";
         PreparedStatement pS = conn.prepareStatement(query);
         pS.setString(1, Name);
         pS.setString(2, Email);
         pS.setString(3, Password);
         pS.setString(4, Mobile);
         pS.setString(5, Address);
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
