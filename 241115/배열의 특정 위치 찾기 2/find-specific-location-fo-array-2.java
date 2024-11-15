import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int [10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int oddsum = 0;
        int evensum = 0;
        for (int i = 0; i < 10; i++) {
            if (( i + 1) % 2 == 0) {
                oddsum += arr[i];
            } else {
                evensum += arr[i];
            }
        }
        int result = oddsum > evensum ? oddsum - evensum : evensum - oddsum;

        System.out.println(result);

    }
}
