import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String itemName = st.nextToken();
                String category = st.nextToken();
                if (map.containsKey(category)) {
                    map.put(category, map.get(category) + 1);
                } else {
                    map.put(category, 1);
                }
            }
            long ret = 1;
            for(int count : map.values()) {
                ret = ret * (count + 1);
            }
            ret--;
            sb.append(ret).append("\n");
        }
        System.out.println(sb.toString());
    }

}
