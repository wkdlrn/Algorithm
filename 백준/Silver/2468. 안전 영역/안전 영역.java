import java.io.*;
import java.util.*;

public class Main {
    static int N, ret;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int[][] visited;
    static int[][] a;

    static void DFS(int y, int x, int d) {
        visited[y][x] = 1;
        for(int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if(ny < 0 || nx < 0 || ny >= N || nx >= N) continue;
            if(a[ny][nx] > d && visited[ny][nx] == 0) {
                DFS(ny, nx, d);
            }
        }
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        a = new int[N][N];
        ret = 0; // 비가 전혀 안 올 때
        int maxH = 0; // 지도 최대 높이

        // 지도 만들기
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0 ; j < N; j++) {
                a[i][j] = Integer.parseInt(st.nextToken());
                if (a[i][j] > maxH) maxH = a[i][j];
            }
        }

        for(int d = 0; d <= maxH; d++) {
            visited = new int[N][N];
            int cnt = 0;
            for(int i = 0; i < N ; i++) {
                for(int j = 0; j < N; j++) {
                    if(a[i][j] > d && visited[i][j] == 0) {
                        DFS(i, j, d);
                        cnt++;
                    }
                }
            }
            ret = Math.max(ret, cnt);

        }

        System.out.println(ret);

    }
}

