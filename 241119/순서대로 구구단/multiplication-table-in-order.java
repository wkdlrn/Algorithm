import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            for (int j = 1; j <= 9; j++) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + " * " + j + " = " + (i * j));
                if (i < b) { // 마지막 단이 아니면 공백 추가
                    System.out.print("  ");
                }
            }
            System.out.println(); // 한 줄 끝나면 줄바꿈
        }
        } else {
             for (int j = 1; j <= 9; j++) {
            for (int i = b; i >=a; i--) {
                System.out.print(i + " * " + j + " = " + (i * j));
                if (i > a) { // 마지막 단이 아니면 공백 추가
                    System.out.print("  ");
                }
            }
            System.out.println(); // 한 줄 끝나면 줄바꿈
        }
        }

        
    }
}
