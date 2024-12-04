import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int [] num_list1 = Arrays.copyOfRange(num_list, n, num_list.length);
        int [] num_list2 = Arrays.copyOfRange(num_list, 0, n);
        int [] answer = new int [num_list1.length + num_list2.length];
        System.arraycopy(num_list1, 0, answer,0,num_list1.length);
        System.arraycopy(num_list2, 0, answer, num_list1.length, num_list2.length);
        return answer;
    }
}