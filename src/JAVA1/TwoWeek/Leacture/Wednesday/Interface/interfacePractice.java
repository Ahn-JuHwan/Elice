package JAVA1.TwoWeek.Leacture.Wednesday.Interface;

public class interfacePractice {
    public static void main(String[] args) {

        ClassA a = new ClassA("클래스 A");
        ClassB b = new ClassB("클래스 B");
        ClassC c = new ClassC("클래스 C");

        a.reading();
        a.listening();
        a.speaking();
        a.writing();

        b.reading();
        b.listening();
        b.speaking();

        c.reading();
        c.listening();


    }
}
