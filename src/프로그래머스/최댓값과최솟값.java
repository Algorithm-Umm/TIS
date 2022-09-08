package 프로그래머스;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class 최댓값과최솟값 {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s, " ");
        ArrayList<Integer> list = new ArrayList<>();
        int count = st.countTokens();

        for (int i = 0; i < count; i++) {
            list.add(Integer.valueOf(st.nextToken()));
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : list) {
            if (i < min) min = i;
        }

        for (int i : list) {
            if (i > max) max = i;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);

        return sb.toString();
    }
}
