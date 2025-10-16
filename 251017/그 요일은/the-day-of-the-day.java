import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(); // 기준 날짜 월
        int d1 = sc.nextInt(); // 기준 날짜 일
        int m2 = sc.nextInt(); // 목표 날짜 월
        int d2 = sc.nextInt(); // 목표 날짜 일

        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      
        int start = d1;
        for (int i = 1; i < m1; i++) start += months[i];
        
        int end = d2;
        for (int i = 1; i < m2; i++) end += months[i];
        
        int diff = Math.abs(end - start);
        int ret = diff/7 + 1;
        System.out.println(ret);
        

    }
}
