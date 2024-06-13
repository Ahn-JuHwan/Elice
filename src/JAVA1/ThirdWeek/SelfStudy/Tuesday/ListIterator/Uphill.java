package JAVA1.ThirdWeek.SelfStudy.Tuesday.ListIterator;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uphill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNumber = sc.nextInt();
        List<Integer> heightList = new ArrayList<>();

        //높이를 나타낼 자연수의 개수가 입력
        for (int i = 0; i < totalNumber; i++) {
            heightList.add(sc.nextInt());
        }

        Solution.solution(heightList.listIterator());
    }
}
