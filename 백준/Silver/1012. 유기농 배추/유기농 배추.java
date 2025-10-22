import java.io.*;
import java.util.*;

public class Main {
    static int T, N, M, K, ret;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int[][] visited;
    static int[][] a;

    static void DFS(int sy, int sx) {
        visited[sy][sx] = 1;
        for(int i = 0; i < 4; i++) {
            int ny = sy + dy[i];
            int nx = sx + dx[i];
            if(ny < 0 || nx < 0 || nx >= M || ny >= N) continue;
            if(a[ny][nx] == 1 && visited[ny][nx] == 0) {
                DFS(ny, nx);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        T = Integer.parseInt(input);

        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            a = new int [N][M]; // 모든 값이 자동으로 0으로 초기화
            visited = new int[N][M];
            ret = 0;

            for(int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                a[y][x] = 1;

            }
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < M; k++) {
                    if(a[j][k] == 1 && visited[j][k] == 0) {
                        ret++;
                        DFS(j,k);
                    }
                }
            }

            sb.append(ret).append("\n");
        }

        System.out.println(sb.toString());

    }
}

