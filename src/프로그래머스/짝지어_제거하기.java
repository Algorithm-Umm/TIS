package 프로그래머스;

import java.util.Stack;

public class 짝지어_제거하기 {
    public static void main(String[] args) {
        System.out.println("solution = " + solution("baabaa"));
    }
    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) stack.pop();
            else stack.push(s.charAt(i));
        }

        System.out.println("stack = " + stack);

        if (stack.isEmpty()) return 1;
        else return 0;
    }
}
