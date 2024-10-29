import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {// 3의 배수 
                System.out.print("0" + " ");
            } else if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9){
                //i를 10으로 나눴을 때 나머지 또는 몫 3, 6, 9
                System.out.print("0 ");
            } else if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
                System.out.print("0 ");
            } else {
                System.out.print(i +" ");
            }
        }
    }
}