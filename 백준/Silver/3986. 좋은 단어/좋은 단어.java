import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 단어 개수
        int cnt= 0;

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            Deque<Character> dq = new ArrayDeque<>();

            for (char c : s.toCharArray()) {
                if (!dq.isEmpty() && dq.peekFirst() == c) {
                    dq.pollFirst(); // 짝이 맞으면 제거
                } else {
                    dq.addFirst(c); // 아니면 추가
                }
            }

            if (dq.isEmpty()) {
                cnt++; // 스택이 비어있으면 좋은 단어
            }
        }

        System.out.println(cnt);
    }
}
