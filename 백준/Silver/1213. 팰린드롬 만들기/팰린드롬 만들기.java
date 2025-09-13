import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] cnt = new int[200];
        for (char c : s.toCharArray()) cnt[c]++;

        StringBuilder ret = new StringBuilder();
        int flag = 0;
        char mid = 0;

        for (int i = 'Z'; i >= 'A'; i--) {
            if (cnt[i] > 0) {
                if ( (cnt[i] & 1) == 1 ) { // cnt[i]가 홀수라면
                    mid = (char)i;
                    flag++;
                    cnt[i]--;
                }
                if (flag == 2) break;
                for (int j = 0; j < cnt[i]; j += 2) {
                    ret.insert(0, (char)i);
                    ret.append((char)i);
                }

            }
        }

        if (mid != 0) ret.insert(ret.length() / 2, mid);

        if (flag == 2) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            System.out.println(ret.toString());
        }
    }
}
