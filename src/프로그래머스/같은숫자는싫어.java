package 프로그래머스;

import java.util.Stack;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                stack.push(arr[i]);
            } else if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];

        int cnt = 0;
        for (int i : stack) {
            answer[cnt] = i;
            cnt ++;
        }

        return answer;
    }
}
