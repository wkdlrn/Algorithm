import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int result = 0;
                    result += nums[i] + nums[j] + nums[k];
                    if (isPrime(result)) {
                        answer = answer + 1;
                    }
                }
            }
        }
        return answer;
    }
    
    public boolean isPrime(int n) {
        boolean check = true;
        if(n == 2) {
            return check;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}