import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // 2가 있는 인덱스를 저장
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                list.add(i);
            }
        }
        
        // 2가 없는 경우
        if (list.isEmpty()) {
            return new int[] {-1};
        }
        
        // 결과 배열의 크기 계산
        int start = list.get(0);
        int end = list.get(list.size() - 1);
        int[] answer = new int[end - start + 1];
        
        // 결과 배열에 값 복사
        for (int i = start; i <= end; i++) {
            answer[i - start] = arr[i];
        }
        
        return answer;
    }
}
