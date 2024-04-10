package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Thursday.Practice;



class Cafe {
    public String menu = "수박주스";
    public int price = 8000;

    //메뉴(menu)와 가격(price) 정보를 출력
    public void printMenuInfo(){
        System.out.println(menu+"는 "+price+"원입니다.");
    }
    //인상 가격을 측정하는 매서드
    public void printIncreasedPrice(int pastprice){
        int inta = price - pastprice;
        System.out.println("인상 가격은 "+inta+"원입니다." );


    }
}



public class Return {
    public static void main(String args[]) {

        Cafe cafe = new Cafe();
        //과거의 가격
        int pastPrice = 5000;

        cafe.printMenuInfo();
        cafe.printIncreasedPrice(pastPrice);
    }
}
