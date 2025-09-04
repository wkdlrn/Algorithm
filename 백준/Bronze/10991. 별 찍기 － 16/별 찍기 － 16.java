import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            // 왼쪽 공백
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            // 별 + 사이 공백
            for (int j = 0; j < i; j++) {
                System.out.print("*");
                if (j < i - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}