package JAVA1.TwoWeek.Test;

import java.util.ArrayList;
import java.util.Scanner;

public class TurnOverPrime {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] numbers = new int[T];
        //입력받은 개수만큼 숫자를 입력받아 배열에 저장
        for (int i = 0; i < T; i++) {
            numbers[i] = scanner.nextInt();
        }
        ArrayList<Integer> result = solution(numbers);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static ArrayList<Integer> solution(int[] numbers) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : numbers) {
            //각 숫자에 대해 isPrime 메서드를 호출하여 소수인지 검사
            if (isPrime(num)) {
                //소수인 경우 reverse 메서드를 호출하여 숫자를 뒤집음
                int reversedNum = reverse(num);
                //뒤집은 숫자도 소수인 경우 결과 목록에 원래의 숫자를 추가
                if (isPrime(reversedNum)) {
                    result.add(num);
                }
            }
        }
        return result;
    }


    //isPrime 메서드 숫자가 소수인지 검사하는 함수
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //reverse 메서드 입력받은 숫자를 뒤집는 함수
    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}


