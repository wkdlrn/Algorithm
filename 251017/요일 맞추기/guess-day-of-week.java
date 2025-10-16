import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat" ,"Sun"};

        int start = d1;
        for (int i = 1; i < m1; i++) {
            start += months[i];
        }

        int end = d2;
        for(int i = 1; i < m2; i++) {
            end += months[i];
        }

        int diff = end - start;

        int base = 1;
        int ret = (base + diff) % 7;
        if(result < 0) {
            result += 7;
        
    
        }
    }

}