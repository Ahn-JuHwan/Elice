package JAVA1.OneWeek.SelfStudy.Tuesday.Practice;
import java.util.Scanner;
public class PhysicalExamination {

    public static void main(String args[]) {
        Scanner scanner= new Scanner(System.in);

        //문자열 형태의 name을 입력받음
        String name=scanner.nextLine();

        //정수 형태의 age을 입력받음
        int age= scanner.nextInt();

        //실수 형태의 height을 입력받음
        double height = scanner.nextDouble();


        //실수 형태의 weight을 입력받음
        double weight = scanner.nextDouble();

        //입력받은 정보를 출력
        System.out.println("이름: "+ name+ "님");
        System.out.println("나이: "+ age+"세");
        System.out.println("키: "+ height+"cm");
        System.out.println("몸무게: "+ weight+"kg");

    }
}
