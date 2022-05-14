package 프로그래머스;

public class 시저_암호 {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        char[] ch = s.toCharArray();

        for(char c : ch) {
            if(c == 32) answer.append(" ");
            else {
                if(c <= 90) {
                    c += n;
                    if(c > 90) c -= 26;
                } else {
                    c += n;
                    if(c > 122) c -= 26;
                }
                answer.append(c);
            }
        }

        return answer.toString();
    }
}
