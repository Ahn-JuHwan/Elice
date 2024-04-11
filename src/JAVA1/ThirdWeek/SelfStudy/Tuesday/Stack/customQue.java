package JAVA1.ThirdWeek.SelfStudy.Tuesday.Stack;



import java.util.LinkedList;
import java.util.Queue;

public class customQue<T> {
    private final Queue<T> queue;

    public customQue() {
        queue = new LinkedList<>();
    }

    public void add(T element) {
        printAction("add");
        queue.add(element);
    }

    public T poll() {
        printAction("poll");
        return queue.poll();
    }

    public Integer size() {
        printAction("size");
        return queue.size();
    }

    public Boolean isEmpty() {
        printAction("isEmpty");
        return queue.isEmpty();
    }

    private void printAction(String action) {
        System.out.println(action);
    }
}
