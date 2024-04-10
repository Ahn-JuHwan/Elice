package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Tuesday.FlowControl;

public class Rocket {
    public static void main(String args[]) {
        int count = 10;

        // count가 0 이상인 동안 count를 출력하고 count를 감소시키는 while문 0이 되면 로켓발사 출력!
        while(count>=0 ){


            System.out.println(count);
            count--;

            if(count ==0){
                System.out.println("로켓 발사!");
                break;
            }
        }
    }
}
