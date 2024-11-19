import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cars = new int[n];

        for (int i = 0; i < n; i++) {
            cars[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            if (cars[i] < min) {
                min = cars[i];
                idx = i;
            }
        }
        for (int j =  idx; j < n; j++) {
            if (cars[j] > max) {
                max = cars[j];
            }
        }
        if (max - min  > 0) {
            System.out.println(max - min);
        } else {
            System.out.println("0");
        }

    }
}
