import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = a;
        if(a > b) {
            if (b > c) {
                min = c;
            } else if (b < c) {
                min = b;
            } else if ( b == c) {
                min = b = c;
            }
        } else if (a < b) {
            if (a > c) {
                min = c;
            } else if ( a < c) {
                min = a;
            } else if ( a == c) {
                min = a = c;
            }
        } else  {
            if(a>c) {
                min = c;
            } else if (a < c) {
                min = a = b;
            }
        }

        if (a == b && a == c && a== min) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }

        if(a==b&&a==c) {
            System.out.print(" 1");
        } else {
            System.out.print(" 0");
        }



        
        
    }
}