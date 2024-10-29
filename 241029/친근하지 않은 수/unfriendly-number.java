import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 1; i <= n; i++){
            if(i % 5 != 0 && (i % 2 !=0 && i % 3 != 0)) {
                cnt++;
            }
            // if(i % 2 !=0 && i % 3 != 0) {
            //     cnt++;
            //     System.out.println(" cnt = " + cnt);
            //     continue;
            // }
        }
        System.out.println(cnt);
    }
}