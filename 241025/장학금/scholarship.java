import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mid = sc.nextInt();
        int finals = sc.nextInt();

        if(mid >= 90) {
            if(finals >= 95) {
                System.out.println("100000");
            } else if (finals >= 90) {
                System.out.println("50000");
            } else {
                System.out.println("0");
            } 
        } else {
            System.out.println("0");
        }
    }
}