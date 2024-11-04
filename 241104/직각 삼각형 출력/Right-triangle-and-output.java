import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            //0행 1 |i = 0, j = 0
            //1행 3 |i = 1, j = 0, 1, 2
            //2행 5 |i = 2, j = 0, 1, 2, 3, 4
            for (int j = 0; j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}