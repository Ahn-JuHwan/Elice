package JAVA1.ThirdWeek.Leacture.Monday;


import java.util.*;

public class Login {public static void main(String args[]) {
    // 채점을 위한 코드이므로 수정하지 말아주세요.
    Scanner scanner = new Scanner(System.in);


    Map<String, String> loginInfo = new HashMap<>();
    //더미 데이터
    loginInfo.put("abc", "abc123");
    loginInfo.put("elice", "1234");
    loginInfo.put("cheshire", "erihsehc");

    // 아이디(id)와 비밀번호(pw)를 입력받음
    String id = scanner.nextLine();
    String pw = scanner.nextLine();

    //아이디가 loginInfo의 키로 존재하는지 확인
    if(!loginInfo.containsKey(id)){
        System.out.println("회원가입이 필요합니다.");
    }

    //존재하는 경우, 비밀번호가 값과 일치하는지 확인
    else{
        String savePW = loginInfo.get(id);
        if(Objects.equals(savePW,pw)){
            System.out.println("로그인에 성공했습니다.");
        }
        else{
            System.out.println("비밀번호가 틀렸습니다.");
        }
    }
}

}
