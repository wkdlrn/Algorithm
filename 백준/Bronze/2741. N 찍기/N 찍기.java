import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < N; i++) {
            System.out.println(i+1);
        }                                               
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}