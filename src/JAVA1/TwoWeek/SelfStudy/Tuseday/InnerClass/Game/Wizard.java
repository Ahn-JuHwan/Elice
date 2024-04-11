package JAVA1.TwoWeek.SelfStudy.Tuseday.InnerClass.Game;

final class Wizard extends Character {
    static final public int MAX_MP = 50;

    private int MP = 0;
    // Magic 클래스의 인스턴스인 normalMagic, skillMagic 멤버 변수를 추가
    private Magic normalMagic = new Magic("일반", 1) ;
    private Magic skillMagic = new Magic("최면", 20) ;

    Wizard(String name) { super(name); }
    Wizard(String name, int AP) { super(name, AP); }
    Wizard(String name, String nickname) { super(name, nickname); }
    Wizard(String name, String nickname, int AP) { super(name, nickname, AP); }

    public class Magic{
        private String name;
        private int requiredMP;

    //Magic 클래스의 인스턴스를 생성하여
    //Wizard 클래스의 멤버 변수인 normalMagic, skillMagic에 할당
        private Magic(String name, int requiredMP){
            this.name=name;
            this.requiredMP=requiredMP;
        }
        private boolean canUseMagic(){
            return MP >= requiredMP;
        }
    }
    public int getMP() { return MP; }
    public void setMP(int MP) {
        if(MP < 0) MP = 0;
        else if(MP > MAX_MP) MP = MAX_MP;
        this.MP = MP;
    }

    public void attack(Character target) {
        super.attack(target);

        // canUseMagic 메서드를 활용하여 일반 마법 사용 가능 여부를 확인합니다.
        if(!normalMagic.canUseMagic()) {
            System.out.println(super.getName() + "의 MP가 모자라 마법 공격을 할 수 없습니다.");
            return;
        }
        target.setHP(target.getHP() - MP);
        System.out.println(super.getName() + "이(가) " + target.getName() + "을(를) 마법의 힘으로 " + MP + "만큼 추가 데미지를 입혔습니다!");
    }

    private void printSkill(Character target) {
        System.out.println(super.getName() + "은(는) " + target.getName() + "에게 마법사 스킬 [" + skillMagic.name + "]을 사용했습니다!");
        System.out.println("[효과: 상대의 공격력을 반으로 줄임]");
    }

    public void useSkill(Character target) {
        // canUseMagic 메서드를 활용하여 최면 마법 사용 가능 여부를 확인합니다.
        if(!skillMagic.canUseMagic()) {
            System.out.println(super.getName() + "의 MP가 모자라 마법 공격을 할 수 없습니다.");
            return;
        }
        target.setAP(target.getAP() / 2);
        printSkill(target);
    }

    public String toString() {
        String result = "";

        result += "<마법사>\n";
        result += super.toString();

        return result;
    }
}