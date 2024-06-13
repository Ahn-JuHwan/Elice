package JAVA1.ThirdWeek.Test;

import java.util.LinkedList;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 아이템 종류와 쇼핑 이벤트의 수를 입력받음
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        // LinkedList인 shoppingList를 생성
        LinkedList<String> shoppingList = new LinkedList<>();

        // 이벤트 수 만큼 반복
        // "add"명령이면 명령어 뒤의 아이템 이름을 추출하여 shoppingList에 추가, "remove"명령이면 shoppingList의 마지막 요소를 삭제
        for (int i = 0; i < m; i++) {
            String command = scanner.nextLine();
            //  입력받은 명령이 “add”로 시작하는지 검사
            if (command.startsWith("add")) {
                //  아이템을 shoppingList의 맨 뒤에 추가합니다.
                // "add" 명령어 뒤의 아이템 이름을 추출
                shoppingList.add(command.split(" ")[1]);
            }
            // 입력받은 명령이 “remove”인지 검사
            else if (command.equals("remove")) {
                if (!shoppingList.isEmpty()) {
                    // shoppingList의 마지막 요소를 삭제
                    shoppingList.removeLast();
                }
            }
        }
        for (String item : shoppingList) {
            System.out.println(item);
        }
    }
}