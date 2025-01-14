import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int targetLength = 1;

        // 현재 길이보다 크거나 같은 가장 작은 2의 거듭제곱 찾기
        while (targetLength < length) {
            targetLength *= 2;
        }

        // 배열의 크기를 2의 거듭제곱으로 늘리고, 부족한 부분은 0으로 채움
        return Arrays.copyOf(arr, targetLength);
    }
}
