package JAVA1.TwoWeek.SelfStudy.Tuseday.InnerClass.Game;

public class Inner {
    public static void main(String args[]) {
        Warrior warrior = new Warrior("캐터필러", "Caterpillar", 30);
        Wizard wizard = new Wizard("도도새", "Dodo", 10);

        wizard.attack(warrior);
        wizard.setMP(10);
        wizard.attack(warrior);

        wizard.useSkill(warrior);
        wizard.setMP(40);
        wizard.useSkill(warrior);

        System.out.println(warrior);


        //--------------------------------------아이템-----------------
        Item exampleItem = new Item("예시 아이템", "아이템 객체 사용 예시입니다.") {
            public void use(Character character) {
                System.out.println("아이템 사용!");
            }
        };

        System.out.println(exampleItem);

        warrior.addItem(exampleItem);
        System.out.println(warrior);

        warrior.useItem(exampleItem);
        System.out.println(warrior);

        //==============================포션========================
        Item HPPotion = new Potion("회복포션", "HP를 10만큼 회복해준다.", 10, "HP");
        Item APPotion = new Potion("공격력포션", "AP를 20만큼 향상시킨다.", 20, "AP");

        warrior.addItem(HPPotion);
        wizard.addItem(HPPotion);

        warrior.addItem(APPotion);
        wizard.addItem(APPotion);

        wizard.setHP(50);
        System.out.println(warrior);
        System.out.println(wizard);

        wizard.useItem(HPPotion);
        System.out.println(wizard);

        warrior.useItem(APPotion);
        System.out.println(warrior);
    }
}
