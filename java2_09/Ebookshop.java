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
                PreparedStatement pstm = conn.prepareStatement(
                        "insert into books values (?, ?, ?, ?, ?)");
                PreparedStatement suabook = conn.prepareStatement(
                        "update books set price = ?, qty = ? where id = ?");
                PreparedStatement delete = conn.prepareStatement(
                        "delete from books where id = ?");
                PreparedStatement themkhachhang = conn.prepareStatement(
                        "insert into khachhang values (?, ?, ?, ?, ?)");
                PreparedStatement suakhachhang = conn.prepareStatement(
                        "update khachhang set phone = ?, email = ? where khachhang_id = ?");
                PreparedStatement xoakhachhang = conn.prepareStatement(
                        "delete from khachhang where khachhang_id = ?");
                PreparedStatement themdonhang = conn.prepareStatement(
                        "insert into donhangchitiet (donhang_id, status, ngay_dat_hang, ngay_nhan_hang, address, phone) values (?, ?, ?, ?, ?, ?)");
                PreparedStatement suadonhang = conn.prepareStatement(
                        "update donhangchitiet set address = ?, phone = ? where donhang_id = ?");
                PreparedStatement xoadonhang = conn.prepareStatement(
                        "delete from donhangchitiet where donhang_id = ?");

                PreparedStatement pstmtselect1 = conn.prepareStatement("select * from books");
                PreparedStatement pstmtselect2 = conn.prepareStatement("select * from khachhang");
                PreparedStatement pstmtselect3 = conn.prepareStatement("select * from donhangchitiet");


        ) {
            System.out.println("==Thêm một quyển sách==");
            System.out.println("Nhập vào ID:");
            pstm.setInt(1, sc.nextInt());
            System.out.println("Nhập vào author:");
            sc.nextLine();
            pstm.setString(2, sc.nextLine());
            System.out.println("Nhập vào title");
            pstm.setString(3, sc.nextLine());
            System.out.println("Nhập vào price");
            pstm.setDouble(4,sc.nextDouble());
            System.out.println("Nhập vào qty");
            pstm.setInt(5, sc.nextInt());
            int rowsInserted = pstm.executeUpdate();

            // sửa sách
            System.out.println("==suaw một quyển sách");
            System.out.println("nhập vào id sách muốn sửa");
            suabook.setInt(3,sc.nextInt());
            System.out.println("nhập vào giá tiền mới:");
            suabook.setFloat(1,sc.nextFloat());
            System.out.println("nhập váo số lượng mới");
            suabook.setInt(2,sc.nextInt());
            int suasach = suabook.executeUpdate();

            //xóa một quyển sách
            System.out.println("==Xóa Một Quyển Sách==");
            System.out.println("Nhập vào Id muốn xóa");
            delete.setInt(1,sc.nextInt());
            int deleteID = delete.executeUpdate();

            ResultSet rset2 = pstmtselect1.executeQuery("select * from books");
            ResultSetMetaData rsetMD2 = rset2.getMetaData();
            int numcolum2 = rsetMD2.getColumnCount();

            for (int i = 1; i <= numcolum2; ++i) {
                System.out.printf("%-30s",rsetMD2.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= numcolum2; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD2.getColumnClassName(i) + ")");
            }
            System.out.println();

            while (rset2.next()){
                for (int i = 1; i <= numcolum2; ++i) {
                    System.out.printf("%-30s",rset2.getString(i));
                }
                System.out.println();
            }

            //thêm một khách hàng
            System.out.println("==thêm một khách hàng==");
            System.out.println("Nhập vào ID:");
            themkhachhang.setInt(1, sc.nextInt());
            System.out.println("Nhập vào name:");
            themkhachhang.setString(2, sc.nextLine());
            System.out.println("Nhập vào address");
            themkhachhang.setString(3, sc.nextLine());
            System.out.println("Nhập vào phone");
            themkhachhang.setString(4,sc.nextLine());
            System.out.println("Nhập vào email");
            themkhachhang.setString(5, sc.nextLine());
            int rowsInserted2 = themkhachhang.executeUpdate();

            // sửa khách hàng
            System.out.println("==sửa một khách hàng");
            System.out.println("nhập vào id khách hàng muốn sửa");
            suakhachhang.setInt(3,sc.nextInt());
            System.out.println("nhập vào giá số điện thoại mới:");
            suakhachhang.setString(1,sc.nextLine());
            System.out.println("nhập váo email mới");
            suakhachhang.setString(2,sc.nextLine());
            int khachhang = suakhachhang.executeUpdate();

            //xóa một khách hàng
            System.out.println("==Xóa một khách hàng==");
            System.out.println("Nhập vào Id muốn xóa");
            xoakhachhang.setInt(1,sc.nextInt());
            int deletekhachhang = xoakhachhang.executeUpdate();

            ResultSet rset3 = pstmtselect1.executeQuery("select * from khachhang");
            ResultSetMetaData rsetMD3 = rset3.getMetaData();
            int numcolum3 = rsetMD3.getColumnCount();

            for (int i = 1; i <= numcolum3; ++i) {
                System.out.printf("%-30s",rsetMD3.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= numcolum3; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD3.getColumnClassName(i) + ")");
            }
            System.out.println();

            while (rset3.next()){
                for (int i = 1; i <= numcolum3; ++i) {
                    System.out.printf("%-30s",rset3.getString(i));
                }
                System.out.println();
            }

            //thêm một đơn hàng
            System.out.println("==thêm một đơn hàng==");
            System.out.println("Nhập vào ID:");
            themdonhang.setInt(1, sc.nextInt());
            System.out.println("Nhập vào Status:");
            themdonhang.setString(2, sc.nextLine());
            System.out.println("Nhập vào ngay_dat_hang");
            themdonhang.setString(3, sc.nextLine());
            System.out.println("Nhập vào ngay_nhan_hang");
            themdonhang.setString(4,sc.nextLine());
            System.out.println("Nhập vào address");
            themdonhang.setString(5, sc.nextLine());
            System.out.println("Nhập vào phone");
            themdonhang.setString(6, sc.nextLine());
            int rowsInserted3 = themdonhang.executeUpdate();

            // sửa đơn hàng
            System.out.println("==sửa một đơn hàng");
            System.out.println("nhập vào id sách muốn sửa");
            suadonhang.setInt(3,sc.nextInt());
            System.out.println("nhập vào địa chỉ mới:");
            suadonhang.setString(1,sc.nextLine());
            System.out.println("nhập váo số điện thoại mới");
            suadonhang.setString(2,sc.nextLine());
            int donhang = suadonhang.executeUpdate();

            //xóa một đơn hàng
            System.out.println("==Xóa một đơn hàng==");
            System.out.println("Nhập vào Id muốn xóa");
            xoadonhang.setInt(1,sc.nextInt());
            int deletedonhang = xoadonhang.executeUpdate();


            ResultSet rset4 = pstmtselect1.executeQuery("select * from donhangchitiet");
            ResultSetMetaData rsetMD4 = rset4.getMetaData();
            int numcolum4 = rsetMD4.getColumnCount();

            for (int i = 1; i <= numcolum4; ++i) {
                System.out.printf("%-30s",rsetMD4.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= numcolum4; ++i) {
                System.out.printf("%-30s",
                        "(" + rsetMD4.getColumnClassName(i) + ")");
            }
            System.out.println();

            while (rset4.next()){
                for (int i = 1; i <= numcolum4; ++i) {
                    System.out.printf("%-30s",rset4.getString(i));
                }
                System.out.println();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }
}
