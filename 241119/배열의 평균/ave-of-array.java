import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr2d = new int[2][4];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            int sum1 = 0;
            for (int j = 0; j < 4; j++) {
                sum1 += arr2d[i][j];

            }
            System.out.print((double) sum1 / 4 + " ");
        }
        System.out.println();

        for (int j = 0; j < 4; j++) {
            int colSum = 0;
            for (int i = 0; i < 2; i++) {
                colSum += arr2d[i][j];
            }
            System.out.print((double) colSum / 2 + " ");
        }
        System.out.println();

        int totalSum = 0;
        for (int[] ints : arr2d) { //행을 순회
            for (int anInt : ints) { // 각 행의 숫자를 순회
                totalSum += anInt;
            }
        }
        System.out.println((double) totalSum / 8);
    }
}
