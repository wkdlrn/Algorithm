import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int middle;
        middle = a;

        if (middle > b) {
            if (middle < c) {
                middle = a;
            } else if (b > c) {
                middle = b;
            } else {
                middle = c;
            }
    } System.out.println(middle);
}