package JAVA1.ThirdWeek.SelfStudy.Tuesday.Stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class deque {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Deque<Integer> deque = new LinkedList<>();
        int input1, input2;

        //입력값이 -1 이 나오기전까지 입력 받음
        while((input1 = sc.nextInt())>=0){
            //0 -> 줄서기
            if(input1==0){
                input2 = sc.nextInt();
                deque.add(input2);
            }
            //프리미엄 티켓 줄서기
            else if(input1==1){
                input2=sc.nextInt();
                deque.addFirst(input2);

            }
            //입장
            else{
                deque.poll();
            }

        }
        while(!deque.isEmpty()){
            System.out.print(deque.poll() + " ");
        }
    }
}
