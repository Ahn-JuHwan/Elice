package JAVA1.OneWeek.SelfStudy.Tuesday.FlowControl;

public class PlusNumber {
    public static void main(String args[]) {
        int i = 0;
        int sum = 0;
        while(true) {
            i++;
            // continue키워드를 사용하여 변수 i를 3으로 나눈 나머지가 0인 경우 sum에 더하지 않음
            if(i%3==0){
                continue;
            }
            sum += i;
            // break 키워드를 사용하여 sum이 100을 넘어가면 종료하는 if문
            if(sum>100){
                break;
            }
        }
        System.out.println(sum);
    }
}
