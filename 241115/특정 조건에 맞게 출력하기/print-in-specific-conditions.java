import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if(arr[i] % 2 == 1) {
                arr[i] = arr[i] + 3;
            } else {
                if (arr[i] == 0) {
                    break;
                }
                arr[i] = arr[i] / 2;
            }

            System.out.print(arr[i] + " ");
        }
    }
}
