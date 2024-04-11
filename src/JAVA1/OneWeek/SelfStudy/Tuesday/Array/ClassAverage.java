package JAVA1.OneWeek.SelfStudy.Tuesday.Array;

public class ClassAverage {
    public static void main(String args[]) {
        int [][] grades = {{100, 90, 85, 80, 100, 70, 90, 85, 90, 70}, {90, 80, 70, 85, 75, 100, 90, 50, 100, 100}};

        // 반복문을 이용하여 각 배열의 값을 더함
        int sum1=0;
        int sum2=0;


        for(int i=0; i<grades[0].length;i++){
            sum1+=grades[0][i];

        }
        for(int j=0; j<grades[1].length;j++){
            sum2+=grades[1][j];
        }

        // 평균 점수를 배열의 길이로 나눠 저장

        sum1=sum1 / grades[0].length;
        sum2=sum2 / grades[1].length;


        System.out.println("1반의 평균 점수 : " + sum1 );
        System.out.println("2반의 평균 점수 : " + sum2 );
        // if문을 사용하여 더 큰 쪽의 점수를 출력
        if(sum1>sum2){
            System.out.println("1반의 점수가 더 높습니다.");
        }
        else if(sum1<sum2){
            System.out.println("2반의 점수가 더 높습니다.");
        }

    }
}
