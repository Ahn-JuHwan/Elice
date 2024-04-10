package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Thursday;
import java.util.ArrayList;

class Character1 {
    public String name;
    public String nickname;
    public int HP;
    public int AP;
    // inventory를 ArrayList로 대체
    public ArrayList<String> inventory = new ArrayList<String>();


    Character1(String name) {
        this(name, "별명 없음", 10);
    }

    Character1(String name, int AP) {
        this(name, "별명 없음", AP);
    }

    Character1(String name, String nickname) {
        this(name, nickname, 10);
    }

    Character1(String name, String nickname, int AP) {
        this.name = name;
        this.nickname = nickname;
        this.HP = 100;
        this.AP = AP;
    }

    public void printDashboard() {
        System.out.println("====================");
        System.out.println("이름: " + name);
        System.out.println("별명: " + nickname);
        System.out.println("체력: " + HP);
        System.out.println("공격력: " + AP);
        //인벤토리 내용 출력
        System.out.print("인벤토리: ");
        for(String item: inventory){
            System.out.print(item + " ");
        }
        System.out.println("");
        System.out.println("====================");
    }

    public boolean isInventoryEmpty() {
        return inventory.size()==0;
        // ArrayList의 size 메서드를 사용하여 인벤토리 비움
    }

    public void attack(Character1 target) {
        target.HP -= AP;
        System.out.println(name + "이(가) " + target.name + "을(를) 일반 공격으로 " + AP + "만큼 데미지를 입혔습니다!");
    }

    public String getNthItemFromInventory(int n) {
        return inventory.get(n);
        // ArrayList의 get 메서드를 사용 하여 아이템 얻음
    }

    public void increaseStat() {
        this.HP += 10;
        System.out.println(name + "의 HP가 10만큼 증가했습니다.");
    }

    public void increaseStat(int amount) {
        this.HP += amount;
        System.out.println(name + "의 HP가 " + amount + "만큼 증가했습니다.");
    }

    public void increaseStat(int amount, String stat) {
        if(stat.equals("HP")) {
            this.HP += amount;
            System.out.println(name + "의 HP가 " + amount + "만큼 증가했습니다.");
        }
        else if(stat.equals("AP")) {
            this.AP += amount;
            System.out.println(name + "의 AP가 " + amount + "만큼 증가했습니다.");
        }
        else {
            System.out.println("유효하지 않은 스탯입니다.");
        }
    }

    // 아이템 얻는 매서드
    public void addItem(String item){
        inventory.add(item);
        System.out.println(name+"이(가) "+ item+" 아이템을 얻었습니다!");
    }

    //아이템을 주는 매서드
    public void giveItem(Character1 receiver, String item){
        inventory.remove(item);
        receiver.addItem(item);
        System.out.println(name+"이(가) "+receiver.name+"에게 "+item+" 아이템을 주었습니다!");

    }

    //아이템을 사용하는 매서드
    public void useItem(String item){
        inventory.remove(item);
        System.out.println(name+ "이(가) "+ item + " 아이템을 사용했습니다!");
    }



}

public class Character {
    public static void main(String args[]) {
        Character1 ch1 = new Character1("헬로빗", "Hellobit", 30);
        Character1 ch2 = new Character1("캐터필러", "Caterpillar", 50);

        ch1.printDashboard();
        ch2.printDashboard();

        ch1.addItem("포션");
        ch1.addItem("칼");
        ch1.addItem("열매");

        ch1.giveItem(ch2, "칼");

        ch1.printDashboard();
        ch2.printDashboard();

        System.out.println(ch1.getNthItemFromInventory(1));
        System.out.println(ch1.isInventoryEmpty());
    }
}
