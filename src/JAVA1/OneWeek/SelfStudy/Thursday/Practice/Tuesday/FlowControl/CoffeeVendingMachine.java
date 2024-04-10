package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Tuesday.FlowControl;

import java.util.Scanner;
public class CoffeeVendingMachine {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("메뉴 번호를 입력해 주세요.");
        int n = scan.nextInt(); //메뉴 번호를 입력 받습니다.

        //  번호를 입력하면 “(메뉴 이름)를 선택하셨습니다.” 문장을 출력
        switch(n) {
            case 1:
                System.out.println("아메리카노를 선택하셨습니다.");
                break;
            case 2:
                System.out.println("카페라떼를 선택하셨습니다.");
                break;
            case 3:
                System.out.println("카푸치노를 선택하셨습니다.");
                break;
            case 4:
                System.out.println("프라푸치노를 선택하셨습니다.");
                break;
                //표에 있지 않는 번호를 입력할 경우 “다른 번호를 입력해 주세요.” 문장을 출력
            default:
                System.out.println("다른 번호를 입력해 주세요.");
                break;
        }
        System.out.println("이용해주셔서 감사합니다.");
    }
}
