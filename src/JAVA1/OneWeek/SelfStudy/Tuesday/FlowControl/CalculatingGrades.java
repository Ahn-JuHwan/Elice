package JAVA1.OneWeek.SelfStudy.Tuesday.FlowControl;

import java.util.Scanner;

public class CalculatingGrades {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int grade = input.nextInt();
        //변수 grade가 90 이상 -> A
        if(grade>=90){
            System.out.println("학점은 A입니다.");
        }
        //변수 grade가 80 이상 -> B

        else if(grade>=80 && grade<90){
            System.out.println("학점은 B입니다.");
        }
        //변수 grade가 70 이상 -> C
        else if(grade>=70 && grade<80){
            System.out.println("학점은 C입니다.");
        }
        //변수 grade가 60이상 -> D
        else if(grade>=60 && grade<70){
            System.out.println("학점은 D입니다.");
        }
        //나머지 -> F
        else {
            System.out.println("학점은 F입니다.");
        }
    }
}
