package giftview;
import giftcontroller.Giftcontroller;
import giftmodel.Gift;
import java.util.Scanner;

public class GiftShow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 1;
        int menu;
        Giftcontroller g1 = new Giftcontroller();


            System.out.println("1.chọn xem quà tặng");
            System.out.println("2.thêm quà tặng");
            System.out.println("3.xóa quà tặng");
            System.out.println("4.thoát chương trình");
            while (f == 1){
            do {
                System.out.println("Chọn một chức năng:");
                menu = sc.nextInt();
            }while (menu > 4 || menu < 1);
            {
                if (menu == 1) {
                    g1.select();
                }
                if (menu == 2) {
                    System.out.println("nhập id:");
                    int id = sc.nextInt();
                    System.out.println("nhập tên sách:");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println("nhập giá tiền:");
                    float price = sc.nextFloat();
                    System.out.println("Nhập qty");
                    int qty = sc.nextInt();
                    g1.insert(id, name, price, qty);
                }
                if (menu == 3) {
                    System.out.print("Nhập id muốn xóa: ");
                    g1.delete(sc.nextInt());
                }
                if (menu == 4) {
                    System.out.println("thoát chương trình:");
                    f=2;
                }
            }
        }

    }
}
