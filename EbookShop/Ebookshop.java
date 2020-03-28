package EbookShop;

import java.sql.*;
import java.util.Scanner;

public class Ebookshop {
    public static void main(String[] args) {
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
            //Delete
            String sqlDlete = "delete from ebookshop.books where id >= 3000 and  id < 4000";
            System.out.println("the sql statemen is: " + sqlDlete + "\n");
            int coutdelete = stmt.executeUpdate(sqlDlete);
            System.out.println(coutdelete + "records delete.");
            //insert a record
            String sqlInsert = "insert into ebookshop.books values (3001, 'Gone fising', 'kumar', 11.11, 11)";
            System.out.println("the sql statemen is: " + sqlInsert + "\n");
            int coutInsert = stmt.executeUpdate(sqlInsert);
            System.out.println(coutInsert + "records inserted.");
            //insert a partial record
             sqlInsert = "insert into ebookshop.books values (3002, 'Gone fising 2', 'kumar', 22.22, 22)," +
                                                            "(3003, 'Gone fising 3', 'kumar', 33.33, 33)";
            System.out.println("the swl statemen is: " + sqlInsert +"\n");
             coutInsert = stmt.executeUpdate(sqlInsert);
            System.out.println(coutInsert + "records insert.\n");

            sqlInsert = "insert into ebookshop.books (id, title, author) values (3004, 'fising101', 'kumar')";
            System.out.println("the sql statemen is: " + sqlInsert +"\n");
            coutInsert = stmt.executeUpdate(sqlInsert);
            System.out.println(coutInsert + "records insert.\n");

            String strselect = "select * from books";
            System.out.println("the sql statemen is: " + strselect +"\n");
            ResultSet rset = stmt.executeQuery(strselect);
            while (rset.next()){
                System.out.println(rset.getInt("id") + ","
                        + rset.getString("author") + ","
                        + rset.getString("title") + ","
                        + rset.getDouble("price") + ","
                        + rset.getInt("qty"));
            }

            //Bài tập 1

            String Dlete = "delete from ebookshop.books where id >= 8000 ";
            System.out.println("the sql statemen is: " + sqlDlete + "\n");
            int delete = stmt.executeUpdate(Dlete);
            System.out.println(delete + "records delete.");

            sqlInsert = "insert into ebookshop.books values (8001, 'java core', 'Dang Kim Thi', 15.55, 55)," +
                    "(8002, 'Java Advanced', 'james gosling', 25.55, 55)";
            System.out.println("the swl statemen is: " + sqlInsert +"\n");
            coutInsert = stmt.executeUpdate(sqlInsert);
            System.out.println(coutInsert + "records insert.\n");

//            sqlInsert = "insert into ebookshop.books (id, title, author) values (2001, 'java JDBC Mysql', 'ThiDK')";
//            System.out.println("the sql statemen is: " + sqlInsert +"\n");
//            coutInsert = stmt.executeUpdate(sqlInsert);
//            System.out.println(coutInsert + "records insert.\n");

            System.out.println("Xóa ID");
            int id = sc.nextInt();
            String Dlete2 = "delete from ebookshop.books where id =" + id + " ";
            System.out.println("the sql statemen is: " + Dlete + "\n");
            int delete2 = stmt.executeUpdate(Dlete2);
            System.out.println(delete2 + "records delete.");

            System.out.println("nhập vào id:");
            int id2 = sc.nextInt();
            System.out.println("nhập vào title:");
            sc.nextLine();
            String title = sc.nextLine();
            System.out.println("nhập vào author:");
            String author = sc.nextLine();
            System.out.println("nhập vào price:");
            float price = sc.nextFloat();
            System.out.println("nhập vào qty:");
            int qty = sc.nextInt();
            String Insert2 = "insert into ebookshop.books values (" + id2 + ",'" + title + "','" + author + "'," + price + ", " + qty + ")";
            System.out.println("the sql statemen is: " + Insert2 + "\n");
            int coutInsert2 = stmt.executeUpdate(Insert2);
            System.out.println(coutInsert2 + "records inserted.");

            String strselect2 = "select * from books";
            System.out.println("the sql statemen is: " + strselect +"\n");
            ResultSet rset2 = stmt.executeQuery(strselect2);
            while (rset2.next()){
                System.out.println(rset2.getInt("id") + ","
                        + rset2.getString("author") + ","
                        + rset2.getString("title") + ","
                        + rset2.getDouble("price") + ","
                        + rset2.getInt("qty"));
            }



        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }
}
