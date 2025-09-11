import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String [] parts = s.split("\\*");
        String start = parts[0];
        String end = parts[1];

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            String input = br.readLine();

            if(input.length() < start.length() + end.length()) {
                sb.append("NE\n");
                continue;
            }

            if(input.startsWith(start) && input.endsWith(end)) {
                sb.append("DA\n");
            } else {
                sb.append("NE\n");
            }
        }
        System.out.println(sb.toString());
    }
}





