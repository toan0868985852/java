package sql;

import java.sql.*;

public class JdbcSelecTest2 {
    public static void main(String[] args) {
        try (
                //step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                        Statement stmt = conn.createStatement();

                //the format is: jdbc:mysql://hostname:post/databaseName", "username", "password"

                //step2

        ) {
            //steep3
            String strSelect = "select id, title, author, price, qty from books";

            System.out.println("the SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            //step4
            System.out.println("the records selestted are");
            int rowCount = 0;
            while (rset.next()){
                int id        = rset.getInt("id");
                String title  = rset.getString("title");
                String author = rset.getString("author");
                double price  = rset.getDouble("price");
                int qty       = rset.getInt("qty");
                System.out.println(id + ", " + title + ", " + author + ", " + price +", " +qty);
                ++rowCount;
            }
            System.out.println("Total number of re cords = " + rowCount);
            /**
             * lấy ra author = Codelean VN
             */
            String str = "select title, price from books where author = 'Codelean VN'";
            System.out.println("the SQL statement is: " + str + "\n");
            ResultSet rset2 = stmt.executeQuery(str);

            //step4
            int rowCount2 = 0;
            while (rset2.next()) {
                String title = rset2.getString("title");
                double price = rset2.getDouble("price");
                System.out.println(title + ", " + price);
                ++rowCount2;
            }
            System.out.println("Total number of re cord = " + rowCount2);


            String str3 = "select title, author, price, qty from books where author = 'Codelean VN' or price >= 30 ORDER by price DESC, id ASC ";
            System.out.println("the SQL statement is: " + str3 + "\n");

            ResultSet rset3 = stmt.executeQuery(str3);

            //step4
            int rowCount3 = 0;
            while (rset3.next()) {
                String title  = rset3.getString("title");
                String author = rset3.getString("author");
                double price  = rset3.getDouble("price");
                int qty       = rset3.getInt("qty");
                System.out.println(title + ", " + author + ", " + price + ", " + qty);
                ++rowCount3;
            }
            System.out.println("Total number of re cords = " + rowCount3);
        } catch (SQLException ex) {
            ex.printStackTrace();

        }

    }
}
