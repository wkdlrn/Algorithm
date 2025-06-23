import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList <String> list = new ArrayList<>();
        
        for (int i = 0; i < picture.length; i++) {
            String row = picture[i];
            String answer = "";
            
            for(int j = 0; j <row.length(); j++) {
                char c = row.charAt(j);
                for(int t = 0 ; t < k; t ++) {
                    answer += c;
                }
            }
            
            for (int s = 0; s < k; s++) {
                list.add(answer);
            }
        }
        
        
        String [] ans = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}