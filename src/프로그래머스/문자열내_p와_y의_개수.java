package 프로그래머스;

public class 문자열내_p와_y의_개수 {
    boolean solution(String s) {
        int p = 0;
        int y = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') p++;
            if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') y++;
        }

        return p == y;
    }
}
