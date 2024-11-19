import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int [] count = new int[1001];

        for (int num : arr) {
            count[num]++;
        }

        int maxValue = -1;
        for (int i = 1; i <= 1000; i++) {
            if (count[i] == 1) {
                maxValue = Math.max(maxValue, i);
            }
        }
        System.out.println(maxValue);
    }
}
