class Solution {
    public int[] solution(int[] arr) {
        // stk 배열의 최대 크기는 arr와 동일
        int[] stk = new int[arr.length];
        int size = 0; // stk 배열의 유효한 요소 개수를 나타내는 변수

        for (int i = 0; i < arr.length; i++) {
            // 조건에 따라 처리
            while (size > 0 && stk[size - 1] >= arr[i]) {
                size--; // 마지막 요소를 제거 (유효 요소 크기 감소)
            }
            stk[size] = arr[i]; // 새로운 원소 추가
            size++; // 유효 요소 크기 증가
        }

        // 유효한 요소만 포함하는 결과 배열 생성
        int[] newStk = new int [size];
        for(int i = 0 ; i< size; i++) {
            newStk[i] = stk[i];
        }
        return newStk;
    }
}
