import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int am = sc.nextInt();
        int ae = sc.nextInt();

        int bm = sc.nextInt();
        int be = sc.nextInt();

        if (am > bm) {
            System.out.println("A");
        } else if (am == bm && ae > be) {
            System.out.println("A");
        } else if (am == bm && ae < be) {
            System.out.println("B");
        } else {
            System.out.println("B");
        }
    }
}