import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(9 + (2*i + 1) + (2 * j + 1));
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}