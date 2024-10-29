import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int j = sc.nextInt();
            if (j % 2 == 1 && j % 3 == 0) {
                sum += j;
            }
        }      
        System.out.println(sum);
    }
}