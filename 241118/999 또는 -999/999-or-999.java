import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int [100];

        int result = 0;
        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == -999 || arr[i] == 999) {
                result = i;
                break;
            }
        }

        int max = arr[0];
        for (int i = 1; i < result; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.print(max + " ");
        int min = arr[0];
        for (int i = 1; i < result; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.print(min);
    }
}
