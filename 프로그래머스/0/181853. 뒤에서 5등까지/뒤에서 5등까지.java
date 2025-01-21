import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        ArrayList <Integer> list = new ArrayList<>();
        int min = num_list[0];
        for (int i = 1; i < num_list.length; i++) {
            if (num_list[i] < min) {
                min = num_list[i];
            }
        }
        Arrays.sort(num_list);
        for(int i = 0; i < 5; i++) {
            list.add(num_list[i]);
        }
        int [] answer = new int [list.size()];
        for(int i = 0 ; i <list.size(); i++) {
            answer[i] = list.get(i);
        }
            
        return answer;
    }
}