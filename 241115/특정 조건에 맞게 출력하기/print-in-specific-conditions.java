import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        // 입력값 검증
        for (int i = 0; i < 10; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        // 처리 및 출력
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 0) { // 0이면 종료
                break;
            }

            if (arr[i] % 2 == 1) { // 홀수일 경우
                arr[i] = arr[i] + 3;
            } else { // 짝수일 경우
                arr[i] = arr[i] / 2;
            }

            System.out.print(arr[i] + " ");
        }
    }
}
