class Solution {
    public int solution(int[] num_list) {
        String oddStr = "";
        String evenStr = "";

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 1) {
                // 홀수인 경우
                oddStr += Integer.toString(num_list[i]);
            } else {
                // 짝수인 경우
                evenStr += Integer.toString(num_list[i]);
            }
        }

        int oddNumber = Integer.parseInt(oddStr);
        int evenNumber = Integer.parseInt(evenStr);
        return oddNumber + evenNumber;
    }
}
