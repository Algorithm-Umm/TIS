package 프로그래머스;
public class 약수의합 {
    public static void main(String[] args) {
        System.out.println(solution(16));
    }
    public static int solution(int n) {
        int sum = 0;
        int number = 0;
        do {
            number++;
            if (n % number == 0) {
                sum += number;
                System.out.println("number = " + number);
                System.out.println("sum = " + sum);
            }
        } while (number <= n);

        return sum;
    }
}
