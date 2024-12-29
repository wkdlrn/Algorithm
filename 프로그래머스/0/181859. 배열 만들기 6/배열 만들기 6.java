import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> stkList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(stkList.isEmpty()) {
                stkList.add(arr[i]);
            } else {
                if(stkList.get(stkList.size() -1) == (arr[i])) {
                    stkList.remove(stkList.size()-1);
                } else {
                    stkList.add(arr[i]);
                }
            }
        }
        if (stkList.isEmpty()) {
            return new int [] {-1};
        }
        int [] answer = new int [stkList.size()];
        for(int i = 0; i < stkList.size(); i++) {
            answer[i] = stkList.get(i);
        }
        
        return answer;
    }
}