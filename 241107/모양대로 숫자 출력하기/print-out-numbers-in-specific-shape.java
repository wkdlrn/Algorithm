import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= n ; i++) {
            for(int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for(int j = n - i + 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}