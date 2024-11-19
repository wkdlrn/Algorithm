import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cars = new int[n];

        for (int i = 0; i < n; i++) {
            cars[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE; // 현재까지의 최솟값
        int maxProfit = 0; // 최대 이익

        for (int i = 0; i < n; i++) {
            // 현재 값이 최솟값보다 작다면 최솟값 갱신
            if (cars[i] < min) {
                min = cars[i];
            }

            // 현재 값에서 최솟값을 뺀 값(현재 이익)을 계산하여 최대 이익 갱신
            int profit = cars[i] - min;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println(maxProfit);
    }
}
