import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
//        int n = sc.nextInt();

        for (int i = 1; i <= 19; i++) {
            for (int j = 1; j <= 19; j++) {
                if (j % 2 == 0) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                } else {
                    if (j != 19)
                    System.out.print(i + " * " + j + " = " + (i * j) + " / ");
                    else {
                        System.out.print(i + " * " + j + " = " + (i * j));
                    }
                }
            }
            System.out.println();
        }
    }
}