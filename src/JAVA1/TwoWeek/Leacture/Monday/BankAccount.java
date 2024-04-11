package JAVA1.TwoWeek.Leacture.Monday;



class BankAccount {


    //계좌번호(accountNumber)
    private String accountNumber;

    // 잔액(balance)
    private double balance;

    // 계좌번호와 잔액에 대한 getter와 setter 메서드를 구현
    public String getAccountNumber(){
        return accountNumber;

    }
    public double getBalance(){
        return balance;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    // toString() 메서드를 오버라이드하여 계좌 정보를 문자열로 표현
    @Override
    public String toString(){
        return "계좌번호: "+this.accountNumber+", 잔액: "+this.balance;
    }

}