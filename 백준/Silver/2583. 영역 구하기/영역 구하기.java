import java.io.*;
import java.util.*;

public class Main {
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};
    static int n, m, k;
    static int[][] visited;
    static int[][] a;

    static int DFS (int y, int x) {
        visited[y][x] = 1;

        int ret = 1; // 현재 칸 포함
        for(int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];

            if(ny < 0 || nx < 0 || ny >= m || nx >= n) continue;
            if(visited[ny][nx] == 1) continue;
            if(a[ny][nx] == 1) continue;

            ret += DFS(ny, nx);
        }
        return ret;
    }


    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        visited = new int[m][n];
        a = new int[m][n];

        while (k-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int i = y1; i < y2; i++) {
                for(int j = x1; j < x2; j++) {
                    a[i][j] = 1;
                }
            }
        }

        List<Integer> rets = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(a[i][j] != 1 && visited[i][j] == 0) {
                    rets.add(DFS(i,j));
                }
            }
        }

        Collections.sort(rets); // 리스트를 정렬
        System.out.println(rets.size());
        
        StringBuilder sb = new StringBuilder();
        for(int ret : rets) sb.append(ret).append(" ");
        System.out.println(sb.toString().trim()); // trim()으로 맨 끝 공백 제거


    }
}

