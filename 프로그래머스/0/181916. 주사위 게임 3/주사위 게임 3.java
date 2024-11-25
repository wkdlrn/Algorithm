import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] nums = {a, b, c, d};
        int[] dice = new int[7]; // 주사위 숫자 카운트 배열
        Arrays.sort(nums); // 주사위 값 정렬

        // 숫자 등장 횟수 기록
        for (int num : nums) {
            dice[num]++;
        }

        // 규칙별 처리
        for (int i = 1; i <= 6; i++) {
            if (dice[i] == 4) {
                // 네 주사위 숫자가 모두 같은 경우
                answer = i * 1111;
                return answer;
            } else if (dice[i] == 3) {
                // 세 주사위 숫자가 같고, 하나가 다른 경우
                for (int j = 1; j <= 6; j++) {
                    if (dice[j] == 1) {
                        answer = (10 * i + j) * (10 * i + j);
                        return answer;
                    }
                }
            } else if (dice[i] == 2) {
                // 두 쌍의 주사위 숫자가 같거나, 하나만 같은 경우
                for (int j = 1; j <= 6; j++) {
                    if (dice[j] == 2 && i != j) {
                        // 두 쌍의 숫자가 같은 경우
                        answer = (i + j) * (j - i); 
                        return answer;
                    } else if (dice[j] == 1) {
                        // 두 개가 같고, 나머지 두 개가 서로 다른 경우
                        int multi = 1;
                        for (int k = 1; k <= 6; k++) {
                            if (dice[k] == 1) {
                                multi *= k; // 곱셈 계산
                            }
                        }
                        answer = multi;
                        return answer;
                    }
                }
            }
        }

        // 모든 숫자가 서로 다른 경우
        answer = nums[0];
        return answer;
    }
}
