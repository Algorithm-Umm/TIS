package 프로그래머스;

public class 예상대진표 {
    public static void main(String[] args) {
        System.out.println(solution(8, 4, 7));
    }

    public static int solution(int n, int a, int b) {
        int round = 0;
        do {
            a = a / 2 + a % 2; // 4 2 1
            b = b / 2 + b % 2; // 7 4 2 1

            round++;
        } while (a != b);
        return round;
    }
}
