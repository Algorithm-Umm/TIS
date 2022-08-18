package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1051 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j) - '0';
            }

        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < M; j++) {

                boolean b = false;
                int cnt = 0;
                int resister = 0;
                int flag;
                int right;
                int under;
                int diagonal;

                do {
                    flag = arr[i][j];
                    right = arr[i][j + cnt];
                    under = arr[i + cnt][j];
                    diagonal = arr[i + cnt][j + cnt];

                    if (flag == right && flag == under && flag == diagonal && cnt != 0) {
                        b = true;
                        resister = cnt;
                    }

                    cnt ++;
                    if (i + cnt == N || j + cnt == M) {
                        if (!b) {
                            cnt = 1;
                        }
                        resister ++;
                        break;
                    }

                } while (true);

                if (max < resister) {
                    max = resister;
                }
            }
        }

        System.out.println(max * max);
    }
}
