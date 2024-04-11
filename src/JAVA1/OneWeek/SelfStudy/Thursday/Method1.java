package JAVA1.OneWeek.SelfStudy.Thursday;
class Character2 {

    public String name;
    public String nickname;
    public int HP = 100;
    public int AP = 0;
    public String[] inventory = { "물약", "칼", "갑옷" };

    // rintDashboard 메서드를 작성합니다.
    // 해당 메서드는 name, nickname, HP, AP 멤버 변수를 출력.
    public void printDashboard(){

        System.out.println("====================");
        System.out.println("이름: "+name);
        System.out.println("별명: "+nickname);
        System.out.println("체력: "+HP);
        System.out.println("공격력: "+AP);
        System.out.println("====================");

    }

    //inventory 배열이 비었는지 확인하고, 비어있다면 true, 아니라면 false를 리턴
    public boolean isInventoryEmpty(){
        return inventory.length==0;
    }

}
public class Method1 {
    public static void main(String args[]) {
        Character2 ch = new Character2();

        ch.name = "헬로빗";
        ch.nickname = "Hellobit";

        ch.printDashboard();
        System.out.println(ch.isInventoryEmpty());
    }
}
