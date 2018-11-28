package login.registration;

import login.registration.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;

public class ApartDao {
      public boolean addApp(ApartBean A)
      {
          String RoomId=A.getRoomId();
          String Address=A.getAddress();
          String state=A.getState();
          String bedrooms =A.getBedrooms();
          String Email=A.getEmail();
          InputStream img = A.getImage();
          try
          {
              Connection conn= DBConnection.getConnection();
              String query2="insert into Appdata values(?,?,?,?,?,?,?,?)";
              PreparedStatement psmt = conn.prepareStatement(query2);
              String query3="insert into Image values(?)";
              PreparedStatement psmt2 = conn.prepareStatement(query3);
              psmt2.setBlob(1, img);
              int j =(int)psmt2.executeLargeUpdate();
              PreparedStatement stmt3 = conn.prepareStatement("select photo from image");
              ResultSet rs = stmt3.executeQuery();
              rs.next();
              Blob b = rs.getBlob(1);
              byte[] by = b.getBytes(1, (int)b.length());
              String js ="H:\\Javaclasses\\Practice\\web\\"+RoomId+".jpg";
              String tryy=RoomId+".jpg";
               FileOutputStream fout = new FileOutputStream(js);
              fout.write(by);
              fout.close();
              String query4="truncate table image";
              PreparedStatement psmt5 = conn.prepareStatement(query4);
              int s=psmt5.executeUpdate();
              psmt.setString(1, RoomId);
              psmt.setString(2, Email);
              psmt.setString(4, state);
              psmt.setString(3, Address);
              psmt.setString(5, bedrooms);
              psmt.setString(6, tryy);
              psmt.setString(7, "No Requests");
              psmt.setString(8, "Request Pending");
              int i= (int)psmt.executeLargeUpdate();
         conn.close();
              System.out.println("hello"+s);
         if(i!=0 && j!=0 && s==0)
             return true;
         else
             return false;
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
          return false;
      }
}
