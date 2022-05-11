package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double N = Integer.parseInt(br.readLine());

        int quarterCnt = 0;
        int dimeCnt = 0;
        int nickelCnt = 0;
        int pennyCnt = 0;
        for (int i = 0; i < N; i++) {
            double M = Integer.parseInt(br.readLine());

            M /= 100;

            quarterCnt = quarter(M); // quarterCnt = 4;
            M %= 0.25; // M = 0.24
            M = Double.parseDouble(String.format("%.2f", M));

            dimeCnt = dime(M);
            M %= 0.1; // M = 0.04
            M = Double.parseDouble(String.format("%.2f", M));

            nickelCnt = nickel(M);
            M %= 0.05; // M = 0.04
            M = Double.parseDouble(String.format("%.2f", M));

            pennyCnt = penny(M);
            M %= 0.01;
            M = Double.parseDouble(String.format("%.2f", M));

            System.out.println(quarterCnt + " " + dimeCnt + " " + nickelCnt + " " + pennyCnt);

        }

    }

    public static int quarter(double M) {
        return (int) (M / 0.25); // return 4;
    }

    public static int dime(double M) {
        return (int) (M / 0.1);
    }

    public static int nickel(double M) {
        return (int) (M / 0.05);
    }

    public static int penny(double M) {
        return (int) (M / 0.01);
    }
}
