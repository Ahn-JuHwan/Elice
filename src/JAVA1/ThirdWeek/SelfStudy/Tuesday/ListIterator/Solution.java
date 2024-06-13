package JAVA1.ThirdWeek.SelfStudy.Tuesday.ListIterator;

import java.util.ListIterator;

class Solution {

    public static void solution(ListIterator<Integer> iterator) {
        int prv =0;
        int count =0;

        //처음 입력받은 높이를 기준으로 오르막 갯수 셈
        while(iterator.hasNext()){
            int cur =iterator.next();

            if(prv<cur){
                count++;
            }
            prv=cur;

        }
        System.out.println(count);
    }

    private Solution() {}
}
