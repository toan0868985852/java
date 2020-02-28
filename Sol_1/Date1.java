/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol_1;

/**
 *
 * @author Huy Toan
 */
public class Date1 {

    private int day;
    private int month;
    private int year;

    public Date1() {

    }

    public Date1(int day, int month, int year) {

        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Ngày không hợp lệ");
        }

        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Tháng không hợp lệ");
        }

        if (year >= 1990 && year <= 9999) {
            this.year = year;
        } else {
            System.out.println("Năm không hợp lệ");
        }
    }

    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Ngày không hợp lệ");
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Tháng không hợp lệ");
        }
    }

    public void setYear(int year) {
        if (year >= 1990 && year <= 9999) {
            this.year = year;
        } else {
            System.out.println("Năm không hợp lệ");
        }
    }

    public void setDate(int day, int month, int year) {

        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Ngày không hợp lệ");
        }

        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Tháng không hợp lệ");
        }

        if (year >= 1990 && year <= 9999) {
            this.year = year;
        } else {
            System.out.println("Năm không hợp lệ");
        }

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%4d", day, month, year);
    }
}
