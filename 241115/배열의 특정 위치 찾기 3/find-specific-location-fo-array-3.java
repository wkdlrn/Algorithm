import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100]; // 최대 100개의 정수를 저장할 배열
        int index = 0;
        
        // 입력을 배열에 저장
        while (sc.hasNextInt()) {
            arr[index++] = sc.nextInt();
            if (arr[index - 1] == 0) { // 0을 만나면 종료
                break;
            }
        }

        // 첫 번째 0 앞의 세 숫자를 더함
        if (index >= 4) { // 최소한 네 번째 이후에 0이 있다고 가정
            int sum = arr[index - 2] + arr[index - 3] + arr[index - 4];
            System.out.println(sum);
        } 
    }
}
