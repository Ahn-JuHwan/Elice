package JAVA1.ThirdWeek.SelfStudy.Tuesday.Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Que {
    private Queue<String> queue;

    public Que() {
        queue = new LinkedList<>();
    }

    public void addStudent(String student) {
        // 매개변수로 전달받은 학생의 이름을 대기열에 추가
        queue.add(student);
        System.out.println(student + "(이)가 대기열에 추가되었습니다.");
    }


    public void serveStudent(){
        //대기열에 학생이 존재한다면, 다음 학생을 대기열에서 제거 후 출력
        if(!queue.isEmpty()){
            String name = queue.remove();
            System.out.println(name + "(이)가 점심을 받았습니다.");
        }
        //대기열이 비었다면 출력
        else{
            System.out.println("대기열에 남아있는 학생이 없습니다.");
        }
    }

    public static void main(String[] args) {
        Que lunchQueue = new Que();
        Scanner scanner = new Scanner(System.in);

        System.out.print("점심 대기열에 추가할 학생 이름을 입력하세요: ");
        String name = scanner.nextLine();
        lunchQueue.addStudent(name);

        System.out.print("점심 대기열에 추가할 학생 이름을 입력하세요: ");
        name = scanner.nextLine();
        lunchQueue.addStudent(name);

        lunchQueue.serveStudent();
        lunchQueue.serveStudent();
        lunchQueue.serveStudent();

        scanner.close();
    }
}