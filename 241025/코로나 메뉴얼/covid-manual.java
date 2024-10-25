import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        int t1 = sc.nextInt();

        String s2 = sc.next();
        int t2 = sc.nextInt();

        String s3 = sc.next();
        int t3 = sc.nextInt();

        if ((s1.equals("Y") && t1 >= 37 && s2.equals("Y") && t2 >= 37) ||
            (s1.equals("Y") && t1 >= 37 && s3.equals("Y") && t3 >= 37) ||
            (s2.equals("Y") && t2 >= 37 && s3.equals("Y") && t3 >= 37)) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}