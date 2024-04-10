package JAVA1.OneWeek.Lecture.Wednesday_OOP;

class NewPlan1 {
    public String engine;
    public String body;
    public String wheel;
    public int code;
//NewPlan 클래스에 다음 기능을 가진 생성자 및 기능을 가진 매서드 추가
    NewPlan1() {
        System.out.println("방금 생산된 차량에 코드가 부여되지 않았습니다.");

    }
    NewPlan1(int newst_code) {
        this.code=newst_code+1;

    }
    public void turnOn(String state) {
        if(state.equals("on")){
            this.engine="on";
            this.wheel="spin";
        }

    }
    public void selectTheColor(String color) {
        this.body=color;

    }
}
public class RunningFactory2 {
    public static void main(String args[]) {

        int oldCode = 5;
        String popularColor = "black";

        NewPlan1 test = new NewPlan1();

        test.turnOn("on");
        test.selectTheColor(popularColor);


        System.out.println("=======시제품 테스트 결과=======");
        System.out.println("차량 코드 : " + test.code);
        System.out.println("전원 상태 : " + test.engine);
        System.out.println("바퀴 상태 : " + test.wheel);
        System.out.println("도색 상태 : " + test.body);

    }

}
