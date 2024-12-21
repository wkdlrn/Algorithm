import java.util.*;


public class Solution {
    public String[] solution(String myStr) {
        // 문자열을 "a", "b", "c" 기준으로 나누기
        String[] parts = myStr.split("[abc]"); // 정규식으로 분리
        
        // 빈 문자열 제외
        ArrayList<String> filtered = new ArrayList<>();
        for (String part : parts) {
            if (!part.isEmpty()) { // 빈 문자열은 제외
                filtered.add(part);
            }
        }
        
        // 3. 결과 배열 처리
        if (filtered.isEmpty()) {
            return new String[] {"EMPTY"};
        }
        
        return filtered.toArray(new String[0]); // List를 배열로 변환
    }

}
