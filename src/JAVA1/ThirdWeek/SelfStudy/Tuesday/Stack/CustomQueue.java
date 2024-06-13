package JAVA1.ThirdWeek.SelfStudy.Tuesday.Stack;


import java.util.Stack;

public class CustomQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public CustomQueue() {
        //stack 선언
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    //add() 메소드에서는 s2 Stack에 값이 추가
    public void add(int element) {
        s2.push(element);
    }

    //poll()에서는 s1 Stack에서 pop된 후, 해당 값이 반환
    //s1 Stack이 비어있다면, s2 Stack의 값이 모두 s1에 들어간 후 pop
    public Integer poll() {
        if(s1.isEmpty()){
            while(!s2.isEmpty()){
                s1.add(s2.pop());
            }
        }
        return s1.pop();
    }

    public Integer size() {
        return s1.size() + s2.size();
    }

    public Boolean isEmpty() {
        return size() == 0;
    }
}
