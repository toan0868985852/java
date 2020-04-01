package ebookshop2;

import java.sql.*;

public class dangky {
    public void registration(user dangky){
        try (
                //step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ){
            String registration = "insert into users values (" + dangky.getId() + ",'" + dangky.getUsername() + "','" + dangky.getPasswork() + "'," + dangky.getRole() +")";
            System.out.println("đăng ký thông tin thành công");
            int coutInsert = stmt.executeUpdate(registration);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
