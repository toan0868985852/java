package src.Bai_thi_java;

import org.w3c.dom.ls.LSOutput;

public class TestSalary {
    public static void main(String[] args) {
        SalarypPolicy s1 = new EmployeeFullTime(4, 100000);
        System.out.println(s1);
        System.out.println("BaseSalary: " + s1.getBaseSalary());
        System.out.println("Salary: " + s1.getSalary());

        SalarypPolicy s2 = new EmployeePartime(2.3f, 1900900);
        System.out.println(s2);
        System.out.println("BaseSalary: " + s2.getBaseSalary());
        System.out.println("Salary: " + s2.getSalary());

    }

}
