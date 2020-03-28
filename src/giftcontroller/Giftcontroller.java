package giftcontroller;

import giftmodel.Gift;

import java.sql.*;

public class Giftcontroller {

    public void select() {


        try (
                //step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from giftshopser";
            ResultSet rset = stmt.executeQuery(strSelect);

            int rowCount = 0;
            while (rset.next()) {
                int id = rset.getInt("id");
                String name = rset.getString("name");
                float price = rset.getFloat("price");
                int qty = rset.getInt("qty");
                System.out.println("ID: " + id + ",   Tên sách: " + name + ",   giá tiền: " + price + ",   qty: " + qty);
                ++rowCount;
            }
            System.out.println("Total number of re cords = " + rowCount);
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }


    public void insert(int id, String name, float price, int qty) {
        try (
                //step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ) {
            String sqlInsert = "insert into giftshopser values (" + id + ",'" + name + "','" + price + "'," + qty +")";
            System.out.println("Đã thêm dữ liệu: " + sqlInsert + "\n");
            int coutInsert = stmt.executeUpdate(sqlInsert);
            System.out.println(coutInsert + "records inserted.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

        public void delete(int id){
            try (
                    //step1
                    Connection conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                            "root",
                            ""
                    );
                    Statement stmt = conn.createStatement();
            ) {

                String Dlete2 = "delete from giftshopser where id =" + id + " ";
                System.out.println("Đã xóa ID : " + Dlete2 + "\n");
                int delete2 = stmt.executeUpdate(Dlete2);
                System.out.println(delete2 + "records delete.");

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }


