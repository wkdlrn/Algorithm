class Solution {
    public int[] solution(int l, int r) {
       int [] temp = new int [r-l+1];
        int count = 0;
        
        for(int i = l; i <= r; i++) {
            if (isValid(i)) {
                temp[count] = i;
                count ++;
            }
        }
        
        if (count == 0) {
            return new int[]{-1};
        }
        
        int [] answer = new int [count];
        for (int i = 0; i < count; i++) {
            answer[i] = temp[i];
        }
        return answer;
        
    }
    private boolean isValid(int num) {
            String str = String.valueOf(num);
            for(char c : str.toCharArray()) {
                if(c != '0' && c != '5') {
                    return false;
                }
            }
            return true;
        }
}