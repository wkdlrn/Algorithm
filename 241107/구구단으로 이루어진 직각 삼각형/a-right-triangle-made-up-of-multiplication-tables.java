import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n -i +1; j++) {
                if (j != n-i+1)
                    System.out.print(i + " * " + j + " = " + (i * j) + " / ");
                else {
                    System.out.print(i + " * " + j + " = " + (i * j));
                }
            }
            System.out.println();
        }
    }
}