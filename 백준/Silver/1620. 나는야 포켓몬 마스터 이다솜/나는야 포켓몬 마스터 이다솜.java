import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Map<String, Integer> nameToNum = new HashMap<>();
        String [] pokemon = new String [n + 1];

        for(int i = 1; i <= n; i++) {
            String input = br.readLine();
            nameToNum.put(input, i);
            pokemon[i] = input;
        }

        for (int i = 0; i < m; i++) {
            String q = br.readLine();
            if(Character.isDigit(q.charAt(0))) {
                int idx = Integer.parseInt(q);
                sb.append(pokemon[idx]).append("\n");
            } else {
                sb.append(nameToNum.get(q)).append("\n");
            }
        }
        System.out.println(sb.toString());


    }

}
