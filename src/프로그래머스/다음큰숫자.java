package 프로그래머스;

public class 다음큰숫자 {
    public int solution(int n) {
        String binaryString = Integer.toBinaryString(n);
        int one = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') one++;
        }

        int cnt = n;
        do {
            cnt++;
            int etc = 0;
            String s = Integer.toBinaryString(cnt);

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') etc++;
            }

            if (one == etc) {
                break;
            }
        } while (true);

        return cnt;
    }
}
