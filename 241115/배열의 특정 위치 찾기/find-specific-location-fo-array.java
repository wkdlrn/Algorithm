import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] n = new int [10];
        for(int i = 0; i < 10; i++) {
            
            n[i] = sc.nextInt();

        }
        int cnt = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1;i < 10; i+=2) {
            sum1 += n[i];
        }
        for(int i = 2; i < 10; i+=3) {
                sum2 += n[i];
                cnt++;
            
        }
        double avg  = (double) sum2 / cnt;
        System.out.print(sum1 + " ");
        System.out.printf("%.1f",avg);
        
    }
}