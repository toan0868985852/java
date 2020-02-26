/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol_01;

/**
 *
 * @author Huy Toan
 */
public class testEmployee {

    public static void main(String[] args) {
        employee e1 = new employee(10, "Trần", "Xuân Hùng", 3000000);
        System.out.println(e1.toString());

        employee e2 = new employee(2, "Nguyễn", "Huy Toản", 4000200);
        System.out.println(e2.toString());

        System.out.println("mã nhân viên" + e2.getId());
        System.out.println("họ: " + e2.getFirstName());
        System.out.println("tên: " + e2.getLastName());
        System.out.println("họ và tên: " + e2.getName());
        System.out.println("lương tháng: " + e2.getSalary());
        System.out.println("lương hành năm: " + e2.getAnnualsalary());
        System.out.println("======================");

        System.out.println("mã nhân viên: " + e1.getId());
        System.out.println("họ: " + e1.getFirstName());
        System.out.println("tên: " + e1.getLastName());
        System.out.println("họ và tên: " + e1.getName());
        System.out.println("lương tháng: " + e1.getSalary());
        System.out.println("lương hàng năm: " + e1.getAnnualsalary());
    }
}
