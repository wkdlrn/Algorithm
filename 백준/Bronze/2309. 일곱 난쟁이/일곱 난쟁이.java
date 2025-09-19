import java.io.*;
import java.util.*;

public class Main {
    public static void solve(int sum,int[] a) {

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[9];
        int sum = 0;

        for(int i = 0; i < 9; i++) {
            a[i] = Integer.parseInt(br.readLine());
            sum += a[i];
        }

        boolean found = false;
        int r1 = 0, r2 = 0;

        for(int i = 0; i < 9 && !found; i++) {
            for(int j = i + 1; j < 9; j++) {
                if(sum - a[i] - a[j] == 100) {
                    r1 = i;
                    r2 = j;
                    found = true;
                    break;
                }
            }
        }
        List<Integer> rets = new ArrayList<>();
        for(int i = 0; i < 9; i++) {
            if(i ==r1 || i == r2) {
                continue;
            }
            rets.add(a[i]);
        }
        Collections.sort(rets);
        for( int ret : rets) {
            System.out.println(ret);
        }
    }

}
