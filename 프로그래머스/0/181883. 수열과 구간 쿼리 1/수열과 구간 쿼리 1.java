class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int []query : queries) {
            int s = query[0];
            int e = query[1];
            for(int i = 0 ; i < arr.length; i++) {
               if(i <= e && i >= s) {
                   arr[i] += 1;
               }
            }
        }
        return arr;
    }
}