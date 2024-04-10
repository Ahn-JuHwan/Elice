package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Tuesday.Array;

public class Average {
    public static void main(String args[]) {
        int[] grades = new int[] {100, 90, 70, 85, 60, 100, 90, 85, 75, 50, 65, 95, 90, 100, 75, 100, 70, 90, 95, 75};

        // 성적 총합 int형 변수 sum을 0으로 초기화
        int sum=0;
        for (int i = 0; i < grades.length; i++) {
            // for문이 동작하는 동안 모든 데이터를 sum에 저장
            sum+=grades[i];
        }
        // int형 변수 average에 sum을 배열의 길이로 나눈 값으로 초기화
        int average=sum/grades.length;
        System.out.println(average);
    }
}
