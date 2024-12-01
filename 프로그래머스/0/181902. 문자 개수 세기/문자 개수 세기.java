class Solution {
    public int[] solution(String my_string) {
        
        int [] answer = new int [52];
        int index = 0;
        for(int i = 0 ; i < my_string.length(); i++) {
            if(my_string.charAt(i) >= 'a' && my_string.charAt(i) <='z') {
                index = my_string.charAt(i) - 'a' + 26;
                answer[index]++;
            } else {
                index = my_string.charAt(i) - 'A';
                answer[index]++;
            }
            
        }
        return answer;
    }
}