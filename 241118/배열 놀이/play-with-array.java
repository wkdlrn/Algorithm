import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n (원소 개수)와 q (질의 개수) 입력
        int n = sc.nextInt();
        int q = sc.nextInt();

        // n개의 원소를 배열에 저장
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // q개의 질의 처리
        for (int i = 0; i < q; i++) {
            int queryType = sc.nextInt();

            if (queryType == 1) {
                // "1 a": a번째 원소 출력
                int a = sc.nextInt();
                System.out.println(arr[a - 1]);

            } else if (queryType == 2) {
                // "2 b": 값 b의 첫 번째 등장 위치 찾기
                int b = sc.nextInt();
                int result = 0; // 값이 없으면 0
                for (int j = 0; j < n; j++) {
                    if (arr[j] == b) {
                        result = j + 1; // 1-based index
                        break;
                    }
                }
                System.out.println(result);

            } else if (queryType == 3) {
                // "3 s e": s번째부터 e번째까지 출력
                int s = sc.nextInt();
                int e = sc.nextInt();
                for (int j = s - 1; j < e; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println(); // 줄바꿈
            }
        }

        sc.close();
    }
}
