package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_14916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        do {
            if (n % 5 == 0) {
                break;
            }

            if (n == 1 || n == 3) {
                System.out.println(-1);
                System.exit(0);
                break;
            }

            n -= 2;
            cnt ++;
        } while (n % 5 != 0);

        cnt += (n/5);
        System.out.println(cnt);
    }
}
