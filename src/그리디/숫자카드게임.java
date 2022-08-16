package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 숫자카드게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        StringTokenizer st1 = new StringTokenizer(s1, " ");

        int N = Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i ++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");

            for (int j = 0; j < M; j ++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i ++) {

            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;

            for (int j = 0; j < M; j ++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }

            if (min > max) {
                max = min;
            }

        }

        System.out.println(max);
    }
}
