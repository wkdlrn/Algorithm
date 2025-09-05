class Solution {
    public int[][] solution(int n) {
        int [][] answer = new int[n][n];
        
        // 방향: 오른쪽, 아래, 왼쪽, 위
        int[] dx = {0, 1, 0 ,-1};
        int[] dy = {1, 0, -1, 0};
        int dir = 0; //방향 인덱스
        
        int x = 0, y =0; // 시작 좌표
        int num = 1; // 채워 넣을 숫자
        
        while (num <= n * n) {
            answer[x][y] = num++;
            
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if(nx < 0 || nx >= n || ny < 0 || ny >=n || answer[nx][ny] != 0) {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            x = nx;
            y = ny;
        }
        return answer;
    }
}