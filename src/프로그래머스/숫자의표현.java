package 프로그래머스;

public class 숫자의표현 {
    public static void main(String[] args) {
        System.out.println("solution(15) = " + solution(15));
    }

    public static int solution(int n) {
        int cnt = 1;

        for (int i = 1; i <= n; i++) {
            int sum = i;

            if (i == n / 2 + 1) break;

            for (int j = i + 1; j <= n; j++) {
                sum += j;

                if (sum > n) {
                    break;
                }

                if (sum == n) {
                    cnt++;
                    break;
                }

            }
        }

        return cnt;
    }
}
