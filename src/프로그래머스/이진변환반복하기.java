package 프로그래머스;

import java.util.Arrays;
import java.util.Objects;

public class 이진변환반복하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("1111111")));
    }

    public static int[] solution(String s) {

        int cnt = 0;
        int total = 0;

        do {
            if (Objects.equals(s, "1")) break;

            cnt++;
            int zero = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    zero++;
                    total++;
                }
            }

            // 문자열에서 0을 제거한 상태
            StringBuilder sb = new StringBuilder();
            sb.append("1".repeat(Math.max(0, s.length() - zero)));

            int n = sb.toString().length();
            s = Integer.toBinaryString(n);
        } while (true);

        return new int[] {cnt, total};
    }
}
