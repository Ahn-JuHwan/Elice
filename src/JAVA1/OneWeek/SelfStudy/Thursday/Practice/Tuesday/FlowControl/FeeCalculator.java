package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Tuesday.FlowControl;
import java.util.Scanner;
public class FeeCalculator {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int age = scan.nextInt(); // 손님에게 나이를 물어봅니다.
        int price =0; // 입장료를 담을 변수

        // 입장료에 따라 price의 값을 다르게 저장하는 if문
        if(age>=0 &&age<=7){
            price=0;

        }
        else if(age>=8 && age<=13){
            price = 5000;
        }
        else if(age>=14 && age<=19){
            price = 10000;
        }
        else if(age>=20){
            price = 20000;
        }
        System.out.println("고객님, 입장료는 " + price + "원이 되겠습니다.");
    }
}
