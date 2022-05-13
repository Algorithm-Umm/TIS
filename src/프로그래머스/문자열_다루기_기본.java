package 프로그래머스;

public class 문자열_다루기_기본 {
    public boolean solution(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < 48 || 57 < s.charAt(i)) return false;
        }

        return 4 == s.length() || s.length() == 6;
    }
}
