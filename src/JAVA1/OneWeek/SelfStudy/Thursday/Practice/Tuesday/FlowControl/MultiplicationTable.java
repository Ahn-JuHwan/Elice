package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Tuesday.FlowControl;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(); //출력할 구구단의 숫자를 입력할 변수


        //n에 해당하는 구구단을 출력하는 for문
        for (int i=1; i<10; i++){
            System.out.println(i*n);

        }




    }
}
