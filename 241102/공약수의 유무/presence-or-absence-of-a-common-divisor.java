import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean satisfied = false;

        for(int i = a; i <= b; i++) {
            if(i / 1920 == 0 || i / 2880 == 0) {
                satisfied = true;
            } else {
                satisfied = false;
            }
        }
        if (satisfied == true) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}