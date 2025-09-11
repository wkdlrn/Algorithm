import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N1 = Integer.parseInt(st1.nextToken());
        int N2 = Integer.parseInt(st1.nextToken());
        int[] inputs = new int [N1 + 1];
        int[] psum = new int [N1 + 1];

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N1; i++) {
            inputs[i] = Integer.parseInt(st2.nextToken());
            psum[i] = psum[i - 1] + inputs[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i = N2; i <= N1; i++) {
            int sum = psum[i] - psum[i - N2];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}





