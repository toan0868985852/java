package java2_11;

import java.sql.*;
import java.util.Scanner;

public class chekout {
    public void checkout() {
        mua_hang m2 = new mua_hang();
        try (
                //step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("bạn có muốn mua hàng không:");
            System.out.println("1.có");
            System.out.println("2.không");
            int a = sc.nextInt();
            if (a == 1) {
                System.out.println("cần đăng nhập vào hệ thống khách hàng");
                System.out.println("Nhập Email");
                sc.nextLine();
                String email = sc.nextLine();
                String sqlInsert = "SELECT * FROM khachhang WHERE email like '" + email + "'";
                ResultSet checout1 = stmt.executeQuery(sqlInsert);
                if (checout1.next()) {
                    System.out.println("Thông tin chính xác.");
                    int thanhtoan;
                    do {
                        System.out.println("Chọn phương thức thanh toán:");
                        System.out.println("1.COD");
                        System.out.println("2.Visa");
                         thanhtoan = sc.nextInt();
                    }
                    while (thanhtoan < 1 || thanhtoan > 2);
                    System.out.println("nhập địa chỉ giao hàng:");
                    sc.nextLine();
                    String diachi = sc.nextLine();
                }else {
                    System.out.println("Thông tin không chính xác.");
                }
            }
            if (a == 2) {
                m2.hienthisach();
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
