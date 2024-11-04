import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // 왼쪽 별 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // 중간 공백 출력
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            // 오른쪽 별 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // 줄바꿈
            System.out.println();
        }
    }
}