import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                count++;
            }
            if (count == 3) {
                result = i + 1;
                break;
            }
        }
        System.out.println(result);
    }
}
