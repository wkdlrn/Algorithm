import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int[] newArr = new int[100];
        int[] countArr = new int[11];
        int zeropoint = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 10) {
                if (arr[i] == 0) {
                    zeropoint = i;
                    break;
                }
            } else {
                arr[i] = arr[i] / 10;
                newArr[i] = arr[i];
            }

        }

        // 개수 세기
        for (int i = 0; i < zeropoint; i++) {
            countArr[newArr[i]]++;
        }

        // 개수 출력
        for (int i = 10; i >= 1; i--) {
            System.out.println(i * 10 + " - " +countArr[i]);
        }
    }
}
