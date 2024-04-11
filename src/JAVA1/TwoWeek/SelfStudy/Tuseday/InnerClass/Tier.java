package JAVA1.TwoWeek.SelfStudy.Tuseday.InnerClass;
class Vehicle {

    private int wheel;

    // Car 내부 클래스를 구현
    class Car{
        //car의 생성자 메서드는 wheel을 4로 초기화
        Car(){
            wheel=4;
        }
        public  void printWheels(){
            System.out.println("자동차의 바퀴 수는 "+wheel+"개입니다.");
        }
    }
    // Bicycle 내부 클래스를 구현
    class Bicycle{

        //Bicycle의 생성자 메서드는 wheel을 2로 초기화
        Bicycle(){
            wheel=2;
        }
        public void printWheels(){
            System.out.println("자전거의 바퀴 수는 "+wheel+"개입니다.");
        }
    }


    public void printWheels() {
        Car car = new Car();
        car.printWheels();

        Bicycle bicycle = new Bicycle();
        bicycle.printWheels();
    }
}

public class Tier {
    public static void main(String args[]) {

        Vehicle vehicle = new Vehicle();
        vehicle.printWheels();
    }
}
