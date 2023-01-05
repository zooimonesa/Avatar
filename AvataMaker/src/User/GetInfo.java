package User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbutil.ConnectionProvider;

public class GetInfo {
   public static int fuserpk;
   public static String fmainid;
   public static String fmainnickname;
   public static int fmainpoint;
   public static int fmainhealth;
   public static int fmainintelligence;
   public static int fmaintalent;
   
   
   public static void SetUserAll(String ID) {
      
      String find = "SELECT * FROM userinfo WHERE ID = ?";
      
      try (Connection conn = ConnectionProvider.makeConnection();
            PreparedStatement stmt = conn.prepareStatement(find);) {
         stmt.setString(1, ID);
         try (ResultSet rs = stmt.executeQuery();) {

            while (rs.next()) {
                
               fmainpoint = rs.getInt("point");
               fmainhealth =  rs.getInt("health");
               fmainintelligence =  rs.getInt("intelligence");
               fmaintalent =  rs.getInt("talent");

            }

         }
      } catch (SQLException e) {
         System.out.println("예:외");
         throw new DataIOException(e);
      }
   }
   
   
   public static void main(String[] args) {
      try {
         System.out.println(fmainnickname);
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
}