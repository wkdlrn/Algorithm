public class Solution {
    public int solution(String myString, String pat) {
        int count = 0;
        int index = 0;

        // indexOf를 사용하여 겹치는 패턴 탐색
        while ((index = myString.indexOf(pat, index)) != -1) {
            count++; // 패턴 발견 시 카운트 증가
            index++; // 다음 검색 시작 위치로 이동
        }

        return count;
    }
}
