package JAVA1.TwoWeek.Leacture.Wednesday;

import java.util.StringTokenizer;

public class LogAnalyze {
    public static void main(String[] args) {
        String complexLog = "UserActivity;user1;login, SystemAlert;Memory;Critical, UserActivity;user2;logout";

        // 먼저 로그 문자열을 쉼표 기준으로 분리
        StringTokenizer logItems = new StringTokenizer(complexLog, ", ");

        System.out.println("활동 로그:");

        // 각 항목을 더 분석하기 위해 세미 콜론을 기준으로 다시 분리
        while(logItems.hasMoreTokens()){

            String s = logItems.nextToken();

            StringTokenizer logs = new StringTokenizer(s,";");

            String log= logs.nextToken();

            //사용자 활동 로그는 “UserActivity”로 시작
            if(log.equals("UserActivity")){
                System.out.println("- Username: "+logs.nextToken()+", Action: "+logs.nextToken() );
            }
            //시스템 로그는 “SystemAlert”로 시작
            if(log.equals("SystemAlert")){
                System.out.println("- Component: "+ logs.nextToken() + ", Status: " + logs.nextToken());

            }

        }
    }
}
