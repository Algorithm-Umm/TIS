package 프로그래머스;

public class 가운데_글자_가져오기 {
    public String solution(String s) {
        if (s.length() % 2 == 1) {
            return String.valueOf(s.charAt(s.length() / 2));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(s.length()/2 - 1)).append(s.charAt(s.length()/2));
            return sb.toString();
        }
    }
}
