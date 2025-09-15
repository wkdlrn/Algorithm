import java.io.*;
import java.util.*;

public class Main {
    static long a, b, c;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());

        System.out.println(go(a, b));
    }

    public static long go(long a, long b) {
        if (b == 1) {
            return a % c;
        }
        long ret = go(a,b / 2);
        ret = ret * ret % c;
        if (b % 2 == 1) {
            ret = (ret * a) % c;
        }
        return ret;
    }
}
