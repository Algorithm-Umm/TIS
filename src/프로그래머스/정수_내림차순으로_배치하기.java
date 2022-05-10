package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;

public class 정수_내림차순으로_배치하기 {
    public long solution(long n) {
        ArrayList<Long> list = new ArrayList<>();
        while (n != 0) {
            list.add(n % 10);
            n /= 10;
        }

        Collections.sort(list, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (long i : list) {
            sb.append(i);
        }

        return Long.parseLong(sb.toString());
    }
}
