package JAVA1.ThirdWeek.Leacture.Monday;

import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
public class CsBasic {
    //최대 범위 45로 지정
    private static final int MAX_NUM =45;
    public static void main(String args[]) {

        // 아래 Random 인스턴스의 시드 값(0)
        Random random = new Random(0);
        Scanner input = new Scanner(System.in);


        int num = input.nextInt();
        Integer[] lotteryList = new Integer[num];
        List<Integer> lotteryArrayList = new ArrayList<>();
        Set<Integer> lotteryHashSet = new HashSet<>();

        // num에 잘못된 입력 범위를 입력했을 때, 경고 문구가 생기
        if(num >MAX_NUM){
            System.out.println("잘못된 범위입니다.");
            return;
        }

        // num 만큼 반복해서 중복되지 않는 랜덤 숫자가 배열 lotteryList에 들어감
        for(int i = 0; i < num; i++){
            int value = random.nextInt(MAX_NUM) +1;
            lotteryList[i] = value;
            for(int j = 0; j < i; j++){
                if(value == lotteryList[j]){
                    i -=1;
                    break;
                }
            }
        }

        //lotteryList 배열에 입력된 숫자는 입력된 순서대로 한 줄에 하나씩 출력
        for(int i = 0; i<num; i++){
            System.out.println(lotteryList[i]);
        }
        input.close();

    }
}
