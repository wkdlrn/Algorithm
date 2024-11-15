import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [] arr = new int [10];
        arr[0] = n;
        for (int i = 1; i < 10; i++) {
            arr[i] = arr[i-1] + n;
        }
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            if(arr[i] % 5 == 0) {
                cnt++;
            }
            System.out.print(arr[i] + " ");
            if(cnt == 2) {
                break;
            }

        }
    }
}
