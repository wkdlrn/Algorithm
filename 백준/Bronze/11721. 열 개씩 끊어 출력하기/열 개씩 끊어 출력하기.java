import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String line = br.readLine();
        for(int i = 0; i < line.length(); i+=10) {
            int end = Math.min(i + 10, line.length());
            System.out.println(line.substring(i, end));
        }

    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}