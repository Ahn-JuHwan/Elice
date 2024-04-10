package JAVA1.OneWeek.Lecture.MonDay_JAVA;
import java.util.Scanner;

public class TypeChange {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        //문자열 입력
        String str = input.nextLine();
        //정수 입력
        int num = input.nextInt();

        // 문자열 str에 저장된 숫자를 정수 타입으로 변환
        System.out.println(num +  Integer.parseInt(str));

    }
}
