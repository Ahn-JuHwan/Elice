package JAVA1.OneWeek.TEST;

import java.util.*;
public class DivideArray {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        //반복문을 사용하여 n만큼 크기인 arr배열에 원소 저장
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        solution(arr);
    }
    public static void solution(int[] arr) {
        // 변수를 선언하여 짝수 인덱스 위치의 원소들의 합을 저장
        int sum1=0;
        //arr배열의 길이만 큼 반복
        for(int i=0;i<arr.length;i++){

            //sum1에 arr배열의 짝수 인덱스 위치의 원소 합을 저장
            if(i%2==0 || i==0){
                sum1+=arr[i];

            }
        }
        //arr배열의 홀수 인덱스 위치의 원소로 sum1값을 나눔
        for(int j=0; j<arr.length;j++){
            if(j%2!=0){

                System.out.println(sum1/arr[j]);
            }
        }
    }
}
