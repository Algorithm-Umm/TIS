package 프로그래머스;

public class 콜라츠_추측 {
    public static void main(String[] args) {
        System.out.println("solution(626331) = " + solution(626331));
    }

    public static int solution(int num) {

        if (num == 1) return 0;
        long n = num;
        int cnt = 0;
        do {
            cnt++;
            if (n % 2 == 0) n /= 2;
            else n = n * 3 + 1;
            if (cnt == 500) {
                cnt = -1;
                break;
            }
        } while (n != 1);

        return cnt;
    }
}
