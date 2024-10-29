import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(a +" ");
        
        for(int i = a; i <= b; ) {
            
            if (i % 2 == 1) { //홀수인 경우 2배
                i = i * 2;
                if (i <= b)
                System.out.print(i + " ");
            } else {
                i = i + 3;
                if (i <= b)
                System.out.print(i + " ");
            }
        }
    }
}