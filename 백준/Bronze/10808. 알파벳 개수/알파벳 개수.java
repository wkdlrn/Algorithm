import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        String word = br.readLine();
        int [] a = new int[26];
        char[] words = word.toCharArray();
        for(int i = 0; i < words.length; i++){
            a[words[i] - 'a']++;
        }
       for(int i = 0; i < a.length; i++){
           System.out.print(a[i] + " ");
       }

    }


}

