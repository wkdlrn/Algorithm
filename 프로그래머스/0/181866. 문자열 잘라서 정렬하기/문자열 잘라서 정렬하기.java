import java.util.*;

class Solution {
    public String[] solution(String myString) {
        // "x"로 나눔
        String[] splitStrings = myString.split("x");
        
        // 빈 문자열 제거를 위해 ArrayList 사용
        ArrayList<String> filteredList = new ArrayList<>();
        for (String s : splitStrings) {
            if (!s.isEmpty()) { // 빈 문자열이 아니면 추가
                filteredList.add(s);
            }
        }

        // ArrayList를 배열로 변환
        String[] answer = filteredList.toArray(new String[0]);

        // 배열 정렬
        Arrays.sort(answer);

        return answer;
    }
}
