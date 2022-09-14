package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        int[] arr = new int[] {5, 9, 7, 10};
        System.out.println(Arrays.toString(solution(arr, 5)));
    }

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);

        for (int n : arr) {
            if (n % divisor == 0) list.add(n);
        }

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        if (array.length == 0) {
            return new int[]{-1};
        } else {
            return array;
        }
    }
}
