import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // n을 입력받음
        int n = scanner.nextInt();

        // 각 줄마다 반복해서 별 출력
        for (int i = 0; i < n; i++) {
            // n-i개의 별을 출력
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            // 한 줄 출력 후 다음 줄로 이동
            System.out.println();
        }

        scanner.close();
    }
}