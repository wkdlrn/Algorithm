import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();
        int cnt = 0;

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {// 홀수 번째줄
                    cnt++;
                    System.out.print(cnt + " ");
                } else {// 짝수 번째줄
                    cnt += 2;
                    System.out.print(cnt + " ");
                }

            }
            System.out.println();
        }
    }
}