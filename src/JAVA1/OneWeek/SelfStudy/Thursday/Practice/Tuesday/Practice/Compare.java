package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Tuesday.Practice;

import java.util.Scanner;
public class Compare {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // 두 정수 A와 B를 입력 받음
        int A = scanner.nextInt();
        int B = scanner.nextInt();


        // 두 수를 비교하는 코드를 작성
        if (A > B) {
            System.out.println("A가 더 큽니다.");
        } else if (A < B) {
            System.out.println("B가 더 큽니다.");

        } else {
            System.out.println("크기가 같습니다.");
        }
    }
}

