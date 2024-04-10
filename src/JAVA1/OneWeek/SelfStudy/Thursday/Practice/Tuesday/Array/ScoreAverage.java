package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Tuesday.Array;

public class ScoreAverage {
    public static void main(String args[]) {
        int[] grades = new int[] {100, 90, 70, 85, 60, 100, 90, 85, 75, 50, 65, 95, 90, 100, 75, 100, 70, 90, 95, 75};

        // 아래에 몇 명만이 평균을 넘었는지 계산
        int sum = 0;
        int average;
        // 반복문을 사용해서 배열 grades의 모든 값을 더해 변수에 저장
        for(int i:grades){
            sum+=i;
        }

        // 평균을 저장하는 변수를 선언하고 평균값을 구해 저장
        average=sum/grades.length-1;

        // 평균을 넘는 사람들을 저장하는 변수 count를 선언한 후
        // 배열의 값이 평균보다 클때만 count를 증가
        int count=0;
        for(int i:grades){
            if(i>average){
                count++;
            }
        }
        System.out.print(count);
    }
}
