package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2578 {
    static int[][] arr = new int[5][5];
    static int[][] host = new int[5][5];
    static int line = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 5; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            int n = st.countTokens();

            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < 5; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            int n = st.countTokens();

            for (int j = 0; j < n; j++) {
                host[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingo(host[i][j]);
                cnt++;
                check(arr);

                if (line == 3) {
                    System.out.println(cnt);
                    System.exit(0);
                }
            }
        }
    }

    static void bingo(int number) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (number == arr[i][j]) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    static int check(int[][] arr) {
        for (int i = 0; i < 5; i++) {
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 0) {
                    cnt ++;
                }
            }

            if (cnt == 5) {
                line ++;
            }
        }

//        for (int i = 0; i < 5; i++) {
//            int cnt = 0;
//            for (int j = 0; j < 5; j++) {
//                if (arr[i][j])
//            }
//        }
        return line;
    }
}
