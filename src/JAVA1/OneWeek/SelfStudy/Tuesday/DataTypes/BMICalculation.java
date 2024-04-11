package JAVA1.OneWeek.SelfStudy.Tuesday.DataTypes;

import java.util.Scanner;
public class BMICalculation {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        // 키 입력 ex) 170cm == 1.7
        System.out.println("키를 입력하세요");
        double height = scanner.nextDouble();

        //몸무게 입력
        System.out.println("몸무게를 입력하세요");
        double weight = scanner.nextDouble();
        int BMI; //BMI를 저장할 변수

        // 지시사항 1번을 참고하여 코드를 작성하세요.
        BMI= (int)(weight / (height*height));
        // 지시사항 2번을 참고하여 코드를 작성하세요.
        System.out.print(BMI);
    }
}
