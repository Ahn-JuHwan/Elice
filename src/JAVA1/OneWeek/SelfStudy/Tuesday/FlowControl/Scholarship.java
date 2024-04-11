package JAVA1.OneWeek.SelfStudy.Tuesday.FlowControl;
import java.util.Scanner;

public class Scholarship {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();//성적을 입력받는 변수 grade

        // grade가 70 이상이면 “합격입니다."출력
        if (grade>=70){
            System.out.println("합격입니다.");
            // 변수 grade가 90 이상이면 “장학금도 받을 수 있습니다.”출력
            if(grade>=90){
                System.out.println("장학금도 받을 수 있습니다.");
            }
        }
        //모두 충족 안하면 불합격
        else{
            System.out.println("불합격입니다.");
        }


    }

}
