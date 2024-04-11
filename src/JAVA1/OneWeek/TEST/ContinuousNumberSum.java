package JAVA1.OneWeek.TEST;

import java.util.Scanner;
public class ContinuousNumberSum {

    //정수 N에 대해 연속된 수의 합으로 N을 만들 수 있는 경우의 수를 계산
    public static void solution(int N) {
        int count = 0;

        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = i; j <= N; j++) {
                sum += j;
                //합이 N과 일치하면 경우의 수를 증가시키고 내부 루프를 종료
                if (sum == N) {
                    count++;
                    break;
                }
                //만약 합이 N보다 크면 내부 루프를 종료
                if (sum > N) break;
            }
        }

        System.out.println(count);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solution(n);
    }
}
