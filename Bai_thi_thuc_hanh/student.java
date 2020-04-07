package Bai_thi_thuc_hanh;

public class student {
    private String Student_id;
    private String Student_name;
    private String Address;
    private String phone;

    public student(String student_id, String student_name, String address, String phone) {
        this.Student_id = student_id;
        this.Student_name = student_name;
        this.Address = address;
        this.phone = phone;
    }

    public String getStudent_id() {
        return Student_id;
    }

    public void setStudent_id(String student_id) {
        Student_id = student_id;
    }

    public String getStudent_name() {
        return Student_name;
    }

    public void setStudent_name(String student_name) {
        Student_name = student_name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "" +
                "Mã sing viên = '" + Student_id + '\'' +
                ", Tên sinh viên = " + Student_name + '\'' +
                ", Địa chỉ = '" + Address + '\'' +
                ", Số Điện Thoại = '" + phone + '\'';
    }
}
