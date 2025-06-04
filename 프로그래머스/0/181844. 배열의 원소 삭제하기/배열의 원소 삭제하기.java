import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int index = 0;
        ArrayList<Integer> indexList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            boolean toDelete = false;
            for(int j = 0 ; j < delete_list.length; j++) {
                if(arr[i] ==delete_list[j]) {
                    toDelete = true;
                    break;
                }
            }
            if(!toDelete) {
                indexList.add(arr[i]);
            }
        }
//         ArrayList<Integer> answer = new ArrayList<>();
//         for(int i = 0 ; i < arr.length; i++) {
//             answer.add(arr[i]);
//         }
        
//         for(int i = 0; i < answer.size(); i++) {
//             if(answer.get(i) == indexList.get(i)) {
//                 answer.remove(i);
//             }
//         }
        
        int [] ans = new int [indexList.size()];
        for(int i =0 ; i< indexList.size(); i++) {
            ans[i] = indexList.get(i);
        }
        return ans;
    }
}