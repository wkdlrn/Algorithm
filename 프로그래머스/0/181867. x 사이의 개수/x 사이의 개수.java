import java.util.*;
class Solution {
    public int[] solution(String myString) {
        ArrayList <Integer> list = new ArrayList<>();
        int index = 0;
        for(int i = 0 ; i < myString.length(); i++) {
                if(myString.charAt(i) == 'x') {
                    list.add(index);
                    index = 0;
                    
                } else  {
                    index++;
                }
            }
             list.add(index);
        int [] answer = new int [list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
        }
    }
