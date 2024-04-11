package JAVA1.OneWeek.SelfStudy.Tuesday.Practice;

import java.io.*;
import java.util.Scanner;
public class IsolationAndWelfare {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        // 총 동전 + 지폐 수 입력
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        // 복리 공식
        double finalAmount = m*(Math.pow((1+(double)n/100),k));
        // 결과 출력
        System.out.println((int) Math.round(finalAmount)); // 소수점 이하는 버리고 반올림
    }
}
