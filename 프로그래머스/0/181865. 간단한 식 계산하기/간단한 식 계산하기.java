class Solution {
    public int solution(String binomial) {
        int result = 0;
        if(binomial.contains("+")) {
            String [] answer = binomial.split("\\+");
            result = Integer.parseInt(answer[0].trim()) + Integer.parseInt(answer[1].trim());
        } else if(binomial.contains("-")) {
            String [] answer = binomial.split("-");
            result = Integer.parseInt(answer[0].trim()) - Integer.parseInt(answer[1].trim());
        } else if(binomial.contains("*")) {
            String [] answer = binomial.split("\\*");
            result = Integer.parseInt(answer[0].trim()) * Integer.parseInt(answer[1].trim());
    }
        return result;
}
}