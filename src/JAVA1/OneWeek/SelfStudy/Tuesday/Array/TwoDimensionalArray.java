package JAVA1.OneWeek.SelfStudy.Tuesday.Array;
public class TwoDimensionalArray {
    public static void main(String args[]) {

        int [][] data = new int[2][3];

        // 배열 data의 모든 값에 10
        for(int i=0; i<data.length;i++){
            for(int j=0; j<data[i].length;j++){
                data[i][j]=10;
            }
        }
        // data를 출력합니다.
        System.out.println("data[0] : " + "[" + data[0][0] + ", " + data[0][1] + ", " + data[0][2] + "]");
        System.out.println("data[1] : " + "[" + data[1][0] + ", " + data[1][1] + ", " + data[1][2] + "]");
    }
}
