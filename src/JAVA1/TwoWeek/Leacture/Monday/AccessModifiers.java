package JAVA1.TwoWeek.Leacture.Monday;


/*static과 abstract는 함께 사용할 수 없다.
abstract와 final은 함께 사용할 수 없다.
abstract 메서드는 private 접근 제어자를 가질 수 없다.
private 과 final 은 오버라이딩 관점에서 중복되는 기능을 가지므로 하나만 사용하는 것이 좋다.*/

abstract class Plan {
    private int time;
    static int price;

    Plan(int t, int p) {
        this.time = t;
        price = p;
    }

    private void changeState() {
        this.time -= 1;
        price -= 1;
    }

    public void complete() {
        this.time = 0;
    }

    private void checkState() {
        System.out.println("남은 예산은 " + price + "이며 " + time + " 기간 소요될 것으로 보입니다");
    }

    public void processing() {
        changeState();
        if(price <= 0) {
            System.out.println("\n!예산이 부족합니다!");
        } else if(this.time <= 0) {
            System.out.println("\n!작업이 완료 되었습니다!");
        } else {
            System.out.println("\n 작업 진행중.. ");
            checkState();
        }
    }

    void upgrading() {};
}

class DevelopedPlan extends Plan {

    DevelopedPlan(int t, int p) {
        super(t, p);
    }

    void upgrading() {
        super.complete();
        System.out.println("\n작업을 바로 완료합니다!");
    }
}


public class AccessModifiers {
    public static void main(String args[]) {

        DevelopedPlan a = new DevelopedPlan(5, 10);
        a.processing();
        a.processing();
        a.processing();
        a.upgrading();
        a.processing();


    }
}