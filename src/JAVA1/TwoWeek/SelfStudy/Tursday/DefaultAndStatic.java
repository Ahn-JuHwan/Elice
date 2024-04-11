package JAVA1.TwoWeek.SelfStudy.Tursday;


// 운동선수 인터페이스
interface Athlete{
    void train();
    default void compete(){
        System.out.println("경쟁");
    }
    static void rest(){
        System.out.println("휴식");
    }
}

// 축구선수 클래스
class SoccerPlayer implements Athlete{
    public void train(){
        System.out.println( "축구 훈련");
    }
    public void compete(){
        System.out.println( "축구 경쟁");
    }

}

// 야구선수 클래스
class BaseballPlayer implements Athlete{
    public void train(){
        System.out.println( "야구 훈련");
    }
    public void compete(){
        System.out.println( "경쟁");
    }

}

public class DefaultAndStatic {
    public static void main(String[] args) {

        SoccerPlayer soccerPlayer = new SoccerPlayer();
        soccerPlayer.train();
        soccerPlayer.compete();

        BaseballPlayer baseballPlayer = new BaseballPlayer();
        baseballPlayer.train();
        baseballPlayer.compete();

        Athlete.rest();
    }
}