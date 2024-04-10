package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Thursday;

class Character3 {
    public String name;
    public String nickname;
    public int HP = 100;
    public int AP = 10;
    public String[] inventory = {"물약", "칼", "갑옷"};

    public void printDashboard() {
        System.out.println("====================");
        System.out.println("이름: " + name);
        System.out.println("별명: " + nickname);
        System.out.println("체력: " + HP);
        System.out.println("공격력: " + AP);
        System.out.println("====================");
    }

    public boolean isInventoryEmpty() {
        return inventory.length == 0;
    }
    //매개변수로 받은 상대 Character 객체의 HP를 현재 Character 객체의 AP만큼 감소
    public void attack(Character3 target) {
        target.HP -= this.AP;
        System.out.println(this.name + "이(가) " + target.name + "을(를) 일반 공격으로 " + this.AP + "만큼 데미지를 입혔습니다!");
    }
    //getNthItemFromInventory 메서드를 작성
    // inventory 배열에서 매개변수로 받은 인덱스에 위치한 값을 리턴
    public String getNthItemFromInventory(int index) {
        return inventory[index];
    }
}
public class Method2 {
    public static void main(String args[]) {
        Character3 ch1 = new Character3();
        Character3 ch2 = new Character3();

        ch1.name = "헬로빗";
        ch1.nickname = "Hellobit";
        ch1.AP = 30;

        ch2.name = "캐터필러";
        ch2.nickname = "Caterpillar";

        ch2.AP = 50;

        ch1.printDashboard();
        ch2.printDashboard();


        ch1.attack(ch2);
        ch2.attack(ch1);

        ch1.printDashboard();
        ch2.printDashboard();

        System.out.println(ch1.getNthItemFromInventory(1));
        System.out.println(ch2.getNthItemFromInventory(2));
    }
}
