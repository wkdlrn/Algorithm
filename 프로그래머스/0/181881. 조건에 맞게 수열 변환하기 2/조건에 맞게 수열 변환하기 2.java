import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        int cnt = 0;

        while (true) {
            
            for(int i=0; i<arr.length; i++){
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i] /= 2;
                }else if(arr[i]<50 && arr[i]%2!=0){
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            
            if (Arrays.equals(arr, answer)) {
                break;
            }
            answer = Arrays.copyOf(arr, arr.length);
            
            cnt++;
        }
        return cnt;
    }
}