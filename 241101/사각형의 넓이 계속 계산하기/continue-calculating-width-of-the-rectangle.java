import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            String s = sc.next();

            int area = w * h;
            System.out.println(area);
            if (s.equals("C")) {
                break;
            }
        }

        

    
    }
}