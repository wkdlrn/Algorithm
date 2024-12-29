import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        // 고유 숫자 저장
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (!list.contains(num)) { // 중복 확인
                list.add(num);
                if (list.size() == k) {
                    break; // k개 채우면 종료
                }
            }
        }

        // 결과 배열 생성 및 초기화
        int[] answer = new int[k];
        Arrays.fill(answer, -1); // 초기 값 -1로 채움

        // 고유 숫자를 결과 배열에 복사
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
