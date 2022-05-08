package 프로그래머스;

import java.util.Arrays;

public class x만_간격이있는_n개의숫자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
    }
    public static long[] solution(int x, int n) {
        long[] arr = new long[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = (long) x * i;
        }

        return arr;
    }
}
