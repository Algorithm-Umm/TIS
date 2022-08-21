package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class BOJ_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        System.out.println((int)Math.round((double)sum / N));

        Arrays.sort(arr);
        System.out.println(arr[arr.length/2]);

        ArrayList<Integer> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int cnt = 1;
            for (int j = i + 1; j < arr.length; j++) {

                if (Objects.equals(arr[i], arr[j])) {
                    cnt ++;
                }
            }

            if (cnt > max) {
                list.removeAll(list);
            }

            if (cnt >= max) {
                max = cnt;
                list.add(arr[i]);
            }

        }

        Collections.sort(list);

        if (list.size() == 1) {
            System.out.println(list.get(0));
        } else {
            System.out.println(list.get(1));
        }

        int size = arr[arr.length - 1] - arr[0];
        System.out.println(size);
    }
}
