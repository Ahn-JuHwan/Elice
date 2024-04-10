package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Tuesday.Array;

public class ForEach {
    public static void main(String args[]) {
        int[] iArray = new int[] {1, 2, 3, 4, 5};

        // iArray의 값들을 모두 출력
        for(int i : iArray) {
            System.out.println(i);
        }

        // sum에 i를 더해 배열의 값을 저장하는 코드

        int sum = 0;
        for(int i : iArray) {
            sum+=i;

        }
        System.out.println("Sum = " + sum);
    }
}
