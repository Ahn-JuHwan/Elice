package JAVA1.ThirdWeek.SelfStudy.Tuesday.Stack;

import java.util.*;


public class parenthesis {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        System.out.println(solution(s));
    }


    public static boolean solution(String s) {

        Stack<String> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            //올바른 괄호일 경우 true
            if(c == '('){
                stack.push("(");
            }
            // 올바르지 않은 괄호일 경우 false 리턴
            if(c == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
