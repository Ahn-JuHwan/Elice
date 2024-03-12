package JAVA1.SelfStudy.Tuesday.Array;

public class ArrayLength {
    public static void main(String args[]) {
        int [] iArray = {1, 2, 3, 4, 5, 4, 3, 5, 4, 2, 3, 5, 4, 6, 2, 7, 1, 2, 7, 3, 9, 8, 5, 9, 4, 7, 6, 8, 4};

        // length를 이용해 배열 iArray의 길이를 출력
        System.out.println("iArray의 길이 : " +  iArray.length          );

        // iArray의 마지막 값을 length를 이용하여 출력
        System.out.println("iArray의 마지막 값 : " +    iArray[iArray.length-1]         );
    }
}
