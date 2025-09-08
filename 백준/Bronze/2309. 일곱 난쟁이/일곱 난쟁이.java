import java.io.*;
import java.util.*;

public class Main {
    static int n = 9;
    static int k = 7;
    static int[] a;
    static boolean found = false; // 해답 찾으면 더 이상 탐색 중단

    // 조합 + 합계 추적
    static void combi(int start, List<Integer> pick, int sum) {
        if (found) return;                 // 이미 찾았으면 중단
        if (pick.size() == k) {            // 7개를 다 골랐을 때만 검사
            if (sum == 100) {
                // 선택된 값만 모아 정렬 후 출력
                List<Integer> vals = new ArrayList<>();
                for (int idx : pick) vals.add(a[idx]);
                Collections.sort(vals);
                for (int v : vals) System.out.println(v);
                found = true;
            }
            return;
        }

        // 가지치기(옵션): 합이 이미 100 초과면 더 볼 필요 없음
        if (sum > 100) return;

        for (int i = start + 1; i < n; i++) {
            pick.add(i);                   // i 선택
            combi(i, pick, sum + a[i]);    // ▶ 선택할 때 합계를 더함
            pick.remove(pick.size() - 1);  // ◀ 되돌릴 때 선택을 제거
        }
    }

    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(br.readLine());

        combi(-1, new ArrayList<>(), 0);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}