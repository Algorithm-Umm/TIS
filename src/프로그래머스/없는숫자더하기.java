package 프로그래머스;

public class 없는숫자더하기 {
    public static int solution(int[] numbers) {
        boolean[] tf = new boolean[10];

        for (int i = 0; i < numbers.length; i++) {
            tf[numbers[i]] = true;
        }

        int sum = 0;
        for (int i = 0; i < tf.length; i++) {
            if (!tf[i]) {
                sum += i;
            }
        }

        return sum;
    }
}
