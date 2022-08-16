package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 거스름돈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());

        int cnt = 0;

        do {
            if (money >= 500) {
                money -= 500;
                cnt++;
            } else if (money >= 100) {
                money -= 100;
                cnt++;
            } else if (money >= 50) {
                money -= 50;
                cnt++;
            } else if (money >= 10) {
                money -= 10;
                cnt++;
            }

        } while (money != 0);

        System.out.println(cnt);
    }
}
