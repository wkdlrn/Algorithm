import java.io.*;
import java.util.*;

public class Main {
    static long cnt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < n ; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        for(int i = 0 ; i < n ; i++) {
            for(int j = i + 1; j < n; j++) {
                if((a[i] + a[j]) == m) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
