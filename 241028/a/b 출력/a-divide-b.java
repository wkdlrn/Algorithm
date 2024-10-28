import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 정수 a와 b 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        System.out.print(a / b + ".");
//a를 b로 나눈 나머지에 10을 곱한 값을 
//b로 나눴을 때의 몫을 순서대로 적는것
        a %= b;
        for(int i = 0; i < 20; i++) {
            a *= 10;
            System.out.print(a / b);

            a %= b;
        }
       

    
    }
}