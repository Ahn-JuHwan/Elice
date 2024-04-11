package JAVA1.OneWeek.SelfStudy.Tuesday.DataTypes;

public class dataTypeConversion {
    public static void main(String args[]) {
        // 정수형 자료를 실수형으로 변환
        int height = 20;
        double weight;
        weight = height;

        System.out.println(weight);

        // 실수형 자료를 정수형으로 변환
        weight = 33.5;
        height = 0;

        height = (int)weight;

        System.out.println(height);
    }
}
