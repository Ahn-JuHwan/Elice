package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Tuesday.Practice;

import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 반지름 입력 받음
        int radius = scanner.nextInt();

        // pi 를 선언하고, 원주율 값 ‘3.14’
        final double pi=3.14;


        // 연못의 면적을 계산한 후 실수형 변수 area에 저장
        double area = radius*radius*pi;


        System.out.println("주어진 동그라미의 면적은 " + area + "m^2입니다.");
    }
}
