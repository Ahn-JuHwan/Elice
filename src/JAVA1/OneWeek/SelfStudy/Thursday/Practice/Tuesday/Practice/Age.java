package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Tuesday.Practice;

import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        // Scanner 객체를 생성하여 사용자 입력을 받을 준비를 합니다.
        Scanner scanner = new Scanner(System.in);

        // Scanner 객체를 사용하여 사용자로부터 태어난 연도를 정수로 입력받음
        int year = scanner.nextInt();

        // currentYear 라는 이름의 int 형 변수를 선언하고, 올해의 년도를 할당
        int currentYear = 2024;

        // currentYear 에서 사용자의 태어난 연도를 빼서 나이를 나타내는 myAge 변수를 선언하고 결과를 할당
        int myAge;
        myAge=currentYear-year;

        System.out.println("올해 당신의 나이는 " + myAge + "살 입니다.");
    }
}
