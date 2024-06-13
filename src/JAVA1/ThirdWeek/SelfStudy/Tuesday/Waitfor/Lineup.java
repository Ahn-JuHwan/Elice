package JAVA1.ThirdWeek.SelfStudy.Tuesday.Waitfor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lineup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNumber = sc.nextInt();
        List<Member> memberList = new ArrayList<>();

        for (int i = 0; i < totalNumber; i++) {
            int id = sc.nextInt();
            int age = sc.nextInt();
            memberList.add(new Member(id, age));
        }

        //멤버들을 id를 중심으로 오름차순 정렬
        memberList.sort(new MyComparator());

        System.out.println(memberList);
    }
}
