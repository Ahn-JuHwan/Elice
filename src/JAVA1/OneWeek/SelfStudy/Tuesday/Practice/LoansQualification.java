package JAVA1.OneWeek.SelfStudy.Tuesday.Practice;
import java.util.Scanner;
public class LoansQualification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 신청자의 성인 여부를 나타내는 boolean 변수 isAdult 를 선언 후 입력 받음
        boolean isAdult = scanner.nextBoolean();

        // 신청자의 월 수입을 나타내는 double 변수 monthlyIncome 를 선언하고 사용자로부터 입력받음
        double monthlyIncome = scanner.nextDouble();

        // 신청자의 신용 점수를 나타내는 int 변수 creditScore 를 선언하고 사용자로부터 입력받음
        int creditScore = scanner.nextInt();

        // 비교 연산자를 사용하여 앞서 입력 받은 조건들을 boolean 조건으로 출력
        System.out.println("성인 여부: " + isAdult);
        System.out.println("월 수입이 기준치 이상인가요? " + (monthlyIncome >= 170));
        System.out.println("신용 점수가 기준치 이상인가요? " + (creditScore >= 650));

        // 대출 승인 가능 여부를 계산합니다.
        boolean isApproved;
        isApproved = isAdult && monthlyIncome>=170 && creditScore>=650;
        System.out.println("대출 승인 가능 여부: " + isApproved);
    }
}
