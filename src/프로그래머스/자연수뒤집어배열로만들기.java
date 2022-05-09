package 프로그래머스;

import java.util.ArrayList;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add((int) (n % 10));
            n /= 10;
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
