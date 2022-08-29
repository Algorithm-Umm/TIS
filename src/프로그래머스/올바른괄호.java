package 프로그래머스;

import java.util.Stack;

public class 올바른괄호 {
    public static void main(String[] args) {
        System.out.println(solution(")()("));
    }

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (stack.size() >= 1 && s.charAt(i) == ')' && stack.peek() == '(') {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }

        }

        System.out.println(stack);

        return stack.empty();
    }
}
