import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력받기
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // 탐색 범위 끝 초기화
        int end = n;

        while (end > 0) {
            int maxIndex = -1; // 최댓값의 위치
            int maxValue = Integer.MIN_VALUE; // 최댓값

            // 현재 범위에서 최댓값과 위치 찾기
            for (int i = 0; i < end; i++) {
                if (nums[i] > maxValue) {
                    maxValue = nums[i];
                    maxIndex = i;
                }
            }

            // 최댓값 위치 출력 (1-based index)
            System.out.print((maxIndex + 1) + " ");

            // 탐색 범위 축소
            end = maxIndex;

            // 종료 조건
            if (end == 0) {
                break;
            }
        }
    }
}
