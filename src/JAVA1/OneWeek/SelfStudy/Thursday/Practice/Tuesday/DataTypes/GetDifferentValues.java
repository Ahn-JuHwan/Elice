package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Tuesday.DataTypes;

import java.util.Scanner;
public class GetDifferentValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("당신의 이름은?");
        // 지시사항 2번을 참고하여 코드를 작성하세요.
        String name = scanner.nextLine();

        System.out.println("행운의 숫자를 입력하세요? ");
        // 지시사항 3번을 참고하여 코드를 작성하세요.
        int luckyNumber = scanner.nextInt();

        System.out.println("받고 싶은 학점을 입력하세요? ");
        // 지시사항 4번을 참고하여 코드를 작성하세요.
        double grade = scanner.nextDouble();

        System.out.println("이름: " + name);
        System.out.println("행운의 숫자: " + luckyNumber);
        System.out.println("학점: " + grade);

        // 지시사항 5번을 참고하여 코드를 작성하세요.
        scanner.close();
    }
}
