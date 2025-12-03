import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String input = br.readLine();
       int[] a = new int [26];

       for(int i = 0; i < input.length(); i++) {
           a[input.charAt(i) - 'a']++;
       }
       for(int ret : a) {
           System.out.print(ret + " ");
       }
    }
}

