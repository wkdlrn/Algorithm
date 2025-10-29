import java.io.*;
import java.util.*;

public class Main {
    static int N, M, K, ret;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int[][] visited;
    static int[][] a;

    static void DFS(int y, int x) {
        visited[y][x] = 1;
        for(int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if(ny < 0 || nx < 0 || ny >= N || nx >= M) continue;
            if(a[ny][nx] == 1 && visited[ny][nx] == 0) {
                DFS(ny, nx);
            }
        }
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            ret = 0;
            visited = new int[N][M];
            a = new int[N][M];

            for(int i = 0 ; i < K; i++) {
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st2.nextToken());
                int y = Integer.parseInt(st2.nextToken());
                a[x][y] = 1;
            }

            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(a[i][j] == 1 && visited[i][j] == 0) {
                        ret++;
                        DFS(i, j);
                    }
                }
            }
            sb.append(ret).append("\n");
        }

        System.out.println(sb.toString());
    }
}

