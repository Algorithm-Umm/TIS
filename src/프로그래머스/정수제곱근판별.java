package 프로그래머스;

public class 정수제곱근판별 {
    public static long solution(long n) {
        double sqrt = Math.sqrt(n);
        if (sqrt % 1 == 0) return (long) Math.pow(sqrt + 1, 2);
        else return -1;
    }
}
