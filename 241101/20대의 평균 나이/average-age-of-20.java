import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int sum = 0;
        while(true) {
            int age = sc.nextInt();
            if(age >= 20 && age < 30) {
                cnt++;
                sum += age;
            }
            else {
                if(cnt >0) {
                    double avg = (double) sum / cnt;
                    System.out.printf("%.2f", avg);
                }
                break;
            }
        }
    }
}