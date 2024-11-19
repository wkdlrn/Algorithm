import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int minDiff = Integer.MAX_VALUE;

        for(int i = 0; i < n - 1; i++) {
            int diff = nums[i + 1] - nums[i];
            if (diff < minDiff) {
                minDiff = diff;
            }
        }
        System.out.println(minDiff);
    }
}
