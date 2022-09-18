package 프로그래머스;

public class 부족한_금액_계산하기 {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += (long) price * i;
        }

        if (sum <= money) return 0;
        else return sum - money;

    }
}
