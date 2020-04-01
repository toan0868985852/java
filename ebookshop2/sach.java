package ebookshop2;

import java.sql.*;
import java.util.Scanner;

public class sach {
    public void themsach(ebookshopsach themsach){
        Scanner sc = new Scanner(System.in);
        try (
                //step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ){
            String Insert2 = "insert into ebookshop.books values (" + themsach.getId() + ",'" + themsach.getAuthor() + "','" + themsach.getTitle() + "'," + themsach.getPrice() + ", " + themsach.getQty() + ")";
            int coutInsert2 = stmt.executeUpdate(Insert2);

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    public void suasach(String sachmoi, String sachcu) {
        Scanner sc = new Scanner(System.in);
        try (
                //step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ) {
            String update = "update ebookshop.books set title = '" + sachmoi + "' where title = '" + sachcu + "'";
            System.out.println("Đã đổi tên sách.");
            int counUpdate = stmt.executeUpdate(update);

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }
    public void xoasach(ebookshopsach xoasach) {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ) {
            String delete = "SELECT * FROM donhangchitiet WHERE id IN (SELECT id FROM books WHERE books.id = " + xoasach.getId() + ")";
            ResultSet user = stmt.executeQuery(delete);
            if (user.next()) {
                System.out.println("không thể xóa đơn hàng");
            }else{
                String Dlete = "delete from ebookshop.books where id = '" + xoasach.getId() + "'";
                int delete2 = stmt.executeUpdate(Dlete);
                System.out.println("Đã xóa đơn hàng.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }
    public void hienthisach() {
        try (
                //step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ) {
            String strselect2 = "select * from books";
            ResultSet rset2 = stmt.executeQuery(strselect2);
            while (rset2.next()){
                System.out.println(rset2.getInt("id") + ", "
                        + rset2.getString("author") + ", "
                        + rset2.getString("title") + ", "
                        + rset2.getDouble("price") + ", "
                        + rset2.getInt("qty"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
