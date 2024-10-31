import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// 여기에 코드를 작성해주세요.
        int n = sc.nextInt();
        int cnt = 0;
        int prod = 1;
        
        while(n > 1) {
            n /= prod ;
            cnt++;
            prod++;
    }
    System.out.println(cnt);
}
}