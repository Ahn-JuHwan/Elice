package JAVA1.OneWeek.SelfStudy.Tuesday.Practice;
import java.util.*;

public class EscapeRoom {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        //변수를 선언 및 초기화
        boolean success=false;
        int cnt=1;

        //cnt가 5이하인 동안 반복 하는 while 문 작성
        while(cnt <=5 ){
            int password = scanner.nextInt();
            //정수형 암호를 입력받아 1198과 다르면 cnt 1증가 success->false
            //일치 할경우 beak문을 통해 for문 탈출 success->true
            if(password==1198){
                success=true;
                break;
            }
            else{
                cnt++;
            }
        }
        //while문 종료 후 success값에 따라 탈출 여부 출력
        if(success==true){
            System.out.print("탈출 성공");
        }
        else{
            System.out.print("탈출 실패");
        }
    }
}
