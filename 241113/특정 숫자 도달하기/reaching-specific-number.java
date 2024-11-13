import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int cnt = 0;
        double avg;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] >= 250) {
                break;
            }
            sum += arr[i];
            cnt++;
        }
        avg = (double) sum / cnt;
        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);
    }
}
