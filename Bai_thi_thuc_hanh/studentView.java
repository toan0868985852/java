package Bai_thi_thuc_hanh;

import java.util.Scanner;

public class studentView {
    public static void main(String[] args) {
        int menu;
        int f = 1;
        Scanner sc = new Scanner(System.in);
        AddStudent a1 = new AddStudent();
        System.out.println("1.thêm thông tin sinh viên.");
        System.out.println("2.thông tin sinh viên vừa thêm.");
        System.out.println("3.hiển thị toàn bộ sinh viên.");
        System.out.println("4.thoát chương trình");
        while (f == 1) {
            System.out.println("Chọn một lựa chọn:");
            switch (menu = sc.nextInt()) {
                case 1:
                    a1.addstuden();
                    break;
                case 2:
                    a1.showstudent();
                    break;
                case 3:
                    a1.hienthistuden();
                    break;
                case 4:
                    f = 2;
                    System.out.println("thoát chương trình:");
                    break;
            }
        }
    }
}
