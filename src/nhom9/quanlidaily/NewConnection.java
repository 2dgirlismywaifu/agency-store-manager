/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom9.quanlidaily;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author honkaiwaifu
 */
public class NewConnection {
    public static Connection getConnection() {
        
        Connection con =null;
         try {
             //đổi sqlserver khi dùng trên máy khác
    String dbURL = "jdbc:sqlserver://DESKTOP-H9PTNTN\\SQLEXPRESS:1433;"
            + "databaseName=QUANLYDAILY;"
            + "user=sa;"
            + "password=1234";
    con = DriverManager.getConnection(dbURL);
   } catch (SQLException ex) {
       JOptionPane.showMessageDialog(null, "Kết nối SQL thất bại\nChương trình sẽ thoát bây giờ!","Thông báo", JOptionPane.ERROR_MESSAGE);
       System.exit(0);
   }
         return con;
  }
}
