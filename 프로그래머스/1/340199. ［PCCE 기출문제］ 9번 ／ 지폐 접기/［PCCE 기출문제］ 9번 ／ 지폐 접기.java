class Solution {
    public int solution(int[] wallet, int[] bill) {
        int walletX = wallet[0];
        int walletY = wallet[1];
        int billX = bill[0];
        int billY = bill[1];
        int answer = 0;
        while(Math.min(billX, billY) > Math.min(walletX,walletY) || Math.max(billX, billY) > Math.max(walletX, walletY)) {
            if(billX > billY) {
                billX = billX / 2;
            } else if(billX < billY){
                billY = billY / 2;
            } else {
                billX = billX/ 2;
            }
            answer= answer + 1;
        }
        return answer;
    }
}