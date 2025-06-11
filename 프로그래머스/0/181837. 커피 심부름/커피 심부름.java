class Solution {
    public int solution(String[] order) {
        int sum = 0;
        for (String menu : order) {
            if (menu.equals("iceamericano") || menu.equals("americanoice") ||
                menu.equals("hotamericano") || menu.equals("americanohot") ||
                menu.equals("americano") || menu.equals("anything")) {
                sum += 4500;
            } else {
                sum += 5000;
            }
        }
        return sum;
    }
}
