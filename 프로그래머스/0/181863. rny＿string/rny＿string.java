class Solution {
    public String solution(String rny_string) {
        String answer = "";
        for (int i = 0; i < rny_string.length(); i = i + 1) {
            if (rny_string.charAt(i) == 'm') {
                answer += 'r';
                answer += 'n';
            } else {
                answer += rny_string.charAt(i);
            }
        }
        return answer;
    }
}