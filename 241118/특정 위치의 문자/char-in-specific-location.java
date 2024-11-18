import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = new String[] {"L","E","B","R","O","S"};
        String w = sc.next();
        int idx = -1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(w)) {
                idx = i;
            }
        }
        if (idx == -1) {
            System.out.print("None");
        } else {
            System.out.print(idx);
        }

    }
}
