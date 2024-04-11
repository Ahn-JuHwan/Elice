package JAVA1.TwoWeek.Leacture.Wednesday.SingleTon;


class GameSettingsManager{
    //자신의 유일한 인스턴스를 private static 멤버 변수로 가짐
    private static GameSettingsManager instance = new GameSettingsManager();

    private int volume;

    private GameSettingsManager(){
        this.volume=0;
    }

    //외부에서 인스턴스에 접근할 수 있도록 getInstance()를 사용 인스턴스 반환
    public static GameSettingsManager getInstance(){
        return instance;
    }


    public void setVolume(int volume){
        this.volume=volume;

    }

    public int getVolume(){
        return this.volume;
    }
}

public class Pattern {
    public static void main(String[] args) {
        GameSettingsManager settings1 = GameSettingsManager.getInstance();
        GameSettingsManager settings2 = GameSettingsManager.getInstance();

        System.out.println("싱글턴 구현 확인: " + (settings1 == settings2));

        System.out.println("현재 볼륨: " + settings1.getVolume());
        settings1.setVolume(5);
        System.out.println("볼륨을 5로 설정");
        System.out.println("현재 볼륨: " + settings1.getVolume());
        settings1.setVolume(10);
        System.out.println("볼륨을 10으로 설정");
        System.out.println("현재 볼륨: " + settings2.getVolume());
    }
}
