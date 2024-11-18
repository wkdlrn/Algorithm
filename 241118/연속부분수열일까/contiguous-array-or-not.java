import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt(); // 4
        int n2 = sc.nextInt(); // 2

        int[] A = new int[n1]; //1526
        int[] B = new int[n2]; //56

        for (int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }
        boolean isSubsequence = false;

        for (int i = 0; i <= n1 - n2; i++) {
            boolean match = true;
            for (int j = 0; j < n2; j++) {
                if (A[i + j] != B[j]) {
                    match = false;
                    break;
                }
            }
            if (match) {
                isSubsequence = true;
                break;
            }
        }

        System.out.println(isSubsequence ? "Yes" : "No");
    }
}
