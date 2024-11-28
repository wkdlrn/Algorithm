class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String [] strArr = new String [my_string.length()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = my_string.substring(i, my_string.length());
        }
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals(is_suffix)) {
                answer = 1;
            } 
        }
        return answer;
    }
}