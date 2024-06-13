package JAVA1.ThirdWeek.Leacture.Monday;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.Random;

public class Waiting {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random(0L);
        Deque<String> line = new ArrayDeque<>(); // 실제 사람들이 서 있는 줄을 의미
        Stack<String> cmdHistory = new Stack<>(); // 명령의 기록을 의미

        for(int i = 0; i < 5; i++) {
            int cmd = input.nextInt();
            //line의 현재 상태를 조회하는 명령
            if(cmd == 1){
                System.out.println(line);
                cmdHistory.push("peek");
            }
            //새로운 손님이 들어왔다는 명령
            else if(cmd ==2 ){
                String code = "c" + Integer.toString(rand.nextInt(100));
                line.add(code);
                cmdHistory.push("in : "+code);
            }
            else if( cmd == 3){
                String code;
                try{
                    code = line.remove();
                } catch (Exception e) {
                    code = null;
                }
                cmdHistory.push("out : " + code);
            } else
            {
                throw new IllegalArgumentException("정상적인 cmd가 아닙니다.");
            }
        }

        System.out.println(line);
        System.out.println(cmdHistory);

        input.close();

    }
}
