import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            // 1. 왼쪽 공백
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }

            // 2. 별/공백 출력
            if (i == 1) {
                System.out.print("*");
            } else if (i == N) {
                for (int j = 0; j < 2 * N - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < 2 * i - 1; j++) {  
                    if (j == 0 || j == 2 * i - 2) {    
                        System.out.print("*"); // 양 끝 별
                    } else {
                        System.out.print(" "); // 내부 공백
                    }
                }
            }

            System.out.println(); // 줄바꿈

        }
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}