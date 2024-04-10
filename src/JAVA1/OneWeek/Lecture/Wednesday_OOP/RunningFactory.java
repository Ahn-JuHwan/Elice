package JAVA1.OneWeek.Lecture.Wednesday_OOP;

//부품을 나타내는 NewPlan 클래스 완성
class NewPlan {
    public String engine;
    public String body;
    public String wheel;
    public int code;
}

public class RunningFactory {
    public static void main(String args[]) {

        // Main 클래스의 main 메서드에서 test1 , test2 , test3 라는 이름의
        // NewPlan 객체를 각각 생성
        NewPlan test1 = new NewPlan();
        NewPlan test2 = new NewPlan();
        NewPlan test3 = new NewPlan();




        // 생성한 객체 각각에 대해 code 멤버 변수에 1, 2, 3의 값을 할당
        test1.code=1;
        test2.code=2;
        test3.code=3;


        // 아래 코드는 수정하지 말아주세요
        System.out.println(test1.code);
        System.out.println(test2.code);
        System.out.println(test3.code);
    }

}
