import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for(int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0; j--) {
                System.out.print((i+1) * (j + 1));
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}