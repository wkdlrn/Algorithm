import java.io.*;
import java.util.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        
        int[] Month = {31,28,31,30,31,30,31,31,30,31,30,31}; 
        String[] Day = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        
        for(int i = 0; i < X - 1; i++) {
            Y += Month[i];
        }
        System.out.println(Day[((Y-1) % 7)]);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}