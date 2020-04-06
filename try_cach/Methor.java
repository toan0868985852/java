package try_cach;

public class Methor {
    public static void main(String[] args) {
        System.out.println("Enter main()");
    }
    public static void methorA(){
        System.out.println("Enter methor A()");
        try {
            System.out.println(1 / 0);
        }finally {
            System.out.println("Finally methor a()");
        }
        System.out.println("Exit methorA()");
    }
}
