package 프로그래머스;

public class 햐샤드수 {
    public static void main(String[] args) {
        System.out.println(solution(11));
    }
    public static boolean solution(int x) {
        int sum = 0;
        int result = x;
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }

        return result % sum == 0;
    }
}
