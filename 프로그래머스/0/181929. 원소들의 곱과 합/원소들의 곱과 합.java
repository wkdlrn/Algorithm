class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum =0;
        int prod = 1;
        for (int i = 0 ; i <= num_list.length - 1; i++) {
            sum += num_list[i];
            prod *= num_list[i];
        }
        if (prod < (sum * sum)) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}