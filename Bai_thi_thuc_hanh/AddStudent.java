package Bai_thi_thuc_hanh;

import java2_11.item;

import java.sql.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class AddStudent {
    ArrayList<student> studentadd = new ArrayList<>();
    public void addstuden() {
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ) {
            Scanner sc = new Scanner(System.in);
            int j;
            do {
                System.out.println("nhập sự lựa chọ của bạn:");
                do {
                    System.out.println("1.thêm sinh viên");
                    System.out.println("2.thoát chượng trình");
                    j = sc.nextInt();
                } while (j < 1 || j > 2);
                switch (j) {
                    case 1:
                        try {
                            conn.setAutoCommit(false);
                            System.out.println("Nhập id sinh viên:");
                            sc.nextLine();
                            String id = sc.nextLine();
                            System.out.println("nhập tên sinh viên:");
                            String name = sc.nextLine();
                            System.out.println("nhập địa chỉ sinh viên:");
                            String price = sc.nextLine();
                            System.out.println("nhập số điện thoại sinh viên:");
                            String phone = sc.nextLine();
                            student student = new student(id, name, price,phone);
                            studentadd.add(new student(student.getStudent_id(), student.getStudent_name(), student.getAddress(),student.getPhone()));
                            conn.commit();
                            break;
                        } catch (SQLException ex) {
                            conn.rollback();
                            ex.printStackTrace();
                        }
                }
            } while (j != 2);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    //ý 2
    public void showstudent(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ){
            System.out.println("danh sách các sinh viên vùa thêm:");
            Iterator<student> prinitem = studentadd.iterator();
            while (prinitem.hasNext()) {
                student student = prinitem.next();
                System.out.println(student);
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    //ý 3
    public void hienthistuden(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/student?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();
        ) {
            Iterator<student> prinitem = studentadd.iterator();
            while (prinitem.hasNext()) {
                student student = prinitem.next();
                String Insert2 = "insert into Students values ('" + student.getStudent_id() + "','" + student.getStudent_name() + "','" + student.getAddress() + "','" + student.getPhone() + "')";
                int coutInsert2 = stmt.executeUpdate(Insert2);
            }
            System.out.println("===========================================================================================");
            ResultSet rset = stmt.executeQuery("select * from Students");
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numcolum = rsetMD.getColumnCount();

            for (int i = 1; i <= numcolum; ++i) {
                System.out.printf("%-25s", rsetMD.getColumnName(i));
            }
            System.out.println();

            for (int i = 1; i <= numcolum; ++i) {
                System.out.printf("%-25s",
                        "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();

            while (rset.next()) {
                for (int i = 1; i <= numcolum; ++i) {
                    System.out.printf("%-25s", rset.getString(i));
                }
                System.out.println();
            }
            System.out.println("===========================================================================================");


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
