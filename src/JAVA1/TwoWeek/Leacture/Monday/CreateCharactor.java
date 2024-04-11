package JAVA1.TwoWeek.Leacture.Monday;

//Character 클래스를 생성
class Character {
    public String name;
    protected int level;

    public Character(String name, int level){
        this.name=name;
        this.level=level;
    }
    //printDetails() 메서드를 추가 캐릭터의 이름, 레벨을 아래의 형식에 맞추어 출력
    void printDetails(){
        System.out.println("이름 : "+this.name);
        System.out.println("레벨 : "+this.level);

    }

}
//Player 클래스를 생성합니다. 이 클래스는 Character 클래스를 상속
class Player extends Character{

    //플레이어의 경험치를 나타내는 정수
    private int experience;

    //Player 클래스에는 오버라이딩된 printDetails() 메서드를 추가
    public Player(String name, int level, int experience){
        super(name,level);
        this.experience=experience;
    }


    public void printDetails(){
        super.printDetails();
        System.out.println("경험치 : "+this.experience);

    }
}
public class CreateCharactor {
    public static void main(String args[]) {
        Character character = new Character("Knight", 10);
        Player player = new Player("Mage", 15, 1000);

        character.printDetails();
        player.printDetails();
    }
}
