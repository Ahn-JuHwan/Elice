package JAVA1.OneWeek.SelfStudy.Thursday.Practice;
class Order{
    // 메뉴 이름 문자열, 가격을 나타내는 정수 선언
    public String menu;
    public int price;
    //주문 정보를 출력하는 매서드 구현
    public void printOrderInfo(){
        System.out.println("주문한 메뉴는 "+menu+", 가격은 "+price+"원입니다." );
    }

}
public class OrderClass {
    public static void main(String args[]) {
        Order order = new Order();

        order.menu="아메리카노";
        order.price=4000;

        //printOrderInfo()를 호출하여 주문 정보를 출력
        order.printOrderInfo();


    }
}
