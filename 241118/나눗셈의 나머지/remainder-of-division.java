import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] counts = new int [b];
        while(a > 1) {
            int remainder = a % b;
            counts[remainder]++;
            a /= b;
        }

        int result = 0;
        for (int count : counts) {
            result += count * count;
        }

        System.out.println(result);
    }
}
