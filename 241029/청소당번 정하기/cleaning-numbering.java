import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++ ) {
            if (i % 12 == 0) {
                cnt3++;
            } else if (i % 3 == 0) {
                cnt2++;
            } else if (i % 2 == 0) {
                cnt1++;
            }
        } System.out.print(cnt1 + " " + cnt2 + " " + cnt3);
    }
}