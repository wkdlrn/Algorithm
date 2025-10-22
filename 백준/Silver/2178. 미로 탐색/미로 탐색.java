import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int[][] visited;
    static int[][] a;

    static void bfs(int sy, int sx) {
        ArrayDeque<int[]> q = new ArrayDeque<>();
        visited[sy][sx] = 1;
        q.add(new int[]{sy, sx});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int y = cur[0];
            int x = cur[1];

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if (ny < 0 || nx < 0 || ny >= n || nx >= m) continue;
                if (a[ny][nx] == 0) continue;
                if (visited[ny][nx] != 0) continue;

                visited[ny][nx] = visited[y][x] + 1;
                q.add(new int[]{ny, nx});
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        a = new int[n][m];
        visited = new int[n][m];

        for (int i = 0; i < n; i++) {
            String input = br.readLine().trim();
            for (int j = 0; j < m; j++) {
                a[i][j] = input.charAt(j) - '0';
            }
        }

        bfs(0, 0);
        System.out.println(visited[n - 1][m - 1]);
    }
}

