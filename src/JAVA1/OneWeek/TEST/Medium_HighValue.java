package JAVA1.OneWeek.TEST;


import java.util.*;


public class Medium_HighValue {

    //중윗값을 찾기 위한 solution 메서드를 선언 arr배열을 반환값으로 받음
    public static void solution(int[] arr) {

        //배열을 오름차순으로 정렬
        Arrays.sort(arr);
        // 배열의 길이를 2로 나눈 값을 변수 a에 저장
        int a=arr.length/2;

        //배열의 길이가 홀수인 경우, 중앙값 출력
        if(arr.length%2 !=0){
            System.out.println(arr[a]);
        }
        //배열의 길이가 짝수인 경우, 중앙 두 값의 평균을 출력
        else{
            System.out.println((arr[a-1]+arr[a])/2);
        }

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        //n길이 만큼의 배열 값 입력 받음
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        //solution(arr)호출
        solution(arr);
    }
}
