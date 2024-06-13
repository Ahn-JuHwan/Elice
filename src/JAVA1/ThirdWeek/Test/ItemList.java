package JAVA1.ThirdWeek.Test;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class ItemList {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int itemCount = scanner.nextInt(); //아이템 종류수
        int logCount = scanner.nextInt(); //액션 로그에 기록된 행동의 수
        scanner.nextLine();
        // TreeMap인 itemMap를 생성 TreeMap은 키를 알파벳 순서로 자동 정렬
        Map<String, Integer> itemMap = new TreeMap<>();

        for (int i = 0; i < logCount; i++) {
            // 입력받은 로그를 ” “로 분리하여 아이템 이름과 액션을 분리
            String[] log = scanner.nextLine().split(" ");
            String item = log[0];
            String action = log[1];

            // "acquire" 명령이면 해당 아이템의 개수를 1 증가시키고, "use" 명령이면 해당 아이템의 개수를 1 감소
            // itemMap.getOrDefault(item, 0) 아이템이 itemMap에 존재하지 않을 경우 기본값 0을 반환
            if (action.equals("acquire")) {
                itemMap.put(item, itemMap.getOrDefault(item, 0) + 1);
            } else if (action.equals("use")) {
                itemMap.put(item, itemMap.getOrDefault(item, 0) - 1);
            }
        }

        System.out.println(itemMap);


    }
}
