package JAVA1.OneWeek.Lecture.MonDay_JAVA;
import java.util.Scanner;
public class CurseFiltering {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        // 입력받은 문자열 str 을 검사하여 'a' , 'b' , 'c' 에 해당하는 글자가 있으면 이를 '*' 으로 바꿉니다.
        String result ="";
        for (int i=0; i<str.length(); i++){

            char cha = str.charAt(i);
            //바뀐 글자를 포함한 새로운 문자열 result 를 완성합니다.
            if(cha=='a' || cha=='b' ){
                result+='*';

            }
            else if(cha=='c'){
                result+='*';

            }
            else{
                result+=cha;
            }
        }
        System.out.println(result);
    }
}
