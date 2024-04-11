package JAVA1.OneWeek.SelfStudy.Tuesday.DataTypes;

public class IncreaseOperators {
    public static void main(String args[]) {
        int num = 5;

        // value에 값을 대입한 뒤에 num이 1 증가합니다.
        int result = num++;

        System.out.println("num : " + num);
        System.out.println("result : " + result);



        num = 5;

        // 먼저 num이 1 증가하고 그 뒤에 value에 값을 대입합니다.
        int result2 = ++num;

        System.out.println("num : " + num);
        System.out.println("result2 : " + result2);
    }
}
