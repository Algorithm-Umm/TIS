package 프로그래머스;

public class 음양_더하기 {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) sum += absolutes[i];
            else sum -= absolutes[i];
        }

        return sum;
    }
}
