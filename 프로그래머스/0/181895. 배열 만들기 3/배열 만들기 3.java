import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        for (int [] interval : intervals) {
            int start = interval [0];
            int end = interval [1];
            
            for (int i = start; i <= end; i++) {
                list.add(arr[i]);
                
            }
            
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}