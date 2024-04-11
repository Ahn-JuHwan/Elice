package JAVA1.ThirdWeek.SelfStudy.Tuesday.Stack;


import java.util.Queue;
// 사용할 Queue 구현체를 import
import java.util.LinkedList;
class Customer {
    private static int counter = 1;
    private String name;
    private int customerNumber;

    public Customer(String name) {
        this.name = name;
        this.customerNumber = counter++;
    }

    public String getName() {
        return name;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    @Override
    public String toString() {
        return "Customer #" + customerNumber + ": " + name;
    }
}

// PostOfficeQueue 클래스를 생성하고, Queue<Customer> 타입의 멤버 변수 queue를 선언
// queue는 PostOfficeQueue 클래스의 생성자에서 초기화
class PostOfficeQueue{
    private Queue<Customer> queue;

    public PostOfficeQueue(){
        queue = new LinkedList<>();
    }

    // 전달받은 이름으로 새로운 Customer 인스턴스를 생성
    public void addCustomer(String name){
        Customer newcustomer = new Customer(name);
        // 대기열에 추가
        queue.add(newcustomer);
        System.out.println("대기열에 추가되었습니다.: " + newcustomer);
    }

    // 대기열에 가장 먼저 추가된 Customer 인스턴스가 빠져나오고, 해당 객체를 리턴
    public Customer serveNextCustomer(){
        return queue.poll();
    }

    // 현재 대기중인 고객 목록을 출력
    public void printWaitingCustomers(){
        if(queue.isEmpty()){
            System.out.println("기다리는 손님이 없습니다.");
        }
        else{
            System.out.println("손님 대기열:");
            for(Customer customer : queue){
                System.out.println(customer);
            }
        }
    }

}

public class PostOffice {
    public static void main(String[] args) {
        PostOfficeQueue postOfficeQueue = new PostOfficeQueue();

        postOfficeQueue.printWaitingCustomers();

        postOfficeQueue.addCustomer("Alice");
        postOfficeQueue.addCustomer("Bob");
        postOfficeQueue.addCustomer("Charlie");

        postOfficeQueue.printWaitingCustomers();

        Customer served = postOfficeQueue.serveNextCustomer();
        System.out.println("다음 손님: " + served);

        postOfficeQueue.printWaitingCustomers();
    }
}