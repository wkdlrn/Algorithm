import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int a = sc.nextInt();
        int b = sc.nextInt();

        // b부터 a까지 감소하며 짝수의 구구단을 출력합니다.
        for(int i = 1; i < 10; i++) {
            for(int j = b; j >= a; j--) {
                if(j % 2 == 0) {
                    System.out.print(j + " * " + i + " = " + (i * j));
                    if(j != a)
                        System.out.print(" / ");
                }
            }
            System.out.println();
        }
    }
}