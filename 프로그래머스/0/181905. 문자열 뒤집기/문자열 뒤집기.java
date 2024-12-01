class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String revStr = "";
        for (int i = e; i >= s; i--) {
            answer += my_string.substring(i,i+1);
        }
        revStr = my_string.replace(my_string.substring(s, e + 1),answer);
        return revStr;
    }
}