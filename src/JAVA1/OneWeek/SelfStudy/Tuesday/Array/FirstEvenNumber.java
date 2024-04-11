package JAVA1.OneWeek.SelfStudy.Tuesday.Array;

public class FirstEvenNumber {
    public static void main(String args[]) {
        int[] iArray = new int[] {1, 5, 3, 43, 31, 65, 8865, 243, 7743, 13245, 9541, 375, 142, 3645, 8357, 2734, 6845, 184835, 2, 1};

        // if문을 사용하여 배열 값에서 짝수를 찾았다면 그 수를 출력하고 반복문을 멈춤
        for (int i = 0; i < iArray.length; i++) {
            if(iArray[i]%2==0){
                System.out.println(iArray[i]);
                break;
            }




        }
    }
}
