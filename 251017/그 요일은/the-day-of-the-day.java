import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.
         int[] months = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int start = d1;
        for (int i = 1; i < m1; i++) start += months[i];
        
        int end = d2;
        for (int i = 1; i < m2; i++) end += months[i];
        
        int target = -1;
        for (int i = 0; i < 7; i++) {
            if (days[i].equals(A)){
                target = i; 
                break;
            }
        }

        int cur = 0; // 월요일
        int cnt = 0;
        for (int day = start; day <= end; day++) {
            if (cur == target) cnt++;
            cur = (cur + 1) % 7;
        }
         System.out.println(cnt);
    }
}