package 프로그래머스;

public class 점프와_순간이동 {
    public int solution(int n) {
        int battery = 0;

        do {
            if (n % 2 == 0) n /= 2;
            else {
                n--;
                battery++;
            }
        } while (n != 0);

        return battery;
    }
}
