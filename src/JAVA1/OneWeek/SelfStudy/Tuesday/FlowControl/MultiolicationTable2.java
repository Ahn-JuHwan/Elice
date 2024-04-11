package JAVA1.OneWeek.SelfStudy.Tuesday.FlowControl;

public class MultiolicationTable2 {
    public static void main(String args[]) {
        // 구구단 1단부터 9단까지 차례로 출력하는 이중 for문
        for(int i=1; i<10; i++){
            System.out.println("========구구단 "+i+"단 =========");
            for(int j=1; j<10; j++){
                System.out.println(i*j);
            }
        }

    }
}
