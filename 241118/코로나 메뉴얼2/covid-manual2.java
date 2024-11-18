import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] answer = new String[3];
        int[] temp = new int[3];

        for (int i = 0; i < 3; i++) {
            answer[i] = sc.next();
            temp[i] = sc.nextInt();
        }
        int[] counts = new int[4];
        for (int i = 0 ; i < 3; i++) {
            if (answer[i].equals("Y") && temp[i] >= 37) {
                counts[0]++;
            } else if (answer[i].equals("N") && temp[i] >=37) {
                counts[1]++;
            } else if (answer[i].equals("Y") && temp[i] < 37) {
                counts[2]++;
            } else {
                counts[3]++;
            }
        }
        for (int count : counts) {
            System.out.print(count + " ");
        }

        if (counts[0] >= 2) {
            System.out.print("E");
        }
    }
}
