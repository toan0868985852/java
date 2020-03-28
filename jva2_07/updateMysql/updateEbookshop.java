package updateMysql;

import java.sql.*;


public class updateEbookshop {
    public static void main(String[] args) {
        try (
                //step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ){
            String update = "update ebookshop.books set price = price * 0.7, qty = qty + 1 where id = 1001";
            System.out.println("the SQL Statement is: " + update + "\n");
            int counUpdate = stmt.executeUpdate(update);

            String strselect = "select * from books where id = 1001";
            System.out.println("the sql statemen is: " + strselect +"\n");
            ResultSet rset = stmt.executeQuery(strselect);
            while (rset.next()){
                System.out.println(rset.getInt("id") + ","
                        + rset.getString("author") + ","
                        + rset.getString("title") + ","
                        + rset.getDouble("price") + ","
                        + rset.getInt("qty"));
            }

            String updateprice = "update ebookshop.books set price = price + price * 0.5 where title = 'A Cup of java'";
            System.out.println("the SQL Statement is: " + updateprice + "\n");
            int Update2 = stmt.executeUpdate(updateprice);

            String updateprice2 = "update ebookshop.books set qty = qty - qty where title = 'A Teaspoon of java'";
            System.out.println("the SQL Statement is: " + updateprice + "\n");
            int Update3 = stmt.executeUpdate(updateprice2);

        }catch (SQLException ex) {
            ex.printStackTrace();

        }
    }
}
