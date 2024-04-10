package JAVA1.OneWeek.Lecture.Wednesday_OOP;

class Manufacturer {
    // Manufacturer 클래스 내부에 있는
    // procedure메소드를 매개변수의 개수에 따라 다른 것이 실행.

    public String procedure() {
        return "아무런 재료도 없습니다.";
    }

    public String procedure(String wheel) {
        return "부품이 2개 부족합니다.";
    }

    public String procedure(String wheel, String body) {
        return "부품이 1개 부족합니다.";
    }

    public String procedure(String wheel, String body, String engine) {
        return "부품 확인 완료! 제작에 들어가겠습니다.";
    }
}
public class Overloading {
    public static void main(String args[]) {


        Manufacturer worker = new Manufacturer();

        System.out.println(worker.procedure());
        System.out.println(worker.procedure("wheel"));
        System.out.println(worker.procedure("wheel", "body"));
        System.out.println(worker.procedure("wheel", "body", "engine"));
    }
}
