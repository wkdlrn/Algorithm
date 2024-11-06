class Solution {
    public int solution(int a, int b) {
        
        
        String ab = Integer.toString(a) + Integer.toString(b);
        String ba = Integer.toString(b) + Integer.toString(a);

        int abNum = Integer.parseInt(ab);
        int baNum = Integer.parseInt(ba);
        
        int answer = (abNum >= baNum) ? abNum : baNum;
        return answer;
    }
}