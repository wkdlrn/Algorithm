import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int cnt = 0;

        for (int i = start; i <= end; i++) {
            int sum = 0;

            // 진약수를 구하고 합산하는 루프
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            // 완전수인지 확인
            if (sum == i) {
                cnt++;
            }
        }

        // 완전수 개수 출력
        System.out.println(cnt);
}
}