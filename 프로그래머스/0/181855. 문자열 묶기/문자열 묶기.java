class Solution {
    public int solution(String[] strArr) {
        int [] counts = new int [31];
       // 문자열 길이별 개수 카운트
        for (String s : strArr) {
            int length = s.length();
            counts[length]++;
        }
        // 가장 큰 그룹의 크기 찾기
        int max = 0;
        for (int count : counts) {
            if (count  > max) {
                max = count; 
            }
        }
        return max;
    }
}