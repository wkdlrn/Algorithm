import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] cnt = new int[200];
        for(char c : s.toCharArray()) {
            cnt[c]++;
        }

        StringBuilder sb = new StringBuilder();
        int flag = 0;
        char mid = 0;

        for(int i = 'Z'; i >= 'A'; i--) {
            if(cnt[i] > 0) {
                if ( (cnt[i] & 1) == 1 ) {
                    mid = (char)i;
                    flag++;
                    cnt[i]--;
                }
                if(flag == 2) break;
                for(int j = 0; j < cnt[i]; j += 2) {
                    sb.insert(0,(char)i);
                    sb.append((char)i);
                }
            }
        }

        if (mid != 0) {
            sb.insert(sb.length() / 2, mid);
        }
        if (flag == 2) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            System.out.println(sb.toString());
        }
    }

}
