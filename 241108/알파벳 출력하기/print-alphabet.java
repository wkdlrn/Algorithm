import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();
        char x = 'A';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (x == '[') {
                    x= 'A';
                }
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
}