package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;

public class 문자열_내림차순으로_정렬하기 {
    public String solution(String s) {

        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }

        return sb.toString();
    }
}
