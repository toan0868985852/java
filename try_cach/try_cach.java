package try_cach;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class try_cach {
    public static void main(String[] args) {
        try {
            System.out.println("Start of the main logic");
            System.out.println("try opening a file");
            Scanner in = new Scanner(new File("test.in"));
            System.out.println("file fount processing the file");
            System.out.println("end of the main magic");
        }catch (FileNotFoundException ex){
            System.out.println("file not found caught");
        }finally {
            System.out.println("finally block runs ");
        }
        System.out.println("after try-catch-finally life goes on ");
    }
}
