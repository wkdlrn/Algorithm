class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int q = 0; q < queries.length; q++) {
            int s = queries[q][0];
            int e = queries[q][1];
            int k = queries[q][2];
            
            int min = Integer.MAX_VALUE;
                
            for(int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < min) {
                    min = arr[i];
                }
            }
            if (min == Integer.MAX_VALUE) {
                answer[q] = -1;
            } else {
                answer[q] = min;
            }
        }
        return answer;
    }
}