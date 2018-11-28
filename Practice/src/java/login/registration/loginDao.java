package login.registration;

import login.registration.LoginBean;
import login.registration.*;
import java.sql.*;
public class loginDao {
  public boolean getLogIn(LoginBean LG)
  {
      String Email10=LG.getEmail();
      String Password10=LG.getPassword();
      String userEmailDB = "";
      String passwordDB = "";
      try
      {
          Connection conn =DBConnection.getConnection();
         Statement  statement = conn.createStatement();
         ResultSet resultSet = statement.executeQuery("select email,password from SignUp2019");
          while(resultSet.next())
          {
          userEmailDB = resultSet.getString("email");
          passwordDB = resultSet.getString("password");
 
   if(Email10.equals(userEmailDB) && Password10.equals(passwordDB))
   {
      return true; 
   }
 }
      }
      catch(Exception e)
      {
          System.out.println(e);
      }
      return false;
  }
//
//    public Boolean getLogIn(LoginBean LB) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public Boolean getLogIn(LoginBean LB) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
