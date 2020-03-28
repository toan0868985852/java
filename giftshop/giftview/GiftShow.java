package giftview;
import giftcontroller.Giftcontroller;
import giftmodel.Gift;
import java.util.Scanner;

public class GiftShow {

        Scanner sc = new Scanner(System.in);
        Giftcontroller g1 = new Giftcontroller();


    public static void main(String[] args) {
        GiftShow g2 = new GiftShow();
        Scanner sc = new Scanner(System.in);
        int f = 1;
        int menu;
        System.out.println("1.chọn xem quà tặng");
        System.out.println("2.thêm quà tặng");
        System.out.println("3.xóa quà tặng");
        System.out.println("4.hiển thị lại menu");
        System.out.println("5.thoát chương trình");
        while (f == 1) {
            System.out.println("Nhập một lựa chon:");
            switch (menu = sc.nextInt()) {
                case 1:
                    g2.select();
                    break;
                case 2:
                    g2.insert();
                    break;
                case 3:
                    g2.delete();
                    break;
                case 4:
                    g2.menu();
                    break;
                case 5:
                    f = 2;
                    System.out.println("Thoát chương trình:");
            }
        }
    }

    public void menu(){
        g1.menu();
    }

    public void select(){
        g1.select();
    }

    public void insert(){
        System.out.println("nhập id:");
                    int id = sc.nextInt();
                    System.out.println("nhập tên sách:");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("nhập giá tiền:");
                    float price = sc.nextFloat();
                    System.out.println("Nhập qty");
                    int qty = sc.nextInt();
                    Gift gift = new Gift(id,name, price, qty);
                    g1.insert(gift);
    }

    public void delete(){
        System.out.print("Nhập id muốn xóa: ");
                    int Id2 = sc.nextInt();
                    g1.delete(new Gift(Id2));
    }
}
