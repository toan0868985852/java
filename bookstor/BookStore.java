package bookstor;

import java.sql.*;
import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (
                //step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/boolstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();

                //the format is: jdbc:mysql://hostname:post/databaseName", "username", "password"

        ) {
            int f = 1;
            int menu;
            System.out.println("1.top 3 cuốn sách mới nhất.");
            System.out.println("2.top 4 cuốn sách bán chạy nhất.");
            System.out.println("3.tìm sách theo thể loại.");
            System.out.println("4.Tìm sách theo tên tác giả.");
            System.out.println("5.tìm sách theo mã sách.");
            System.out.println("6.hien thị lại menu.");
            System.out.println("7.thoát chương trình.");
            while (f == 1) {
                do {
                    System.out.println("Mời nhập lựa chọn:");
                    menu = sc.nextInt();
                } while (menu > 7 || menu < 1);
                {
                    if (menu == 1) {
                        String strSelect = "select ten_loai_sach, ngay_ra_mat from loai_sach where ngay_ra_mat > 2015 ORDER BY ngay_ra_mat DESC ";
                        System.out.println("the SQL statement is: " + strSelect + "\n");

                        ResultSet rset = stmt.executeQuery(strSelect);
                        System.out.println("Top 3 cuốn sách mới nhất:");
                        System.out.println("========================");
                        //step4
                        int rowCount = 0;
                        while (rset.next()) {
                            String ten_loai_sach = rset.getString("ten_loai_sach");
                            String ngay_ra_mat = rset.getString("ngay_ra_mat");
                            System.out.println("Loại sách: " + ten_loai_sach + ", " + " năm gia mắt: " + ngay_ra_mat);
                            ++rowCount;
                        }
                        System.out.println("Total number of re cords = " + rowCount);
                    }
                    if (menu == 2) {
                        String strSelect2 = "select ten_sach, noi_dung, gia_ban, so_luong from sach ORDER BY so_luong ASC LIMIT 4";

                        ResultSet rset2 = stmt.executeQuery(strSelect2);
                        System.out.println("Top 4 cuốn sách bán chạy nhất:");
                        System.out.println("========================");
                        //step4
                        int rowCount2 = 0;
                        while (rset2.next()) {
                            String ten_sach = rset2.getString("ten_sach");
                            String noi_dung = rset2.getString("noi_dung");
                            String gia_ban = rset2.getString("gia_ban");
                            int so_luong = rset2.getInt("so_luong");

                            System.out.println("Tên sách: " + ten_sach + ",   nội dung: " + noi_dung + ",   giá bán: " + gia_ban + ",   số lượng: " + so_luong);
                            ++rowCount2;
                        }
                        System.out.println("Total number of re cords = " + rowCount2);
                    }
                    if (menu == 3) {
                        System.out.println("-----------------------");
                        System.out.println("| Những thể loại sách:|");
                        System.out.println("| Giao duc.           |");
                        System.out.println("| khoa hoc cong nghe. |");
                        System.out.println("| giao trinh.         |");
                        System.out.println("| van hoc nge thuat.  |");
                        System.out.println("| sach thieu nhi.     |");
                        System.out.println("-----------------------");
                        System.out.print("Tìm sách theo thể loại:");
                        sc.nextLine();
                        String strSelect3 = "select ten_sach, noi_dung, gia_ban, so_luong, loai_sach_id from sach WHERE loai_sach_id " +
                                "IN (SELECT loai_sach_id FROM loai_sach WHERE ten_loai_sach LIKE '" +
                                "" + sc.nextLine() + "" +
                                "')";

                        ResultSet rset3 = stmt.executeQuery(strSelect3);
                        System.out.println("========================");
                        //step4
                        int rowCount3 = 0;
                        while (rset3.next()) {
                            String ten_sach = rset3.getString("ten_sach");
                            String noi_dung = rset3.getString("noi_dung");
                            String gia_ban = rset3.getString("gia_ban");
                            int so_luong = rset3.getInt("so_luong");
                            int loai_sach_id = rset3.getInt("loai_sach_id");

                            System.out.println("Tên sách: " + ten_sach + ",   nội dung: " + noi_dung + ",   giá bán: " + gia_ban + ",   số lượng: " + so_luong + ",   loại sách: " + loai_sach_id);
                            ++rowCount3;
                        }
                        System.out.println("Total number of re cords = " + rowCount3);
                    }
                    if (menu == 4) {
                        System.out.println("-------------------");
                        System.out.println("|  Các tác Giả:   |");
                        System.out.println("| Tran van A      |");
                        System.out.println("| Tran huy B      |");
                        System.out.println("| Hoang van C     |");
                        System.out.println("| Tran van D      |");
                        System.out.println("| Nguyen Van Hoang|");
                        System.out.println("-------------------");
                        System.out.print("Tìm sách theo tên tác giả:");
                        sc.nextLine();
                        String strSelect4 = "select ten_sach, noi_dung, gia_ban, so_luong, tac_gia_id from sach WHERE tac_gia_id " +
                                "IN (SELECT tac_gia_id FROM tac_gia WHERE ten_tac_gia LIKE '" +
                                "" + sc.nextLine() + "" +
                                "')";
                        ResultSet rset4 = stmt.executeQuery(strSelect4);
                        System.out.println("========================");
                        int rowCount4 = 0;
                        while (rset4.next()) {
                            String ten_sach = rset4.getString("ten_sach");
                            String noi_dung = rset4.getString("noi_dung");
                            String gia_ban = rset4.getString("gia_ban");
                            int so_luong = rset4.getInt("so_luong");
                            int tac_gia_id = rset4.getInt("tac_gia_id");

                            System.out.println("Tên sách: " + ten_sach + ",   nội dung: " + noi_dung + ",   giá bán: " + gia_ban + ",   số lượng: " + so_luong + ",   loại sách: " + tac_gia_id);
                            ++rowCount4;
                        }
                        System.out.println("Total number of re cords = " + rowCount4);
                    }
                    if (menu == 5) {
                        System.out.print("Tìm sách theo mã sách:");
                        String strSelect5 = "select * from sach WHERE id = " + sc.nextInt();
                        ResultSet rset5 = stmt.executeQuery(strSelect5);
                        System.out.println("========================");
                        int rowCount5 = 0;
                        while (rset5.next()) {
                            int id = rset5.getInt("id");
                            String ten_sach = rset5.getString("ten_sach");
                            String noi_dung = rset5.getString("noi_dung");
                            String gia_ban = rset5.getString("gia_ban");
                            int so_luong = rset5.getInt("so_luong");
                            int tac_gia_id = rset5.getInt("tac_gia_id");

                            System.out.println("Mã sách : " + id + ",   Tên sách: " + ten_sach + ",   nội dung: " + noi_dung + ",   giá bán: " + gia_ban + ",   số lượng: " + so_luong + ",   loại sách: " + tac_gia_id);
                            ++rowCount5;
                        }
                        System.out.println("Total number of re cords = " + rowCount5);
                    }
                    if (menu == 6) {
                        System.out.println("1.top 3 cuốn sách mới nhất.");
                        System.out.println("2.top 4 cuốn sách bán chạy nhất.");
                        System.out.println("3.tìm sách theo thể loại.");
                        System.out.println("4.Tìm sách theo tên tác giả.");
                        System.out.println("5.tìm sách theo mã sách.");
                        System.out.println("6.hien thị lại menu.");
                        System.out.println("7.thoát chương trình.");
                    }
                    if (menu == 7) {
                        System.out.println("Thoát chương trình:");
                        f = 2;
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
