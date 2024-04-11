package JAVA1.TwoWeek.SelfStudy.Tuseday.InnerClass.Game;

//Item를 상속받은 자식 클래스 Potion 클래스
public class Potion extends Item {
    private int amount;
    private String type;

    public Potion(String name, String description, int amount, String type){
        super(name,description);
        this.amount=amount;
        this.type=type;

    }

    //Item 클래스의 추상 메서드를 오버라이딩
    public void use(Character character){
        //ype 멤버 변수의 값이 "HP"일 때
        //character 매개변수의 HP를 amount만큼 증가
        if(type.equals("HP")){
            character.setHP(character.getHP()+this.amount);
        }
        //type 멤버 변수의 값이 "AP"일 때
        //character 매개변수의 AP를 amount만큼 증가
        else if(type.equals("AP")){
            character.setAP(character.getAP()+this.amount);
        }
    }
}