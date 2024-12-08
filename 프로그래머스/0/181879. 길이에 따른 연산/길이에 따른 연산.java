class Solution {
    public int solution(int[] num_list) {
        if (num_list.length >= 11) {
            int sum1 = 0;
            for(int i = 0; i <num_list.length; i++) {
                sum1 += num_list[i];
            }
            return sum1;
        } else {
            int sum2 = 1;
            for (int i = 0; i < num_list.length; i++) {
                sum2 = sum2 * num_list[i];
            }
            return sum2;
        }
       
    }
}