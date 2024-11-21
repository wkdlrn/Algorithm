class Solution {
    public int[] solution(int n) {
        int length = 1; // 콜라츠 수열의 길이
        int temp = n; // 계산용 임시 변수
        
        // 첫 번째 반복: 수열의 길이 계산
        while (temp > 1) {
            if (temp % 2 == 0) {
                temp /= 2;
            } else {
                temp = 3 * temp + 1;
            }
            length++;
        }
        
        // 길이에 맞는 배열 생성
        int[] sequence = new int[length];
        sequence[0] = n; // 첫 값 저장
        
        // 두 번째 반복: 실제 수열 저장
        for (int i = 1; i < length; i++) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
            sequence[i] = n;
        }
        
        return sequence; // 결과 배열 반환
    }
}
