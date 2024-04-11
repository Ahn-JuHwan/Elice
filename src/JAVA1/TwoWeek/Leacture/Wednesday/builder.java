package JAVA1.TwoWeek.Leacture.Wednesday;
import java.util.Scanner;
import java.lang.*;

public class builder {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        convertString(s);
    }

    //함수 convertString -> 문자열 s를 입력 받음
    public static void convertString(String s) {
        // 여기에 코드를 작성하세요.
        //문자열 s의 모든 소문자를 대문자
        s=s.toUpperCase();
        //문자열의 처음과 끝에는 “#”을 추가
        System.out.println( "#"+ s +"#");



    }
}
