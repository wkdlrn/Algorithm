import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine()); // 테스트케이스 개수
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine()); // 의상 수
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String a = st.nextToken(); // 의상 이름 (사용 안함)
                String b = st.nextToken(); // 의상 종류
                map.put(b, map.getOrDefault(b, 0) + 1);
            }

            long ret = 1;
            for (int count : map.values()) {
                ret *= (count + 1); // 해당 종류를 안 입는 경우까지 포함
            }
            ret--; // 전부 안 입는 경우 제외

            sb.append(ret).append("\n");
        }

        System.out.print(sb.toString());
    }
}