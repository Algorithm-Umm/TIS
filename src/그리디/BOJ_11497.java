package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_11497 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(br.readLine());
            int[] arr = new int[A];

            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            int tokens = st.countTokens();

            for (int j = 0; j < tokens; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int[] result = new int[arr.length];

            int plus = 0;
            int minus = 1;

            for (int j = 0; j < result.length; j++) {
                if (j % 2 == 0) {
                    result[plus] = arr[j];
                    plus++;
                } else {
                    result[result.length - minus] = arr[j];
                    minus++;
                }

            }

            int max = Integer.MIN_VALUE;
            for (int j = 0; j < result.length; j++) {
                if (j == result.length - 1) {
                    System.out.println(max);
                    break;
                }

                int abs = Math.abs(result[j] - result[j + 1]);

                if (abs > max) {
                    max = abs;
                }
                
            }
        }
    }
}
