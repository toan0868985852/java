package ebookshop2;

import java.sql.*;

import java.util.Scanner;

public class khachhang {
    public void themkhachhang(ebookshopkhachang themkhachhang){
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
            String Insert2 = "insert into ebookshop.khachhang values (" + themkhachhang.getId() + ",'"
                                                                        + themkhachhang.getName() + "','"
                                                                        + themkhachhang.getAddress() + "','"
                                                                        + themkhachhang.getPhone() + "','"
                                                                        + themkhachhang.getEmail() + "')";
            int coutInsert2 = stmt.executeUpdate(Insert2);
            System.out.println("Đã thêm một khách hàng:");
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }
    public void suakhachhang(String phone, String email, int id) {
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
            String update = "update ebookshop.khachhang set phone = '" + phone + "', email = '" + email + "' where khachhang_id = " + id + "";
//            update ebookshop.khachhang set phone = '031213312', email = 'Vantuan@gmail.com' where khachhang_id = 2;
            System.out.println("Đã đổi phone va email khách hàng.");
            int counUpdate = stmt.executeUpdate(update);

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }
    public void xoakhachhang(ebookshopkhachang xoakhachhang) {
        Scanner sc = new Scanner(System.in);
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ) {
            String delete = "SELECT * FROM donhangchitiet WHERE khachhang_id IN (SELECT khachhang_id FROM khachhang WHERE khachhang.khachhang_id = " + xoakhachhang.getId() + ")";
            ResultSet user = stmt.executeQuery(delete);
            if (user.next()) {
                System.out.println("không thể xóa đơn hàng");
            }else{
                String Dlete = "delete from ebookshop.khachhang where khachhang_id = '" + xoakhachhang.getId() + "'";
            int delete2 = stmt.executeUpdate(Dlete);
                System.out.println("Đã xóa đơn hàng.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public void hienthikhachhang() {
        try (
                //step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ) {
            String strselect2 = "select * from khachhang";
            ResultSet rset2 = stmt.executeQuery(strselect2);
            while (rset2.next()){
                System.out.println(rset2.getInt("khachhang_id") + ", "
                        + rset2.getString("name") + ", "
                        + rset2.getString("address") + ", "
                        + rset2.getString("phone") + ", "
                        + rset2.getString("email"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
