import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(cnt + " ");
                    cnt++;
                }
            } else {
                int end = cnt + n - 1;
                for (int j = end; j >= cnt; j--) {
                    System.out.print(j + " ");
                }
                cnt += n;

            }

            System.out.println();
        }
    }
}