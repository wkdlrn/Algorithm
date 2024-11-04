import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i) * (n - i); j++) {
                System.out.print("*");
                //
                if ((j + 1) % (n - i) == 0 && (j + 1) < (n - i) * (n - i)) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}