package java2_11;

import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class mua_hang {
    public void hienthisach(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ) {

            ResultSet rset = stmt.executeQuery("select * from books");
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numcolum = rsetMD.getColumnCount();

            for (int i = 1; i <= numcolum; ++i) {
                System.out.printf("%-30s",rsetMD.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= numcolum; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();

            while (rset.next()){
                for (int i = 1; i <= numcolum; ++i) {
                    System.out.printf("%-30s",rset.getString(i));
                }
                System.out.println();
            }

            ArrayList<item> itemlist = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int j;
            do {
                System.out.println("nhập sự lựa chọ của bạn:");
                do {
                    System.out.println("1.chọn sách");
                    System.out.println("2.thoát chượng trình");
                    j = sc.nextInt();
                }while (j < 1 || j > 2);
                switch (j){
                    case 1:
                        try {
                            conn.setAutoCommit(false);
                            System.out.println("Nhập id sách:");
                            int id = sc.nextInt();
                            System.out.println("nhập số lượng sách:");
                            int qty = sc.nextInt();
                            System.out.println("Nhập giá sách:");
                            float price = sc.nextFloat();
                            item item = new item(id,qty,price);
                            itemlist.add(new item(item.getId(),item.getQty(),item.getPrice()));
                            itemlist.sort(Comparator.comparingInt(java2_11.item::getId));
                            String update = "update ebookshop.books set qty = qty -" + qty + " where id = " + id + " ";
                            int counUpdate = stmt.executeUpdate(update);
                            conn.commit();
                            break;
                        }catch (SQLException ex) {
                            conn.rollback();
                            ex.printStackTrace();
                        }
                }
            }while (j!=2);
            /**
             * sau khi thoát vòng lặp sẽ in ra danh sách các sản phẩm đã chon
             */
            System.out.println("danh sách sản phẩm đã chọn:");
//            System.out.println(itemlist);
            Iterator<item> prinitem = itemlist.iterator();
            while (prinitem.hasNext()){
                item item = prinitem.next();
                System.out.println(item);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}


