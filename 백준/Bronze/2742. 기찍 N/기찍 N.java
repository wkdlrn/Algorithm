import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for(int i = N; i > 0; i--){
            System.out.println(i);
        }

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}