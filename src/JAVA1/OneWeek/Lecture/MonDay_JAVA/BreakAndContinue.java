package JAVA1.OneWeek.Lecture.MonDay_JAVA;
import java.util.Scanner;
public class BreakAndContinue {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        //변수 i 를 1부터 시작하여 num 보다 같거나 클 때까지 1씩 증가시키며 반복문을 실행
        for(int i = 1; i <= num; i += 1) {

            // i를 num / 2로 나눴을 때 나머지가 0이면, 반복문을 즉시 종료
            if( i%(num/2) == 0){
                break;
            }
            //i가 짝수일 경우, 그 값을 출력하지 않고 다음 반복으로 넘어감
            else if(i%2==0){
                continue;
            }
            System.out.println(i);



        }

        System.out.println(num);
    }
}
