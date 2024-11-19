import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nums = new int [10];

        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            if (nums[i] < 500 && nums[i] > max) {
                max = nums[i];
            } else if (nums[i] > 500 && nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.print(max + " " + min);
    }
}
