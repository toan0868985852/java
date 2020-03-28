package nothowind;

import java.sql.*;

public class northwind {
    public static void main(String[] args) {
        try (
                //step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/northowind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ){
            String update = "update northowind.categories set CategoryName = 'SeaFoodVN' where CategoryName = 'Seafood'";
            System.out.println("the SQL Statement is: " + update + "\n");
            int counUpdate = stmt.executeUpdate(update);

            String strselect = "select * from northowind.categories";
            System.out.println("the sql statemen is: " + strselect +"\n");
            ResultSet rset = stmt.executeQuery(strselect);
            while (rset.next()){
                System.out.println(rset.getInt("CategoryID") + ","
                        + rset.getString("CategoryName") + ","
                        + rset.getString("Description"));
            }

            String updateprice = "update northowind.customers set Address = '1A Yet Kieu - Ha Noi' where CustomerID = 'FRANK'";
            System.out.println("the SQL Statement is: " + updateprice + "\n");
            int Update2 = stmt.executeUpdate(updateprice);

            String strselect2 = "select * from northowind.customers";
            System.out.println("the sql statemen is: " + strselect2 +"\n");
            ResultSet rset2 = stmt.executeQuery(strselect2);
            while (rset2.next()){
                System.out.println(rset2.getString("CustomerID") + ","
                        + rset2.getString("Address"));
            }

            String updateCategoryID = "update northowind.products set CategoryID = CategoryID + CategoryID * 0.1 where CategoryID = 5 and 7 and 8";
            System.out.println("the SQL Statement is: " + updateCategoryID + "\n");
            int Update3 = stmt.executeUpdate(updateCategoryID);

            String strselect3 = "select * from northowind.products";
            System.out.println("the sql statemen is: " + strselect3 +"\n");
            ResultSet rset3 = stmt.executeQuery(strselect3);
            while (rset3.next()){
                System.out.println(rset3.getString("ProductName") + ","
                        + rset3.getInt("CategoryID"));
            }

            String updateorders = "update northowind.orders set ShipVia = 2  where OrderID = 10313";
            System.out.println("the SQL Statement is: " + updateorders + "\n");
            int Update4 = stmt.executeUpdate(updateorders);

            String strselect4 = "select * from northowind.orders";
            System.out.println("the sql statemen is: " + strselect4 +"\n");
            ResultSet rset4 = stmt.executeQuery(strselect4);
            while (rset4.next()){
                System.out.println(rset4.getInt("OrderID") + ","
                        + rset4.getInt("ShipVia"));
            }

        }catch (SQLException ex) {
            ex.printStackTrace();

        }
    }
}
