package 프로그래머스;

public class 두_정수_사이의_합 {
    public static void main(String[] args) {
        System.out.println("solution(5, 3) = " + solution(5, 3));
    }

    public static long solution(int a, int b) {
        long sum = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return sum;
    }
}
