package giftcontroller;

import giftmodel.Gift;

import java.sql.*;

public class Giftcontroller {

    public void menu(){
        System.out.println("1.chọn xem quà tặng");
        System.out.println("2.thêm quà tặng");
        System.out.println("3.xóa quà tặng");
        System.out.println("4.thoát chương trình");
    }

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

    public void insert(Gift gift) {
        try (
                //step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ) {
            String sqlInsert = "insert into giftshopser values (" + gift.getId() + ",'" + gift.getName() + "','" + gift.getPrice() + "'," + gift.getQty() +")";
            System.out.println("Đã thêm dữ liệu: " + sqlInsert + "\n");
            int coutInsert = stmt.executeUpdate(sqlInsert);
            System.out.println(coutInsert + "records inserted.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

        public void delete(Gift giftID){
            try (
                    //step1
                    Connection conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/giftshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                            "root",
                            ""
                    );
                    Statement stmt = conn.createStatement();
            ) {

                String Dlete2 = "delete from giftshopser where id =" + giftID.getId() + " ";
                System.out.println("Đã xóa ID : " + Dlete2 + "\n");
                int delete2 = stmt.executeUpdate(Dlete2);
                System.out.println(delete2 + "records delete.");

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }


