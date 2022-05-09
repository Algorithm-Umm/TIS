package 프로그래머스;

public class 평균구하기 {
    public double solution(int[] arr) {
        double sum = 0;

        for (int n : arr) {
            sum += n;
        }

        return sum / arr.length;
    }
}
