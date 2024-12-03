import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        List<Integer> list = new ArrayList<>();
        for (int num : num_list) {
            list.add(num);
        }
        int answer = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) < 0) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
        
    }
}