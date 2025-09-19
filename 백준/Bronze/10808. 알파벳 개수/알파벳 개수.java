import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int[] arr = new int [26];
        for(int i = 0; i < input.length(); i++) {
            arr[input.charAt(i) - 'a']++;
        }
        for(int ret : arr) {
            System.out.print(ret + " ");
        }
    }

}
