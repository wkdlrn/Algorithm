import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int [] arr = new int [10];
        arr[1] = n2;
        arr[0] = n1;
        for (int i = 2; i < 10; i++) {
            arr[i] = arr[i-1] + 2 * arr[i -2];

        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
