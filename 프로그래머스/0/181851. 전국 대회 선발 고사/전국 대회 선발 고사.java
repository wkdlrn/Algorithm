import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // 참석 배열이 true인 것 중에서 rank가 높은 순서대로 뽑기
        ArrayList <Integer> list = new ArrayList<>();
        
        
        for(int i = 0; i < attendance.length; i++) {
            if (attendance[i] == true) {
                list.add(rank[i]);
            }
        }
        int [] newList = new int [list.size()];
        for (int i = 0; i < list.size(); i++) {
            newList[i] = list.get(i);
        }
        Arrays.sort(newList);
        
        // 상위 3명 순위값
        int [] answer = new int [3];
        for (int i = 0; i< 3; i++) {
            answer[i] = newList[i];
        }
        
        ArrayList<Integer> indexList = new ArrayList<>();
        for (int j = 0; j < 3; j++) {
    for (int i = 0; i < rank.length; i++) {
        if (attendance[i] == true && rank[i] == answer[j]) {
            indexList.add(i);
            break;
        }
    }
}
        int a = indexList.get(0);
        int b = indexList.get(1);
        int c = indexList.get(2);
        return 10000 * a+ 100 * b + c;
    }
}