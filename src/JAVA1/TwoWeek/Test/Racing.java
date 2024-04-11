package JAVA1.TwoWeek.Test;

interface Car{
    String getName();
    int getTopSpeed();
}

abstract class AbstractCar implements Car{
    public String name;
    public int topSpeed;

    public AbstractCar(String name, int topSpeed){
        this.name= name;
        this.topSpeed= topSpeed;
    }

    public String getName(){
        return name;
    }
    public int getTopSpeed(){
        return topSpeed;
    }


}

class ElectricCar extends AbstractCar{
    public ElectricCar(String name, int topSpeed){
        super(name,topSpeed);
    }
}
class GasolineCar extends AbstractCar{
    public GasolineCar(String name, int topSpeed){
        super(name,topSpeed);
    }
}


public class Racing {
    public static void main(String args[]) {
        Car electricCar = new ElectricCar("전기차", 250);
        Car gasolineCar = new GasolineCar("가솔린 자동차", 260);

        System.out.println(electricCar.getName() + ": " + electricCar.getTopSpeed());
        System.out.println(gasolineCar.getName() + ": " + gasolineCar.getTopSpeed());
    }
}
