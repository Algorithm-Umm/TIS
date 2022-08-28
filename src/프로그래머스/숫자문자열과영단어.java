package 프로그래머스;

import java.util.*;

public class 숫자문자열과영단어 {

    public int solution(String s) {
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            System.out.println("sb.toString() = " + sb.toString());

            if (sb.toString().equals("zero") || sb.toString().equals("0")) {
                list.add(0);
                sb.setLength(0);
            } else if (sb.toString().equals("one") || sb.toString().equals("1")) {
                list.add(1);
                sb.setLength(0);
            } else if (sb.toString().equals("two") || sb.toString().equals("2")) {
                list.add(2);
                sb.setLength(0);
            } else if (sb.toString().equals("three") || sb.toString().equals("3")) {
                list.add(3);
                sb.setLength(0);
            } else if (sb.toString().equals("four") || sb.toString().equals("4")) {
                list.add(4);
                sb.setLength(0);
            } else if (sb.toString().equals("five") || sb.toString().equals("5")) {
                list.add(5);
                sb.setLength(0);
            } else if (sb.toString().equals("six") || sb.toString().equals("6")) {
                list.add(6);
                sb.setLength(0);
            } else if (sb.toString().equals("seven") || sb.toString().equals("7")) {
                list.add(7);
                sb.setLength(0);
            } else if (sb.toString().equals("eight") || sb.toString().equals("8")) {
                list.add(8);
                sb.setLength(0);
            } else if (sb.toString().equals("nine") || sb.toString().equals("9")) {
                list.add(9);
                sb.setLength(0);
            }
        }

        sb.setLength(0);
        for (int i : list) {
            sb.append(i);
        }

        int result = Integer.parseInt(sb.toString());
        return result;
    }
}
