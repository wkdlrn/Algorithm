import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // 중간 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // 오른쪽 별 출력
            for (int j = 0; j < (2 * n) - (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            // 줄바꿈
            System.out.println();
        }
        //대칭
        for (int i = n - 2; i >= 0; i--) {
            // 중간 공백 출력
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // 오른쪽 별 출력
            for (int j = 0; j < (2 * n) - (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            // 줄바꿈
            System.out.println();
        }
    }
}