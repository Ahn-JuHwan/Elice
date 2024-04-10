package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Tuesday.FlowControl;

import java.util.Scanner;
public class BuildingShootingStars {
    public class Main {
        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt(); // 쌓을 별똥별의 개수를 입력받습니다.
            // 이중 for문을 이용 별 쌓기
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print('*');
                }
                System.out.println("");
            }


        }

        }

    }
