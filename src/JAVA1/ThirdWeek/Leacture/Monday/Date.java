package JAVA1.ThirdWeek.Leacture.Monday;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import java.time.Period;
public class Date {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        //사용자로부터 특정 날짜의 연도, 월, 일을 입력받음
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        //사용자로부터 입력받은 연도, 월, 일을 calculateDateDifference() 메서드의 매개변수로 전달
        int[] dateDifference = calculateDateDifference(year, month, day);

        System.out.println(String.format("차이 결과는 %d 개월 혹은 %d 일", dateDifference[0], dateDifference[1]));

    }

    public static int[] calculateDateDifference(int year, int month, int day) {

        //LocalDate 객체를 생성
        LocalDate targetDate = LocalDate.of(year, month, day);
        //LocalDate.now() 메서드를 사용하여 오늘 날짜를 나타내는 LocalDate 객체를 생성
        LocalDate today = LocalDate.now();

        //계산된 개월 수와 일 수 차이를 계산하여 int 형 배열에 담아 반환
        int diffYear = today.getYear() - targetDate.getYear();
        int diffMonth = today.getMonthValue() - targetDate.getMonthValue();
        int diffDay = today.getDayOfMonth() - targetDate.getDayOfMonth ();

        int totalMonth = diffYear * 12 + diffMonth;
        int totalDay = totalMonth * 30 + diffDay;

        //출력
        return new int[]{totalMonth, totalDay};

    }
}
