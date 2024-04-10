package JAVA1.OneWeek.TEST.oneWeek;
import java.util.*;
public class Sum_DiagonalLines {

    //어진 2차원 배열에서 주 대각선의 합(leftToRightDiagonalSum)과
    // 부 대각선의 합(rightToLeftDiagonalSum)을 계산
    public static void solution(int[][] matrix) {
        int leftToRightDiagonalSum = 0;
        int rightToLeftDiagonalSum = 0;
        int n = matrix.length;

        //반복문을 통해 배열의 각 행과 열에 대한 주 대각선과 부 대각선의 원소를 더함
        for (int i = 0; i < n; i++) {
            leftToRightDiagonalSum += matrix[i][i];
            rightToLeftDiagonalSum += matrix[i][n - 1 - i];
        }

        //두 대각선의 합 중 큰 값을 maxSum 변수에 저장
        int maxSum;
        if (leftToRightDiagonalSum > rightToLeftDiagonalSum) {
            maxSum = leftToRightDiagonalSum;
        } else {
            maxSum = rightToLeftDiagonalSum;
        }

        System.out.println(maxSum);
    }



    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        //사용자로부터 정사각형 모양의 2차원 배열의 크기 n을 입력 받음
        int n = scanner.nextInt();

        //배열의 원소를 입력 받아 2차원 배열 matrix를 생성
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        solution(matrix);
    }

}
