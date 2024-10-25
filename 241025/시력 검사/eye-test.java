import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double l = sc.nextDouble();
        double r = sc.nextDouble();

        if (l >= 1.0 && r >= 1.0) {
            System.out.println("High");
        } else if ( l >= 0.5 && r >= 0.5) {
            System.out.println("Middle");
        } else {
            System.out.println("Low");
        }
    }
}