package JAVA1.ThirdWeek.SelfStudy.Tuesday.Stack;



import java.util.*;

class MyStack {
    List<String> stackList = new ArrayList<>();

    public void push(String s){
        stackList.add(s);
    }

    public String pop(){
        int size = stackList.size();

        if(size == 0){
            return "-1";
        }
        else{
            return stackList.remove(size -1);
        }
    }

    public int size(){
        return stackList.size();
    }

    public boolean isEmpty(){
        if(stackList.size()==0){
            return true;
        }
        else{
            return false;
        }

    }

}

public class ListStack {
    public static void main(String args[]) {
        // 채점을 위한 코드이므로 수정하지 말아주세요.
        MyStack myStack = new MyStack();
        if (myStack.isEmpty())   System.out.println("스택이 비어있습니다.");
        myStack.push("3");
        myStack.push("5");
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }

}