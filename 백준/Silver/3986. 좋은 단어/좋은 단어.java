import java.io.*;
import java.util.ArrayDeque;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            String input = br.readLine();

            ArrayDeque<Character> dq = new ArrayDeque<>();
            for(char c : input.toCharArray()) {

                if(!dq.isEmpty() && c == dq.peekFirst()) {
                    dq.pollFirst();
                } else {
                    dq.addFirst(c);
                }
            }
            if(dq.isEmpty()) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

