package 프로그래머스;

import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int cnt = 0;
        for (int j : d) {
            if (budget < j || budget <= 0) break;
            cnt++;
            budget -= j;
        }

        return cnt;
    }
}
