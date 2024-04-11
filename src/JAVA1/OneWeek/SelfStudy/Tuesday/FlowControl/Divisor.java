package JAVA1.OneWeek.SelfStudy.Tuesday.FlowControl;

import java.util.Scanner;
public class Divisor {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        // 임의의 값 n의 약수를 구함
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
