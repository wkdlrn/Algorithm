import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] cnt = new int[101];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int in = Integer.parseInt(st.nextToken());
            int out = Integer.parseInt(st.nextToken());
            for (int j = in; j < out; j++) {
                cnt[j]++;
            }
        }
        int cost = 0;
        for (int j = 0; j < cnt.length; j++) {
            if (cnt[j] == 1) {
                cost += A;
            } else if (cnt[j] == 2) {
                cost += B * 2;
            } else if (cnt[j] == 3) {
                cost += C * 3;
            }
        }
        System.out.println(cost);
    }
}





