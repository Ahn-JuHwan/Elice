package JAVA1.TwoWeek.Leacture.Monday;

import java.util.Scanner;
class BusinessAccount {
    protected double balance;

    BusinessAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }
}


//BusinessAccount 클래스를 상속받는 FamilyBusinessAccount 클래스를 작성
class FamilyBusinessAccount extends BusinessAccount{
    //super 키워드를 사용하여 BusinessAccount 클래스의 balance 속성에 접근
    FamilyBusinessAccount(double balance){
        super(balance);
    }

    //부모 클래스의 balance 값을 아래와 같은 형식으로 출력하는 메서드를 구현합니다. 메서드명은 displayBalance로 작성
    public void displayBalance(){
        System.out.println("가족 비즈니스 계정 잔액: "+super.getBalance()+"원");
    }
}



public class ReceiveAnInheritance {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double initialBalance = scanner.nextDouble();

        FamilyBusinessAccount familyAccount = new FamilyBusinessAccount(initialBalance);

        familyAccount.displayBalance();

        scanner.close();
    }
}