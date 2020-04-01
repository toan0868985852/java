package ebookshop2;

import EbookShop.Ebookshop;

import java.sql.*;
import java.util.Scanner;

public class Ebookshop2 {
    sach s1 = new sach();
    khachhang k1 = new khachhang();
    dangky d1 = new dangky();
    Scanner sc = new Scanner(System.in);

    public void dangky(){
        System.out.println("Nhập ID:");
        int id = sc.nextInt();
        System.out.println("Nhập User");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Nhập Passwork");
        String paswork = sc.nextLine();
        System.out.println("Nhập role");
        int role = sc.nextInt();
        user u1 = new user(id, name, paswork, role);
        d1.registration(u1);
    }

    public void themsach(){
        System.out.println("nhập vào id:");
        int id = sc.nextInt();
        System.out.println("nhập vào title:");
        sc.nextLine();
        String title = sc.nextLine();
        System.out.println("nhập vào author:");
        String author = sc.nextLine();
        System.out.println("nhập vào price:");
        float price = sc.nextFloat();
        System.out.println("nhập vào qty:");
        int qty = sc.nextInt();
        ebookshopsach e1 = new ebookshopsach(id, title, author, price, qty);
        s1.themsach(e1);
    }

    public void suasach(){
        System.out.println("Nhập tên sách mới:");
        String sachmoi = sc.nextLine();
        System.out.println("Muốn đổi tên sách:");
        String sachcu = sc.nextLine();
        s1.suasach(sachmoi, sachcu);
    }

    public void xoasach(){
        System.out.println("Nhập mã sách muốn xóa");
        int id = sc.nextInt();
        ebookshopsach e2 = new ebookshopsach(id);
        s1.xoasach(e2);
    }

    public void themkhachhang(){
        System.out.println("nhập vào id:");
        int id = sc.nextInt();
        System.out.println("nhập vào tên:");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("nhập vào địa chỉ:");
        String address = sc.nextLine();
        System.out.println("điện thoại:");
        String phone = sc.nextLine();
        System.out.println("Email:");
        String email = sc.nextLine();
        ebookshopkhachang e1 = new ebookshopkhachang(id, name, address, phone, email);
        k1.themkhachhang(e1);
    }

    public void suakhachhang(){
        System.out.println("Nhập id khách hàng muốn sửa:");
        int id = sc.nextInt();
        System.out.println("nhập số điện thoại mới:");
        sc.nextLine();
        String phone = sc.nextLine();
        System.out.println("nhập địa chỉ email mới:");
        String email = sc.nextLine();
        k1.suakhachhang(phone, email, id);
    }

    public void xoakhachhang(){
            System.out.println("Nhập mã khách hàng muốn xóa");
            int id = sc.nextInt();
            ebookshopkhachang e2 = new ebookshopkhachang(id);
            k1.xoakhachhang(e2);
    }

    public void login(){
        try (
                //step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ){
            System.out.println("Nhập User");
            String name = sc.nextLine();
            System.out.println("Nhập Passwork");
            String paswork = sc.nextLine();
            String sqlInsert = "SELECT username, passwork FROM users WHERE username like '" + name + "'and passwork like '" + paswork + "'";
            ResultSet user = stmt.executeQuery(sqlInsert);
            if (user.next()) {
                int b=1;
                int menu2;
                System.out.println("thông tin chính xác:");
                System.out.println("1.xây dựng hệ thống quản lý sách.");
                System.out.println("2.xây dựng hệ thống quản lý khách hàng.");
                System.out.println("3.thoát chương trình.");
                while (b == 1) {
                    Ebookshop2 e1 = new Ebookshop2();
                    sach s1 = new sach();
                    khachhang k1 = new khachhang();
                    switch (menu2 = sc.nextInt()) {
                        case 1:
                            System.out.println("1.Thêm sách:");
                            System.out.println("2.Sửa sách:");
                            System.out.println("3.Xóa sách:");
                            System.out.println("4.Hiển thị sách:");
                            System.out.println("5.thoát chương trình:");
                            int a;
                            int vonglap = 1;
                            while (vonglap == 1) {
                                System.out.println("Chọn một lựa chon:");
                                switch (a = sc.nextInt()) {
                                    case 1:
                                        e1.themsach();
                                        break;
                                    case 2:
                                        e1.suasach();
                                        break;
                                    case 3:
                                        e1.xoasach();
                                        break;
                                    case 4:
                                        s1.hienthisach();
                                        break;
                                    case 5:
                                        vonglap = 2;
                                        System.out.println("thoát chương trình");
                                        break;
                                }
                            }
                        case 2:

                                    System.out.println("1.Thêm khách hàng:");
                                    System.out.println("2.thay đổi khách hàng:");
                                    System.out.println("3.xóa khách hàng:");
                                    System.out.println("4.hiển thị thông tin khách hàng:");
                                    System.out.println("5.thoát chương trình:");
                            int c;
                            int khachhang = 1;
                            while (khachhang == 1) {
                                System.out.println("Chọn một lựa chon:");
                                switch (c = sc.nextInt()) {
                                    case 1:
                                        e1.themkhachhang();
                                        break;
                                    case 2:
                                        e1.suakhachhang();
                                        break;
                                    case 3:
                                        e1.xoakhachhang();
                                        break;
                                    case 4:
                                        k1.hienthikhachhang();
                                        break;
                                    case 5:
                                        khachhang = 2;
                                        System.out.println("thoát chương trình:");
                                        break;
                                }
                            }
                        case 3:
                            b = 2;
                            System.out.println("thoát chương trình:");
                            break;
                            }
                }
            }else{
                System.out.println("thông tin không chính xác:");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
    }

    public static void main(String[] args) {
        int menu;
        int f = 1;
        Scanner sc = new Scanner(System.in);
        Ebookshop2 e1 = new Ebookshop2();
        System.out.println("1.đăng ký thông tin.");
        System.out.println("2.đăng nhập tài khoản.");
        System.out.println("3.thoát chương trình.");
        while (f == 1) {
            System.out.println("chọn một lựa chọn:");
            switch (menu = sc.nextInt()) {
                case 1:
                    e1.dangky();
                    break;
                case 2:
                    e1.login();
                    break;
                case 3:
                    f = 2;
                    System.out.println("thoát chương trình:");
                    break;
            }
        }

    }
}
