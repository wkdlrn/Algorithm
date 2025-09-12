import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 포켓몬 개수
        int m = Integer.parseInt(st.nextToken()); // 문제 개수

        Map<String, Integer> map = new HashMap<>();
        String[] pokemon = new String[n + 1];

        for(int i = 1; i <= n; i++) {
            String input = br.readLine();
            map.put(input,i);
            pokemon[i] = input;
        }

        for (int i = 0; i < m; i++) {
            String q = br.readLine();
            if(q.matches("[0-9]+")) {
                int idx = Integer.parseInt(q);
                sb.append(pokemon[idx]).append("\n");
            } else {
                sb.append(map.get(q)).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
