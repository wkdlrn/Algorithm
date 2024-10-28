import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 정수 a와 b 입력 받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // 나눗셈 연산 수행
        double result = (double) a / b;

        // String.format을 사용해 소수점 20자리까지 문자열로 변환
        String formattedResult = String.format("%.20f", result);

        // 21번째 자리에서 내림하기 위해 22번째 문자까지 잘라서 출력
        System.out.println(formattedResult.substring(0, 22));
        
        scanner.close();
    }
}