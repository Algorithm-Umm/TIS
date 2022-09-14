package 프로그래머스;

import java.util.ArrayList;

public class 핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        ArrayList<Character> list = new ArrayList<>();

        for (int i = 0; i < phone_number.length(); i++) {
            list.add(phone_number.charAt(i));
        }

        for (int i = 0; i < phone_number.length() - 4; i++) {
            list.set(i, '*');
        }

        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }

        return sb.toString();
    }
}
