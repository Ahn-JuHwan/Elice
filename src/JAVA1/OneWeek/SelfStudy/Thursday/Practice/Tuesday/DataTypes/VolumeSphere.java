package JAVA1.OneWeek.SelfStudy.Thursday.Practice.Tuesday.DataTypes;

public class VolumeSphere {
    public static void main(String args[]) {
        // 반지름을 저장하는 변수입니다.
        int radius = 10;

        // 원주율을 나타내는 상수입니다. 변경될 일이 없으므로 상수로 선언하였습니다.
        final double PI = 3.141592;


        double volume = radius*radius*radius*PI*4/3 ;

        System.out.println(volume);

        // 반지름을 변경하였습니다.
        radius = 20;


        volume =radius*radius*radius*PI*4/3 ;

        System.out.println(volume);
    }
}
