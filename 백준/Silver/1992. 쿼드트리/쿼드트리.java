import java.io.*;
import java.util.*;

public class Main {

    static int n;
    static char[][] a;

    static String quard(int y, int x, int size) {
        if(size == 1) {
            return String.valueOf(a[y][x]);
        }

        char b = a[y][x];
        String ret = "";

        // 영역 전체를 검사
        for(int i = y; i < y + size; i++) {
            for(int j = x; j < x + size; j++) {
                if(b != a[i][j]) { // 다른 값이 하나라도 있으면 4개 영역으로 분할하는 코드
                    ret += '(';
                    ret += quard(y, x, size / 2);
                    ret += quard(y, x + size / 2, size / 2);
                    ret += quard(y + size / 2, x, size / 2);
                    ret += quard(y + size / 2, x + size / 2, size / 2);
                    ret += ')';
                    return ret;
                }
            }
        }
        // 전부 같은 값이라면 한 글자만 반환
        return String.valueOf(a[y][x]);
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        a = new char[n][n];

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            for(int j = 0; j < n; j++) {
                a[i][j] = s.charAt(j);
            }
        }
        System.out.println(quard(0,0,n));
    }
}

