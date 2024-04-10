package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Thursday.Practice;
import java.util.*;
public class Alphabet {

    //소문자 a가 들어오면 0, b는 1, z는 25를 반환하고
    // 소문자 이외의 문자가 들어오면 -1을 반환하는 메소드
    public static int char2Int(char c) {
        if('a' <= c && c <= 'z') {
            return c - 'a';
        } else {
            return -1;
        }
    }

    //0부터 25 사이의 정수가 들어오면 0은 a, 1은 b, 25는 z를 반환하는 메소드
    public static char int2Char(int i) {
        if (0 <= i && i <= 25) {
            return (char)(i + 'a');
        } else {
            return ' ';
        }
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String word = scanner.nextLine();

        // 1. word에 있는 모든 단어를 소문자로 변경
        word = word.toLowerCase();

        // 2. a부터 z까지 나온 횟수를 저장하는 배열 생성
        int[] alphabetCount = new int[26];

        // 3. 각 알파벳의 등장 횟수를 배열에 저장
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = char2Int(ch);
            if (index != -1) {
                alphabetCount[index]++;
            }
        }

        // 4. 가장 많이 나온 알파벳 출력
        int maxCount = 0;
        char mostUsedLetter = ' ';
        for (int i = 0; i < alphabetCount.length; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                mostUsedLetter = int2Char(i);
            }
        }

        System.out.println("가장 많이 사용된 알파벳: " + mostUsedLetter);
    }
}
