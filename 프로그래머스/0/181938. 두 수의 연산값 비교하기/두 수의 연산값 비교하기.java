class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = Integer.toString(a) + Integer.toString(b);
        int abNum = Integer.parseInt(ab);
        int multiply = 2 * a * b;
      
        return (abNum >= multiply ? abNum : multiply);
       
    }
}