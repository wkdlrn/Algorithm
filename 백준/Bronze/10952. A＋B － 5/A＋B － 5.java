import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
     BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
     String line;
        while((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if (A == 0 && B == 0) {
                break;
            }
            System.out.println(A + B);
        }

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}