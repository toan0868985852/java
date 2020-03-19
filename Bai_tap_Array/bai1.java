package src.Bai_tap_Array;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 1,n;
        int sum = 0;
        int avg = 0;
        float avgNumber;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.print("nhập vào độ dài của Array: ");
        n = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int count = 1; count <= n; count++) {
            numbers.add(number = sc.nextInt());
            sum += number;
        }

        avgNumber = (float) sum / n;
        System.out.println("nhiệt độ trung bình trong Trung bình trong " + n + " ngày là: " + decimalFormat.format(avgNumber));

        for (int i = 0; i <= n + 1; i++) {
            int num = numbers.get(numbers.size() - n);
            System.out.println("phần thử " + i + ", giá trị " + num);
            n-=1;
        }

    }

}
