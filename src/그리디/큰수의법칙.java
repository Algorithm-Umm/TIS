package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 큰수의법칙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[N];

        String s1 = br.readLine();

        for (int i = 0; i < N; i++) {
            StringTokenizer st1 = new StringTokenizer(s1, " ");
            int tokens = st1.countTokens();

            for (int j = 0; j < tokens; j++) {
                arr[j] = Integer.parseInt(st1.nextToken());
            }

        }

        Arrays.sort(arr, Collections.reverseOrder());

        int sum = 0;
        int count = 0;
        do {
            for (int i = 0; i < K; i ++) {
                sum += arr[0];
                count ++;
            }

            sum += arr[1];
            count ++;
        } while(count != M);

        System.out.println(sum);
    }
}
