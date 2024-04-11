package JAVA1.TwoWeek.Test;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class Weather {
    public static void main(String args[]) {
        // 채점을 위한 코드이므로 수정하지 말아주세요.
        String inputDate = getUserInput();
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(inputDate);
        System.out.println(getDayOfWeek(date));
        System.out.println(isLeapYear(date) ? "Yes" : "No");
    }
    // 여기에 코드를 작성해주세요.

    public static String getUserInput(){
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public static String getDayOfWeek(LocalDate date){
        DayOfWeek dayofWeek = date.getDayOfWeek();
        return dayofWeek.toString();
    }

    public static boolean isLeapYear(LocalDate date){
        return date.isLeapYear();
    }



}
