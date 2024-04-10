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


// 지시사항을 참고하여 코드를 작성해 보세요.

class FamilyBusinessAccount extends BusinessAccount{
    FamilyBusinessAccount(double balance){
        super(balance);
    }

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