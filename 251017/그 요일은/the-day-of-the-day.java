import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(); // 기준 날짜 월
        int d1 = sc.nextInt(); // 기준 날짜 일
        int m2 = sc.nextInt(); // 목표 날짜 월
        int d2 = sc.nextInt(); // 목표 날짜 일

        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

      
        int start = d1;
        for (int i = 1; i < m1; i++) start += months[i];

        
        int end = d2;
        for (int i = 1; i < m2; i++) end += months[i];

        if (start < end) {
            int diff = end - start;
            int result = diff / 7;
            System.out.println(result+1);
            
        } else {
            int diff = start - end;
            int result = diff / 7;
            System.out.println(result+1);
            
        }
        

        
    }
}
