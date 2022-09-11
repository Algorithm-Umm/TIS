package 프로그래머스;

public class 자릿수_더하기 {
    public int solution(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
