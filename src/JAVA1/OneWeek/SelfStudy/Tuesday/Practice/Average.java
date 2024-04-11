package JAVA1.OneWeek.SelfStudy.Tuesday.Practice;

import java.util.Scanner;
public class Average {
        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);

            // 국어(korean), 영어(english), 수학(math), 역사(history) 성적을 정수 형태로 입력받음
            int korean =scanner.nextInt() ;
            int english = scanner.nextInt();
            int math = scanner.nextInt();
            int history = scanner.nextInt();

            // 네 과목의 정수 형태의 평균(avg1)을 구함
            int avg1=(korean+english+math+history)/4;

            // 네 과목의 실수 형태의 평균(avg2)을 구함
            double avg2=(double)(korean+english+math+history)/4;

            // 두 결괏값을 출력
            System.out.println(avg1);
            System.out.println(avg2);

        }
    }

