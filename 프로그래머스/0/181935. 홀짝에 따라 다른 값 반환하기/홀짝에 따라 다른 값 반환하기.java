class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        if (n % 2 == 1) {
            for (int i = n; i >= 1; i-=2) {
                sum += i;
            }
        } else {
            for (int i = n; i>= 2; i -= 2) {
                sum = sum + i * i;
            }
        }
        answer = sum;
        
        
            return answer;
    }
}