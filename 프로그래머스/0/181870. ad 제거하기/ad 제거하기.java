import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        String str = "ad";
        ArrayList <String> list = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].indexOf(str) == -1) {
                list.add(strArr[i]);
            }
        }
        String [] answer = new String [list.size()];
        for(int i = 0; i <list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}